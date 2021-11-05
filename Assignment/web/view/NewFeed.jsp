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
                    <div id="content">
                    <c:forEach items="${requestScope.posts}" var="post">
                        <div class="status-field-container write-post-container sub_content">
                            <div class="user-profile-box">
                                <div class="user-profile">
                                    <img <c:choose>
                                            <c:when test = "${post.ac.url_avata != null}">
                                                src="${pageContext.request.contextPath}/${post.ac.url_avata}" 
                                            </c:when>
                                            <c:otherwise>
                                                src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                            </c:otherwise>
                                        </c:choose>alt="Admin" class="rounded-circle" width="35" height="35">
                                    <div>
                                        <p> <a href="profile/view?id=${post.ac.id}">${post.ac.displayname}</a></p>
                                        <small>${post.time_create}</small>
                                    </div>
                                </div>
                                <div>
                                    <a href="#"><i class="fas fa-ellipsis-v"></i></a>
                                </div>
                            </div>
                            <div class="status-field">
                                <p>${post.content}</p>
                                <c:choose>
                                    <c:when test = "${post.url_img != null}">
                                        <img src="${pageContext.request.contextPath}/${post.url_img}" class="anh" alt="">
                                    </c:when>
                                    <c:otherwise>
                                        src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                    </c:otherwise>
                                </c:choose>
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
            </div>
        </main>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
                                        var _throttleTimer = null;
                                        var _throttleDelay = 100;
                                        var $window = $(window);
                                        var $document = $(document);

                                        $document.ready(function () {

                                            $window
                                                    .off('scroll', ScrollHandler)
                                                    .on('scroll', ScrollHandler);

                                        });

                                        function ScrollHandler(e) {
                                            //throttle event:
                                            clearTimeout(_throttleTimer);
                                            _throttleTimer = setTimeout(function () {
                                                console.log('scroll');

                                                //do work
                                                if ($window.scrollTop() + $window.height() > $document.height() - 100) {
                                                    //alert("bottom");
                                                    var amount = document.getElementsByClassName("sub_content").length;
                                                    $.ajax({
                                                        url: "/Assignment/LoadMorePost",
                                                        type: "post", //send it through get method
                                                        data: {
                                                            exits: amount
                                                        },
                                                        success: function (data) {
                                                            //alert("da lay dc data");
                                                            var row = document.getElementById("content");
                                                            row.innerHTML += data;
                                                        },
                                                        error: function (xhr) {
                                                            //Do Something to handle error
                                                        }
                                                    });
                                                }

                                            }, _throttleDelay);
                                        }
        </script>
    </body>
</html>
