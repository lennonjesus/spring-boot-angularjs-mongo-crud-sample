angular.module('application', []).controller('MensagemController', function ($scope, $http) {

    this.salvar = function () {
        $http.post('/mensagem', $scope.mensagem).success(function (data) {
            console.log("Salvou!");
        });

        $scope.mensagem = '';
        this.listar();
    }

    this.listar = function () {
        this.mensagens = $http.get('/mensagem').success(function (data) {
            $scope.mensagens = data;
        });
    }

    this.listar();


});