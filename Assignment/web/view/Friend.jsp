<%-- 
    Document   : Friend
    Created on : Nov 7, 2021, 10:22:05 PM
    Author     : levan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/css/styleFriend.css" rel="stylesheet">
    </head>
    <jsp:include page="Narbar.jsp"></jsp:include>
        <body>
            <main>
                <div class="container">
                    <div class="container_friend">
                    <c:forEach items="${requestScope.account}" var="ac">
                        <div class="row ">
                            <div class="col-3">
                            </div>
                            <div class="col-7 sub_friend">
                                <div class="row">
                                    <div class="col-sm-8">
                                        <a href="${pageContext.request.contextPath}/profile/view?id=${ac.id}"><img <c:choose>
                                                    <c:when test = "${ac.url_avata != null}">
                                                        src="${pageContext.request.contextPath}/${ac.url_avata}" 
                                                    </c:when>
                                                    <c:otherwise>
                                                        src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                                    </c:otherwise>
                                                </c:choose>alt="Admin" class="rounded-circle" width="60" height="60"> 
                                            ${ac.displayname} 
                                        </a>                                                
                                    </div>

                                    <div class="col-sm-4">
                                        <c:choose>
                                            <c:when test = "${ac.id == sessionScope.account.id}">
                                            </c:when>
                                            <c:when test = "${ac.friendstatus == 0}">
                                                <button type="button" class="btn btn-outline-primary" onclick="postFriend(${sessionScope.account.id}, ${ac.id})" value="0" id="friend${ac.id}">Hủy Lời Mời</button>
                                            </c:when>

                                            <c:when test = "${ac.friendstatus == 1}">
                                                <button type="button" class="btn btn-outline-primary" onclick="postFriend(${sessionScope.account.id}, ${ac.id})" value="1" id="friend${ac.id}">Hủy Kết Bạn</button>
                                            </c:when>

                                            <c:when test = "${ac.friendstatus == -1}">
                                                <button type="button" class="btn btn-outline-primary" onclick="postFriend(${sessionScope.account.id}, ${ac.id})" value="-1" id="friend${ac.id}">Kết Bạn</button>
                                            </c:when>
                                            <c:when test = "${ac.friendstatus == 2}">
                                                <button type="button" class="btn btn-outline-primary" onclick="postFriend(${sessionScope.account.id}, ${ac.id})" value="2" id="friend${ac.id}">Đồng Ý</button>
                                            </c:when>
                                        </c:choose>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>

            </div>
        </main>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>

                                                    function postFriend(o1, o2) {
                                                    var object = $('#friend' + o2);
                                                    const o3 = object.val();
                                                    $.ajax({
                                                    url: "/Assignment/postfriend",
                                                            type: "post", //send it through get method
                                                            data: {
                                                            id_user: o1,
                                                                    id_friend: o2,
                                                                    op: o3
                                                            },
                                                            success: function (data) {
                                                            alert(o3);
                                                            var object = document.getElementById('friend' + o2);
                                                            if (o3 == 0 || o3 == 1){
                                                            object.innerHTML = "Kết Bạn"
                                                                    object.valueOf() = - 1
                                                            }
                                                            if (o3 == 2){
                                                            object.html() = "Hủy Kết Bạn"
                                                                    object.valueOf() = 1
                                                            }
                                                            if (o3 == - 1){
                                                            object.html() = "Hủy Lời Mời"
                                                                    object.valueOf() = 0
                                                            }

                                                            },
                                                            error: function (xhr) {
                                                            //Do Something to handle error
                                                            }
                                                    });
                                                    }


        </script>
    </body>
</html>
