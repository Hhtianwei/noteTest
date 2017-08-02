var app = angular.module('todoList',[]);
app.controller('todoListCtrl',function($scope){
	$scope.task='';
	$scope.tasks=[];
	$scope.add=function(){
		$scope.tasks.push($scope.task);
	}
})