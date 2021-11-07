<%-- 
    Document   : Profile
    Created on : Oct 22, 2021, 8:57:55 AM
    Author     : levan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styleProfile.css" />
    </head>
    <jsp:include page="Narbar.jsp"></jsp:include>
        <body>
            <main>
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div>
                                <div class="content social-timeline">
                                    <div class="">

                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="social-wallpaper">
                                                    <div class="profile-hvr">
                                                        <i class="icofont icofont-ui-edit p-r-10"></i>
                                                        <i class="icofont icofont-ui-delete"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-xs-12">
                                                <div class="social-timeline-left">
                                                    <div class="card">
                                                        <div class="social-profile">
                                                            <img class="img-fluid width-100" <c:choose>
                                                                 <c:when test = "${requestScope.account.url_avata != null}">
                                                                     src="${pageContext.request.contextPath}/${requestScope.account.url_avata}" 
                                                                 </c:when>
                                                                 <c:otherwise>
                                                                     src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                                                 </c:otherwise>
                                                             </c:choose> alt="">
                                                        <div class="profile-hvr m-t-15">
                                                            <i class="icofont icofont-ui-edit p-r-10"></i>
                                                            <i class="icofont icofont-ui-delete"></i>
                                                        </div>
                                                    </div>
                                                    <div class="card-block social-follower">
                                                        <h4>${requestScope.account.displayname}</h4>
                                                        <h5>${requestScope.profile.occupation}</h5>                                  
                                                    </div>
                                                </div>                                                                                                                                     
                                            </div>

                                        </div>

                                        <div class="col-xl-9 col-lg-8 col-md-8 col-xs-12 ">
                                            <div class="card social-tabs">
                                                <ul class="nav nav-tabs md-tabs tab-timeline" role="tablist">
                                                    <li class="nav-item">
                                                        <a class="nav-link active" data-toggle="tab" href="#timeline" role="tab">Timeline</a>
                                                        <div class="slide"></div>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" data-toggle="tab" href="#about" role="tab">About</a>
                                                        <div class="slide"></div>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" data-toggle="tab" href="#photos" role="tab">Photos</a>
                                                        <div class="slide"></div>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" data-toggle="tab" href="#friends" role="tab">Friends</a>
                                                        <div class="slide"></div>
                                                    </li>
                                                </ul>
                                            </div>

                                            <div class="tab-content">

                                                <div class="tab-pane active" id="timeline">
                                                    <div id="posts">
                                                        <c:forEach items="${requestScope.post}" var="post">
                                                            <div class="row" id="${post.post_id}">
                                                                <div class="col-md-12 ">
                                                                    <div class=" p-relative">
                                                                        <div class="row timeline-right p-t-35">
                                                                            <div class="col-2 col-sm-2 col-xl-1">
                                                                                <div class="social-timelines-left">
                                                                                    <img class="img-radius timeline-icon" 
                                                                                         <c:choose>
                                                                                             <c:when test = "${requestScope.account.url_avata != null}">
                                                                                                 src="${pageContext.request.contextPath}/${requestScope.account.url_avata}" 
                                                                                             </c:when>
                                                                                             <c:otherwise>
                                                                                                 src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                                                                             </c:otherwise>
                                                                                         </c:choose> alt="">
                                                                                </div>
                                                                            </div>
                                                                            <div class="col-10 col-sm-10 col-xl-11 p-l-5 p-b-35">
                                                                                <div class="card">
                                                                                    <div class="card-block post-timelines">
                                                                                        <c:if test = "${sessionScope.account.id == requestScope.account.id}">
                                                                                            <span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip"></span>
                                                                                            <div class="dropdown-menu dropdown-menu-right b-none services-list">
                                                                                                <div class="dropdown-item" onclick="deletePost(${post.post_id})">Remove post</div>
                                                                                                <div class="dropdown-item" >Edit post</div>
                                                                                            </div>
                                                                                        </c:if>  

                                                                                        <div class="chat-header f-w-600"> Create at: ${post.time_create}</div>
                                                                                    </div>
                                                                                    <div class="anhcontainer">
                                                                                        <c:choose>
                                                                                            <c:when test = "${post.url_img != null}">
                                                                                                <img src="${pageContext.request.contextPath}/${post.url_img}" class="anh" alt="">
                                                                                            </c:when>
                                                                                        </c:choose>
                                                                                    </div>
                                                                                    <div class="card-block">
                                                                                        <div class="timeline-details">

                                                                                            <p class="text-muted">${post.content} </p>
                                                                                        </div>
                                                                                    </div>

                                                                                    <div class="row" id="interact">
                                                                                        <div class="col-2 <c:if test = "${post.userlike == 1}"> actives </c:if>" id="like${post.post_id}" onclick="like(${sessionScope.account.id}, ${post.post_id})" ><i class="bi bi-heart"></i><span class="b-r-muted" id="like1${post.post_id}"> Like ${post.countlike}</span> </div>
                                                                                            <div class="col-3"> <i class="bi bi-chat-left"></i><span class="b-r-muted"> Comments</span></div>
                                                                                        </div>   
                                                                                        <div class="card-block user-box" >
                                                                                            <div class="p-b-30"> <div id="loadmorecomment" onclick="comment(${post.post_id})">Load more comment</div></div>

                                                                                        <div id="container_comment${post.post_id}">
                                                                                            <c:forEach items="${post.comment}" var="comment">
                                                                                                <div class="media m-b-20 sub_comment${post.post_id}">
                                                                                                    <a class="media-left" href="${pageContext.request.contextPath}/profile/view?id=${comment.account.id}">
                                                                                                        <img class="media-object img-radius m-r-20" <c:choose>
                                                                                                                 <c:when test = "${comment.account.url_avata != null}">
                                                                                                                     src="${pageContext.request.contextPath}/${comment.account.url_avata}" 
                                                                                                                 </c:when>
                                                                                                                 <c:otherwise>
                                                                                                                     src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                                                                                                 </c:otherwise>
                                                                                                             </c:choose>  alt="Generic placeholder image">
                                                                                                    </a>
                                                                                                    <div class="media-body b-b-muted social-client-description">
                                                                                                        <div class="chat-header">${comment.account.displayname}<span class="text-muted">${comment.time}</span></div>
                                                                                                        <p class="text-muted">${comment.content}</p>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </c:forEach>
                                                                                        </div>
                                                                                        <div class="media">
                                                                                            <a class="media-left" href="${pageContext.request.contextPath}/profile/view?id=${sessionScope.account.id}">
                                                                                                <img class="media-object img-radius m-r-20" <c:choose>
                                                                                                         <c:when test = "${sessionScope.account.url_avata != null}">
                                                                                                             src="${pageContext.request.contextPath}/${sessionScope.account.url_avata}" 
                                                                                                         </c:when>
                                                                                                         <c:otherwise>
                                                                                                             src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                                                                                         </c:otherwise>
                                                                                                     </c:choose> alt="Generic placeholder image">
                                                                                            </a>
                                                                                            <div class="media-body">
                                                                                                <form class="">
                                                                                                    <div class="">
                                                                                                        <textarea rows="5" cols="5" class="form-control" placeholder="Write Something here..." id="comment${post.post_id}"></textarea>
                                                                                                        <div class="text-right m-t-20"><button type="button" class="btn btn-primary" onclick="post(${post.post_id})">Post</button></div>
                                                                                                    </div>
                                                                                                </form>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>

                                                                </div>
                                                            </div>    
                                                        </c:forEach>
                                                    </div>

                                                    <div>
                                                        <div class="row">
                                                            <div class="col text-center">
                                                                <button type="button" class="btn btn-outline-primary" id="loadmore_post">Load more</button>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>


                                                <div class="tab-pane" id="about">
                                                    <div>
                                                        <div class="row">
                                                            <div class="col-sm-12">
                                                                <div class="card">
                                                                    <div class="card-header">
                                                                        <h5 class="card-header-text">Basic Information</h5>

                                                                    </div>
                                                                    <div class="card-block">
                                                                        <div id="view-info" class="row">
                                                                            <div class="col-lg-6 col-md-12">

                                                                                <table class="table table-responsive m-b-0">
                                                                                    <tbody>
                                                                                        <tr>
                                                                                            <th class="social-label b-none p-t-0">Full Name
                                                                                            </th>
                                                                                            <td class="social-user-name b-none p-t-0 text-muted">${requestScope.profile.fname}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none">Gender</th>
                                                                                            <td class="social-user-name b-none text-muted"><c:choose>

                                                                                                    <c:when test = "${requestScope.profile.gender == 1}">
                                                                                                        Male
                                                                                                    </c:when>

                                                                                                    <c:when test = "${requestScope.profile.gender == 0}">
                                                                                                        Female
                                                                                                    </c:when>

                                                                                                    <c:otherwise>
                                                                                                        Orther
                                                                                                    </c:otherwise>
                                                                                                </c:choose></td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none">Birth Date</th>
                                                                                            <td class="social-user-name b-none text-muted">${requestScope.profile.dob}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none">Martail Status</th>
                                                                                            <td class="social-user-name b-none text-muted">${requestScope.profile.mstatus}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none p-b-0">Location</th>
                                                                                            <td class="social-user-name b-none p-b-0 text-muted">${requestScope.profile.location}</td>
                                                                                        </tr>
                                                                                    </tbody>
                                                                                </table>

                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-12">
                                                                <div class="card">
                                                                    <div class="card-header">
                                                                        <h5 class="card-header-text">Contact Information</h5>

                                                                    </div>
                                                                    <div class="card-block">
                                                                        <div id="contact-info" class="row">
                                                                            <div class="col-lg-6 col-md-12">
                                                                                <table class="table table-responsive m-b-0">
                                                                                    <tbody>
                                                                                        <tr>
                                                                                            <th class="social-label b-none p-t-0">Mobile Number</th>
                                                                                            <td class="social-user-name b-none p-t-0 text-muted">${requestScope.profile.number}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none">Web</th>
                                                                                            <td class="social-user-name b-none text-muted">${requestScope.profile.wed}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none">Twitter</th>
                                                                                            <td class="social-user-name b-none text-muted">${requestScope.profile.twitter}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none p-b-0">Github</th>
                                                                                            <td class="social-user-name b-none p-b-0 text-muted">${requestScope.profile.github}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none p-b-0">Facebook</th>
                                                                                            <td class="social-user-name b-none p-b-0 text-muted">${requestScope.profile.face}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none p-b-0">Instagram</th>
                                                                                            <td class="social-user-name b-none p-b-0 text-muted">${requestScope.profile.insta}</td>
                                                                                        </tr>
                                                                                    </tbody>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-12">
                                                                <div class="card">
                                                                    <div class="card-header">
                                                                        <h5 class="card-header-text">Work</h5>

                                                                    </div>
                                                                    <div class="card-block">
                                                                        <div id="work-info" class="row">
                                                                            <div class="col-lg-6 col-md-12">
                                                                                <table class="table table-responsive m-b-0">
                                                                                    <tbody>
                                                                                        <tr>
                                                                                            <th class="social-label b-none p-t-0">Occupation      
                                                                                            </th>
                                                                                            <td class="social-user-name b-none p-t-0 text-muted">${requestScope.profile.occupation}</td>
                                                                                        </tr>
                                                                                        <tr>
                                                                                            <th class="social-label b-none">Skills</th>
                                                                                            <td class="social-user-name b-none text-muted">${requestScope.profile.skill}</td>
                                                                                        </tr>

                                                                                    </tbody>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div> 
                                                </div>

                                                <div class="tab-pane" id="photos">
                                                    <div>
                                                        <div class="card">

                                                            <div class="card-block">
                                                                <div class="demo-gallery">
                                                                    <ul id="profile-lightgallery" class="row" style="list-style: none;">
                                                                        <c:forEach items="${requestScope.img}" var="img">
                                                                            <li class="col-md-4 col-lg-2 col-sm-6 col-xs-12">

                                                                                <img src="${pageContext.request.contextPath}/${img.url_img}" class="img-fluid" alt="">

                                                                            </li>
                                                                        </c:forEach>
                                                                    </ul>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    </div>

                                                    <div>
                                                        <div class="row">
                                                            <div class="col text-center">
                                                                <button type="button" class="btn btn-outline-primary" id="loadmore_photos">Load more</button>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>

                                                <div class="tab-pane" id="friends">
                                                    <div> 
                                                        <div class="row" id="friend">
                                                            <c:forEach items="${requestScope.friend}" var="friend">
                                                                <div class="col-lg-12 col-xl-6" id="${friend.id}">
                                                                    <div class="card">
                                                                        <div class="card-block post-timelines">
                                                                            <span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip"></span>
                                                                            <div class="dropdown-menu dropdown-menu-right b-none services-list">
                                                                                <c:if test = "${sessionScope.account.id == requestScope.account.id}">
                                                                                    <a class="dropdown-item" href="#" onclick="deleteFriend(${friend.id})">Huy ket ban</a>
                                                                                </c:if>                                                                          
                                                                                <a class="dropdown-item" href="${pageContext.request.contextPath}/profile/view?id=${friend.id}">Profile</a>

                                                                            </div>
                                                                            <div class="media bg-white d-flex">
                                                                                <div class="media-left media-middle">
                                                                                    <c:choose>
                                                                                        <c:when test = "${friend.url_avata != null}">
                                                                                            <img class="media-object" width="120" height="120" src="${pageContext.request.contextPath}/${friend.url_avata}" alt="">
                                                                                        </c:when>
                                                                                        <c:otherwise>
                                                                                            <img class="media-object" width="120" height="120" src="${pageContext.request.contextPath}/assert/no_avata.jpg"  alt="">
                                                                                        </c:otherwise>
                                                                                    </c:choose>


                                                                                </div>
                                                                                <div class="media-body friend-elipsis">
                                                                                    <div class="f-15 f-bold m-b-5">${friend.displayname}</div>

                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>   
                                                            </c:forEach>
                                                        </div>
                                                    </div>
                                                    <div>
                                                        <div class="row">
                                                            <div class="col text-center">
                                                                <button type="button" class="btn btn-outline-primary" id="loadmore_friends">Load more</button>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>       
                                            </div>
                                        </div>    
                                    </div>   
                                </div>  
                            </div> 
                        </div> 
                    </div> 
                </div> 
            </div> 
        </main>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
                                                                                        function deleteFriend(obj) {
                                                                                            var result = confirm("ban chac chan muon huy ket ban")

                                                                                            if (result) {
                                                                                                $.ajax({
                                                                                                    url: "/Assignment/deleteFriend",
                                                                                                    type: "post", //send it through get method
                                                                                                    data: {
                                                                                                        id_ac: ${sessionScope.account.id},
                                                                                                        id: obj
                                                                                                    },
                                                                                                    success: function (data) {
                                                                                                        var row = document.getElementById("friend");
                                                                                                        var row1 = document.getElementById(obj);
                                                                                                        row.removeChild(row1);
                                                                                                    },
                                                                                                    error: function (xhr) {
                                                                                                        //Do Something to handle error
                                                                                                    }
                                                                                                });
                                                                                            }

                                                                                        }
