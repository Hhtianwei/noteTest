function hello($scope){
	//定义变量
	$scope.username="zhangergou";
	//定义对象
	$scope.greeting={
		name:"赵四",
		age:40
	}
	$scope.sayHi=function(){
		alert("你好");
	}
}
