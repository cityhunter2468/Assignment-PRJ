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
                                </c:choose>
                            </div>

                            <div class="post-reaction">
                                <div class="activity-icons">
                                    <div onclick="like(${sessionScope.account.id},${post.post_id})">
                                        <i id="like${post.post_id}" class="bi bi-heart <c:if test = "${post.userlike == 1}"> actives </c:if>"></i> 
                                        <span id="like1${post.post_id}">Like ${post.countlike} </span>
                                    </div>
                                    <div ><i class="bi bi-chat-left"></i> Comment </div>
                                </div>
                            </div>
                                    
                            <div id="loadmorecomment" onclick="comment(${post.post_id})">Load more comment
                            </div>

                            <div class="comment_like" id="container_comment${post.post_id}">
                                <c:forEach items="${post.comment}" var="comment">
                                    <div class="sub_comment${post.post_id}">
                                        <div class="row">
                                            <div class="col-sm-1"><img <c:choose>
                                                        <c:when test = "${comment.account.url_avata != null}">
                                                            src="${pageContext.request.contextPath}/${comment.account.url_avata}" 
                                                        </c:when>
                                                        <c:otherwise>
                                                            src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                                        </c:otherwise>
                                                    </c:choose>alt="Admin" class="rounded-circle" width="40" height="40"> </div>
                                            <div class="col-sm-10"> <a href="${pageContext.request.contextPath}/profile/view?id=${comment.account.id}">${comment.account.displayname}</a> <span class="time_comment"> ${comment.time}</span>
                                                <p>${comment.content}</p>
                                            </div>
                                        </div>
                                    </div>                                      
                                </c:forEach>
                            </div>

                            <div class="post_comment">
                                <div class="row">
                                    <div class="col-sm-1"><img <c:choose>
                                                <c:when test = "${sessionScope.account.url_avata != null}">
                                                    src="${pageContext.request.contextPath}/${sessionScope.account.url_avata}" 
                                                </c:when>
                                                <c:otherwise>
                                                    src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                                </c:otherwise>
                                            </c:choose>alt="Admin" class="rounded-circle" width="40" height="40"></div>
                                    <div class="col-sm-10"><input type="text" class="form-control" placeholder="Your Comment Here"  id="comment${post.post_id}"></div>
                                </div>
                                <div class="row button_post">
                                    <div class="col-sm-5"></div>
                                    <div class="col-sm-2"><button type="button" class="btn btn-primary" onclick="post(${post.post_id})">Post</button></div>
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
                                                        url: "/Assignment/LoadMoreNewFeed",
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

                                        function like(obj1, obj2) {
                                            var op = 0;

                                            if ($('#like' + obj2).hasClass('actives')) {
                                                op = 1;

                                            } else {
                                                op = 0;

                                            }

                                            $.ajax({
                                                url: "/Assignment/like",
                                                type: "post", //send it through get method
                                                data: {
                                                    id_user: obj1,
                                                    id_post: obj2,
                                                    option: op
                                                },
                                                success: function (data) {
                                                    var b1 = document.getElementById("like1" + obj2);
                                                    var s = b1.innerHTML;
                                                    var s1 = s.slice(5);
                                                    var x = new Number(s1);
                                                    if (op == 1) {
                                                        $('#like' + obj2).removeClass('actives')
                                                        x = x - 1;
                                                    } else {
                                                        $('#like' + obj2).addClass('actives')
                                                        x = x + 1;
                                                    }

                                                    b1.innerHTML = ' Like ' + x
//                                                                                                    alert(x)

                                                },
                                                error: function (xhr) {
                                                    //Do Something to handle error
                                                }
                                            });
                                        }

                                        function post(obj) {
                                            var s = $('#comment' + obj).val();
                                            $.ajax({
                                                url: "/Assignment/comment",
                                                type: "get", //send it through get method
                                                data: {
                                                    id_post: obj,
                                                    content: s
                                                },
                                                success: function (data) {
                                                    var row = document.getElementById("container_comment" + obj);
//                                                    row.innerHTML = data + row.innerHTML;
                                                    row.innerHTML = data + row.innerHTML;
                                                },
                                                error: function (xhr) {
                                                    //Do Something to handle error
                                                }
                                            });
                                        }

                                        function comment(obj) {
                                            var amount = document.getElementsByClassName("sub_comment" + obj).length;

                                            $.ajax({
                                                url: "/Assignment/loadmorecomment",
                                                type: "get", //send it through get method
                                                data: {
                                                    id_post: obj,
                                                    ex: amount
                                                },
                                                success: function (data) {
                                                    var row = document.getElementById("container_comment" + obj);
                                                    row.innerHTML += data;
                                                },
                                                error: function (xhr) {
                                                    //Do Something to handle error
                                                }
                                            });
                                        }
        </script>
    </body>
</html>
