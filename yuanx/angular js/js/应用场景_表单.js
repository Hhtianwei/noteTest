//定义模块
var app=angular.module('myapp',[]);
//创建控制器
app.controller('myCtrl',function($scope){
	//变量的定义
	$scope.email="12345@qq.com";
	$scope.password="888888";
	//方法的定义:show()
	$scope.show=function(){
		$scope.password="666666";
	}
});