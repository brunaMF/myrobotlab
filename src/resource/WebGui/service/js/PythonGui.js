angular.module('mrlapp.service.PythonGui', [])
.controller('PythonGuiCtrl', ['$log', '$scope', 'mrl', '$timeout', function($log, $scope, mrl, $timeout) {
    $log.info('PythonGuiCtrl');
    _self = this;
    var msg = this.msg;
    
    // The all powerful name !
    var name = $scope.name;
    
    // init scope values
    $scope.output = '';
    $scope.currentScript = {
        name: 'untitled',
        code: ''
    };
    
    $scope.activeScriptIndex = 0;

    $scope.scripts = [];
    $scope.scripts.push($scope.currentScript);
    
    
    // the awesome ace editor 1
    $scope.editor = null ;
    
    // This method recieves a updated service 
    // whenever {service}.broadcastState() is called
    // Typically this is called when you know the service
    // internal state has changed - and you want to broadcast
    // the information to all listeners.
    // Sometimes the service itself will call broadcast state
    // when there has been an important state change.
    // For example the Serial service calls broadcast state when
    // it connects or disconnects from a serial port
    // FIXME - framework level update of mrl's registry
    this.updateState = function(service) {
        // this is where we update all gui components through the scope
        // which will show on the html service body
        $scope.service = service;
        // TODO make something like "script"
        $scope.editor.setValue(service.currentScript.code);
        $scope.currentScript = service.currentScript; 
    }
    ;
    
    this.onMsg = function(msg) {
        switch (msg.method) {
            // FIXME - bury it ?
        case 'onState':
            // its important to externalize the updating
            // of the service body in a method rather than doing the 
            // updates inline here - because when things are first initialized
            // we want to call the same method - and if it was inline that
            // would make a mess
            _self.updateState(msg.data[0]);
            $scope.$apply();
            break;
        case 'onStdOut':
            $scope.output = $scope.output + msg.data[0];
            $scope.$apply();
            break;
        default:
            $log.error("ERROR - unhandled method " + msg.method);
            break;
        }
    }
    ;
    
    // utility methods //
    // gets script name from full path name
    $scope.getName = function(path) {
        if (path.indexOf("/") >= 0) {
            return ( path.split("/").pop()) ;
        }
        if (path.indexOf("\\") >= 0) {
            return ( path.split("\\").pop()) ;
        }
        return path;
    }
    
    ////// ace editor related callbacks begin ///////
    $scope.aceLoaded = function(e) {
        $log.info("ace loaded");
        // Options
        $scope.editor = e;
        //editor.setReadOnly(true);
    }
    ;
    
    $scope.aceChanged = function(e) {
        $log.info("ace changed");
        //
    }
    
    $scope.addScript = function() {
        var newScript = {
            name: 'Script ' + ($scope.scripts.length + 1),
            code: ''
        };
        $scope.scripts.push(newScript);
        $timeout(function() {
            $scope.activeScriptIndex = ($scope.scripts.length - 1);
        });
        console.log($scope.activeScriptIndex);
    }
    ;
    
    $scope.exec = function() {
        $log.info('here');
        $scope.activeScriptIndex;
        $log.info($scope.scripts);
        $scope.editor.getValue();
        msg.send('exec', $scope.editor.getValue());
    }
    
    // now you can subscribe to the methods you want
    msg.subscribe('publishStdOut');
    
    // or send control commands
    msg.send("attachPythonConsole");
    
    // The last thing needed is
    // subscriptions for the framework for this controller
    // it will also process a variety of calls and connect
    // the route for several callbacks
    
    // One of the callbacks is a method generator
    // it calls getMethodMap on the service
    // the the callback comes back the data in the MethodMap
    // has enough information to dynamically build js methods
    // and attach them to scope. 
    
    // Here is some example html.
    // preface: the Java Python Service has a method Python.loadScriptFromFile(String filename), which loads
    // a file from the directory mrl is running from.  
    // The "ONLY" code needed is ng-click="msg.loadScriptFromFile('test.py') ! 
    // <button type="button" class="btn btn-default" ng-click="msg.loadScriptFromFile('test.py')">
    
    msg.subscribe(this);
}
]);
