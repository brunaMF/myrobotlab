#!/bin/bash

# Diretório onde estão localizadas as classes de teste
TEST_DIR="./evosuite-tests"

# Comando a ser executado para cada classe de teste
COMMAND="sudo java --add-opens java.desktop/java.awt=ALL-UNNAMED -cp .:$HOME/dados_evosuite_myrobotlab/myrobotlab/target/classes:$HOME/dados_evosuite_myrobotlab/myrobotlab/evosuite-tests-compiled:$HOME/dados_evosuite_myrobotlab/myrobotlab/evosuite/master/target/evosuite-master-1.2.1-SNAPSHOT.jar:$HOME/Tutorial_Stack/target/dependency/junit-4.12.jar org.junit.runner.JUnitCore"

# Arquivo para salvar a saída dos comandos
LOG_FILE="test_results.log"
# Arquivo para salvar os nomes das classes com falhas
FAILURE_FILE="failures.log"

# Cria ou limpa os arquivos de log
> "$LOG_FILE"
> "$FAILURE_FILE"

# Variável para contar os testes OK
tests_ok=0
# Variável para contar o total de testes
total_tests=0

# Loop recursivo para percorrer todas as classes de teste
for file in $(find "$TEST_DIR" -type f -name '*.java'); do
    # Verifica se o nome do arquivo contém a palavra "scaffolding"
    if [[ "$file" == *scaffolding* ]]; then
        continue  # Pula o arquivo se contiver "scaffolding" no nome
    fi

    # Extrai o caminho relativo da classe de teste
    relative_path="${file#$TEST_DIR/}"
    # Remove a extensão .java do nome do arquivo
    class_name="${relative_path%.java}"
    # Substitui '/' por '.' para obter o nome do pacote completo
    class_name="${class_name//\//.}"

    # Executa o comando para a classe de teste
    $COMMAND "$class_name" >> "$LOG_FILE" 2>&1
    
    # Verifica se o teste foi bem-sucedido (exit code 0)
    if [ $? -eq 0 ]; then
        ((tests_ok++))
    else
        echo "$class_name" >> "$FAILURE_FILE"  # Registra o nome da classe com falha
    fi
done

# Extrai a quantidade de testes do arquivo de log e incrementa no total de testes
total_tests=$(grep -a -o 'OK ([0-9]\+ test[s]*' "$LOG_FILE" | sed 's/OK (\([0-9]\+\) test[s]*.*/\1/' | paste -sd+ - | bc)

echo "Quantidade de classes OK: $tests_ok"
echo "Classes com falhas:"
cat "$FAILURE_FILE"
echo "Total de testes executados: $total_tests"

