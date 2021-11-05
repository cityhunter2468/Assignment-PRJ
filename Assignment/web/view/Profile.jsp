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

                                                        <div class="">
                                                            <button type="button" class="btn btn-outline-primary waves-effect btn-block"><i class="icofont icofont-ui-user m-r-10"></i> Add as Friend</button>
                                                        </div>
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
                                                    <div>
                                                        <c:forEach items="${requestScope.post}" var="post">
                                                            <div class="row">
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
                                                                                        <span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip"></span>
                                                                                        <div class="dropdown-menu dropdown-menu-right b-none services-list">
                                                                                            <a class="dropdown-item" href="#">Remove post</a>
                                                                                            <a class="dropdown-item" href="#">Edit post</a>
                                                                                        </div>

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
                                                                                    <div class="card-block b-b-theme b-t-theme social-msg">
                                                                                        <a href="#"> <i class="icofont icofont-heart-alt text-muted"></i><span class="b-r-muted">Like (20)</span> </a>
                                                                                        <a href="#"> <i class="icofont icofont-comment text-muted"></i> <span class="b-r-muted">Comments (25)</span></a>
                                                                                        <a href="#"> <i class="icofont icofont-share text-muted"></i> <span>Share (10)</span></a>
                                                                                    </div>
                                                                                    <div class="card-block user-box">
                                                                                        <div class="p-b-30"> <span class="f-14"><a href="#">Comments (110)</a></span><span class="f-right">see all comments</span></div>
                                                                                        <div class="media m-b-20">
                                                                                            <a class="media-left" href="#">
                                                                                                <img class="media-object img-radius m-r-20" src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="Generic placeholder image">
                                                                                            </a>
                                                                                            <div class="media-body b-b-muted social-client-description">
                                                                                                <div class="chat-header">About Marta Williams<span class="text-muted">Jane 10, 2015</span></div>
                                                                                                <p class="text-muted">lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                                                                            </div>
                                                                                        </div>
                                                                                        <div class="media m-b-20">
                                                                                            <a class="media-left" href="#">
                                                                                                <img class="media-object img-radius m-r-20" src="https://bootdey.com/img/Content/avatar/avatar3.png" alt="Generic placeholder image">
                                                                                            </a>
                                                                                            <div class="media-body b-b-muted social-client-description">
                                                                                                <div class="chat-header">About Marta Williams<span class="text-muted">Jane 11, 2015</span></div>
                                                                                                <p class="text-muted">lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                                                                            </div>
                                                                                        </div>
                                                                                        <div class="media">
                                                                                            <a class="media-left" href="#">
                                                                                                <img class="media-object img-radius m-r-20" src="https://bootdey.com/img/Content/avatar/avatar4.png" alt="Generic placeholder image">
                                                                                            </a>
                                                                                            <div class="media-body">
                                                                                                <form class="">
                                                                                                    <div class="">
                                                                                                        <textarea rows="5" cols="5" class="form-control" placeholder="Write Something here..."></textarea>
                                                                                                        <div class="text-right m-t-20"><a href="#" class="btn btn-primary waves-effect waves-light">Post</a></div>
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
        </script>                                                                                  
    </body>
</html>
