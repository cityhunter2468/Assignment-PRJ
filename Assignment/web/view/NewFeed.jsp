<%-- 
    Document   : NewFeed
    Created on : Oct 17, 2021, 10:43:23 PM
    Author     : levan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/styleNewFeed.css" rel="stylesheet">

    </head>
    <jsp:include page="Narbar.jsp"></jsp:include>
    <body>

        <main>
            <div class="container">
               
            <c:forEach items="${requestScope.posts}" var="post">
                 <div class="status-field-container write-post-container">
                    <div class="user-profile-box">
                        <div class="user-profile">
                            <img <c:choose>
                                         <c:when test = "${sessionScope.account.url_avata != null}">
                                             src="${pageContext.request.contextPath}/${post.ac.url_avata}" 
                                             </c:when>
                                             <c:otherwise>
                                                 src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                             </c:otherwise>
                                        </c:choose>alt="Admin" class="rounded-circle" width="35" height="35">
                            <div>
                                <p> <a href="#">Alex Carry </a></p>
                                <small>August 13 1999, 09.18 pm</small>
                            </div>
                        </div>
                        <div>
                            <a href="#"><i class="fas fa-ellipsis-v"></i></a>
                        </div>
                    </div>
                    <div class="status-field">
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis dolores praesentium dicta
                            laborum nihil accusantium odit laboriosam, sed sit autem! <a href="#">#This_Post_is_faster!!!!</a> </p>
                        <img src="assert\10.png" alt="">
                    </div>
                    <div class="post-reaction">
                        <div class="activity-icons">
                            <div onclick="heart()"><i class="bi bi-heart"></i>120 </div>
                            <div onclick="comment()"><i class="bi bi-chat-left"></i>120 </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
            </div>
        </main>

    </body>
</html>
