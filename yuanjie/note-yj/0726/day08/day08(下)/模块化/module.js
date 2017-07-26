//js文件中的module名称与页面上的ng-app的值一致
//angular.module(name,[requires]),第一个参数是module的名称,[]是依赖注入的其他模块
//name：模块的名称，字符串变量。
//requires:包含了一个字符串变量组成的列表，每个元素都是一个模块名称，本模块依赖于这些模块，依赖需要在本模块加载之前由注入器进行预加载。

//所有依赖注入的东西都需要用字符串--->用引号的方式注入进去
var app=angular.module('myapp',['myapp2']);//主模块

//定义一个控制器 
//第一种写法
app.controller('myCtl',['$scope',function($scope){
	$scope.name="张二狗";
}]);

/*//第二种写法
app.controller('myCtl',function($scope){
	$scope.name="张二狗";
});*/

//链式调用,定义第二个module,注入的模块
angular.module('myapp2',[])
.controller('myCrl2',function($scope){
	$scope.age=1;
})
.controller('myCrl2_1',function($scope){
	$scope.eye="灰色";
})