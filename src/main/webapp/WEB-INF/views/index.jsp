<%@include file="header.jsp" %>

<div ng-controller="HomeController">
    <h1>{{title}}</h1>
</div>
<div ng-controller="CategoryController">
    <table class="table table-bordered table-striped table-hover">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>description</th>
        </tr>
        <tr ng-repeat="c in data">
            <td>{{c.catId}}</td>
            <td>{{c.catName}}</td>
            <td>{{c.description}}</td>
        </tr>
    </table>
</div>

<script>    
    var app = angular.module("crm",[]);
    app.controller("HomeController",function($scope){
       $scope.title="Categories"; 
    });
    app.controller("CategoryController",function($scope,$http){
        $http.get("http://localhost:8080/CustomerRM/api/category").success(function(response){
            $scope.data = response;
        });
    });    
</script>

<%@include file="footer.jsp" %>