//                                                                                    <---------------------------------->                                                                                         
                                                                                        function deletePost(obj) {
                                                                                            var result = confirm("ban chac chan muon xoa bai viet")


                                                                                            if (result) {
                                                                                                $.ajax({
                                                                                                    url: "/Assignment/deletePost",
                                                                                                    type: "post", //send it through get method
                                                                                                    data: {
                                                                                                        id: obj,
                                                                                                    },
                                                                                                    success: function (data) {
                                                                                                        var row = document.getElementById("posts");
                                                                                                        var row1 = document.getElementById(obj);
                                                                                                        row.removeChild(row1);
                                                                                                    },
                                                                                                    error: function (xhr) {
                                                                                                        //Do Something to handle error
                                                                                                    }
                                                                                                });
                                                                                            }

                                                                                        }
//                                                                                    <---------------------------------->  
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

//                                                                                    <---------------------------------->  
                                                                                        function comment(obj) {
                                                                                            var amount = document.getElementsByClassName("sub_comment" + obj).length;

                                                                                            $.ajax({
                                                                                                url: "/Assignment/loadmorecomment",
                                                                                                type: "post", //send it through get method
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

//                                                                                    <---------------------------------->    
                                                                                        function post(obj) {
                                                                                            var s = $('#comment' + obj).val();
                                                                                            $.ajax({
                                                                                                url: "/Assignment/comment",
                                                                                                type: "post", //send it through get method
                                                                                                data: {

                                                                                                    id_post: obj,
                                                                                                    content: s
                                                                                                },
                                                                                                success: function (data) {
                                                                                                    var row = document.getElementById("container_comment" + obj);
                                                                                                    row.innerHTML = data + row.innerHTML;
                                                                                                    $('#comment' + obj).val() = "Write Something here...";
                                                                                                },
                                                                                                error: function (xhr) {
                                                                                                    //Do Something to handle error
                                                                                                }
                                                                                            });
                                                                                        }
//                                                                                    <---------------------------------->     

        </script>                                                                                  
    </body>
</html>
