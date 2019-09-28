angular.module('mrlapp.views').controller('tabsViewCtrl', ['$scope', '$log', '$filter', '$timeout', 'mrl', 'panelSvc', '$state', function($scope, $log, $filter, $timeout, mrl, panelSvc, $state) {
    $log.info('tabsViewCtrl');

    var isUndefinedOrNull = function(val) {
        return angular.isUndefined(val) || val === null;
    };

    $scope.view_tab = 'default';

    $scope.updateServiceData = function() {
        //get an updated / fresh servicedata & convert it to json
        var servicedata = mrl.getService($scope.view_tab);
        $scope.servicedatajson = JSON.stringify(servicedata, null, 2);
    }

    $scope.getName = function(panel) {
        return panel.name;
    }

    //service-panels & update-routine
    var panelsUpdated = function(panels) {
        $scope.panels = panels;
        $timeout(function() {
            $scope.panels = $filter('panellist')($scope.panels, 'main');

            // $log.info('panels-main', $scope.panels);
            if ($scope.view_tab == 'default' && !isUndefinedOrNull($scope.panels) && !isUndefinedOrNull($scope.panels[0])) {
                $scope.view_tab = $scope.panels[0].name;
            }
        });
    };
    panelsUpdated(panelSvc.getPanelsList());
    panelSvc.subscribeToUpdates(panelsUpdated);

    $scope.changeTab = function(tab) {
        $scope.view_tab = tab;
    }
    ;
}
]);
