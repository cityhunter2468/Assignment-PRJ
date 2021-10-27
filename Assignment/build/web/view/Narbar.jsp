<%-- 
    Document   : Narbar
    Created on : Oct 18, 2021, 11:44:07 PM
    Author     : levan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.6.0/font/bootstrap-icons.css" >
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styleNarbar.css" />
    </head>

    <body>
        <div> <nav class="navbar navbar-expand-lg all ">
                <a class="navbar-brand tag-home" href="${pageContext.request.contextPath}/home">SocialBook</a>


                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><i class="bi bi-search"></i></button>
                    </form>
                    <ul class="navbar-nav mr-auto menu">
                        <li class="nav-item active icons">
                            <a class="nav-link" href="${pageContext.request.contextPath}/home"><i class="bi bi-bank"></i><span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item icons">
                            <a class="nav-link" href="#"><i class="bi bi-people"></i></a>
                        </li>
                        <li class="nav-item icons">
                            <a class="nav-link" href="#"><i class="bi bi-bell"></i></a>
                        </li>
                        <li class="nav-item icons">
                            <a class="nav-link" href="${pageContext.request.contextPath}/upload"><i class="bi bi-cloud-upload"></i></a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                ${sessionScope.account.displayname}
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/profile/view"><i class="bi bi-file-person"></i>  View Profile</a>
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/profile/edit"><i class="bi bi-file-earmark"></i> Edit Profile</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#"><i class="bi bi-file-earmark-lock"></i> Change Password </a>
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/logout"><i class="bi bi-door-open"></i> Logout </a>
                            </div>
                        </li>

                    </ul>

                </div>
                <button class="navbar-toggler btn btn-outline-success" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="bi bi-list"></i>
                </button>
            </nav>
        </div>


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>


        <script src="<c:url value="script/script_Narbar.js" />"></script>
    </body>
</html>
