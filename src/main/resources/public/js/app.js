angular.module('application', []).controller('home', function ($scope, $http) {

    $http.get('/mensagem').success(function (data) {
        $scope.mensagem = data;
    })

});