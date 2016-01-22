<%-- 
    Document   : index
    Created on : Jan 2, 2009, 1:51:11 PM
    Author     : Bishal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRM</title>
        <link rel="stylesheet" href="${SITE_URL}/static/bootstrap/css/bootstrap.min.css">
        
        <script src="${SITE_URL}/static/angular/js/angular.min.js"></script>
        <script src="${SITE_URL}/static/angular/js/angular-route.min.js"></script>
        <script src="${SITE_URL}/static/angular/js/jquery.min.js"></script>
    </head>
    <body ng-app="crm">
        <div class="container">
            <nav class="navbar navbar-default">
              <div class="container-fluid">
                <div class="navbar-header">
                  <a class="navbar-brand" href="#">
                   CRM Project
                  </a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                  <ul class="nav navbar-nav">
                      <li><a href="#/">Home</a></li>
                        <li><a href=""></a></li>
                  </ul>
                </div>
              </div>
            </nav>            