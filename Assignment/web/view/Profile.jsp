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
                    <div id="content" class="content p-0">
                        <div class="profile-header">
                            <div class="profile-header-cover"></div>
                            <div class="profile-header-content">
                                <div class="profile-header-img mb-4">
                                    <img src="https://bootdey.com/img/Content/avatar/avatar7.png" class="mb-4" alt="" />
                                </div>

                                <div class="profile-header-info">
                                    <h4 class="m-t-sm">Clyde Stanley</h4>
                                    <p class="m-b-sm">UXUI + Frontend Developer</p>
                                    <a href="#" class="btn btn-xs btn-primary mb-2">Edit Profile</a>
                                </div>
                            </div>

                            <ul class="profile-header-tab nav nav-tabs">
                                <li class="nav-item"><a href="#profile-post" class="nav-link" data-toggle="tab">POSTS</a></li>
                                <li class="nav-item"><a href="#profile-about" class="nav-link" data-toggle="tab">ABOUT</a></li>
                                <li class="nav-item"><a href="#profile-photos" class="nav-link" data-toggle="tab">PHOTOS</a></li>
                                <li class="nav-item"><a href="#profile-videos" class="nav-link" data-toggle="tab">VIDEOS</a></li>
                                <li class="nav-item"><a href="#profile-friends" class="nav-link active show" data-toggle="tab">FRIENDS</a></li>
                            </ul>
                        </div>

                        <div class="profile-container">
                            <div class="row row-space-20">
                                <div class="col-md-8">
                                    <div class="tab-content p-0">

                                        <div class="tab-pane fade active show" id="profile-friends">
                                            <div class="m-b-10"><b>Friend List (9)</b></div>

                                            <ul class="friend-list clearfix">
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Sancho Aldo</h4>
                                                            <p>392 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar3.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Jonty Augusto</h4>
                                                            <p>128 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar4.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Androkles Allen</h4>
                                                            <p>12 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar5.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Ithamar Silvio</h4>
                                                            <p>1,923 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar6.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Denzel Annas</h4>
                                                            <p>893 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Kamil Cree</h4>
                                                            <p>983 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar8.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Fritjof Inderjit</h4>
                                                            <p>3,321 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar1.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Sushil Trygve</h4>
                                                            <p>921 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <div class="friend-img"><img src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="" /></div>
                                                        <div class="friend-info">
                                                            <h4>Frans Gebhard</h4>
                                                            <p>944 friends</p>
                                                        </div>
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-md-4 hidden-xs hidden-sm">
                                    <ul class="profile-info-list">
                                        <li class="title">PERSONAL INFORMATION</li>
                                        <li>
                                            <div class="field">Occupation:</div>
                                            <div class="value">UXUI / Frontend Developer</div>
                                        </li>
                                        <li>
                                            <div class="field">Skills:</div>
                                            <div class="value">C++, PHP, HTML5, CSS, jQuery, MYSQL, Ionic, Laravel, Phonegap, Bootstrap, Angular JS, Angular JS, Asp.net</div>
                                        </li>
                                        <li>
                                            <div class="field">Birth of Date:</div>
                                            <div class="value">1989/11/04</div>
                                        </li>
                                        <li>
                                            <div class="field">Country:</div>
                                            <div class="value">San Francisco</div>
                                        </li>
                                        <li>
                                            <div class="field">Address:</div>
                                            <div class="value">
                                                <address class="m-b-0">
                                                    Twitter, Inc.<br />
                                                    1355 Market Street, Suite 900<br />
                                                    San Francisco, CA 94103
                                                </address>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="field">Phone No.:</div>
                                            <div class="value">
                                                (123) 456-7890
                                            </div>
                                        </li>
                                        <li class="title">FRIEND LIST (9)</li>
                                        <li class="img-list">
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="" /></a>
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar3.png" alt="" /></a>
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar4.png" alt="" /></a>
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar5.png" alt="" /></a>
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar6.png" alt="" /></a>
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="" /></a>
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar8.png" alt="" /></a>
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar1.png" alt="" /></a>
                                            <a href="#" class="m-b-5"><img src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="" /></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
    </body>
</html>
