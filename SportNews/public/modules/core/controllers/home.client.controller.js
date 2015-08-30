'use strict';


angular.module('core').controller('HomeController', ['$scope', 'Authentication',
    function ($scope, Authentication) {
        // This provides Authentication context.
        $scope.authentication = Authentication;

        $scope.alerts = [
            {
                icon: 'glyphicon-user',
                colour: 'btn-success',
                total: '20,409',
                description: 'TOTAL CUSTOMERS'
            },
            {
                icon: 'glyphicon-calendar',
                colour: 'btn-primary',
                total: '28,409',
                description: 'UPCOMING EVENTS'
            },
            {
                icon: 'glyphicon-edit',
                colour: 'btn-success',
                total: '20,409',
                description: 'NEW CUSTOMERS'
            },
            {
                icon:'glyphicon-record',
                colour: 'btn-info',
                total: '20,409',
                description: 'TOTAL CUSTOMERS'
            },
            {
                icon:'glyphicon-eye-open',
                colour: 'btn-warning',
                total: '20,409',
                description: 'TOTAL CUSTOMERS'
            },
            {
                icon:'glyphicon-flag',
                colour: 'btn-danger',
                total: '20,409',
                description: 'TOTAL CUSTOMERS'
            }
        ];

    }
]);
