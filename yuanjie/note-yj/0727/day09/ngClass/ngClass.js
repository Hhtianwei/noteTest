var app = angular.module('myapp',[]);
app.controller('myCtrl',function($scope){
	$scope.message="你看不到我";
	$scope.isErr=false;
	$scope.isWarn=false;
	
	$scope.show1=function(){
		$scope.message="敢不敢再错一点";
		$scope.isErr=true;
		$scope.isWarn=false;
	}
	
	$scope.show2=function(){
		$scope.message="警告你一次，不能再犯了";
		$scope.isErr=true;
		$scope.isWarn=true;
	}
});