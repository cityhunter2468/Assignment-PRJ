<%-- 
    Document   : Profile_Edit
    Created on : Oct 23, 2021, 10:58:23 AM
    Author     : levan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styleProfile_Edit.css" />
        <style>
            body{
                -webkit-touch-callout: none;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                -o-user-select: none;
                user-select: none;
            }
        </style>

        <script>
            function killCopy(e) {
                return false;
            }

            function reEnable() {
                return true;
            }

            document.onselectstart = new Function("return false");

            if (window.sidebar) {
                document.onmousedown = killCopy;
                document.onclick = reEnable;
            }

            function readURL(input) {
                if (input.files && input.files[0]) {

                    var reader = new FileReader();

                    reader.onload = function (e) {
                        $('.image-upload-wrap').hide();

                        $('.file-upload-image').attr('src', e.target.result);
                        $('.file-upload-content').show();

                        $('.image-title').html(input.files[0].name);
                    };

                    reader.readAsDataURL(input.files[0]);

                } else {
                    removeUpload();
                }
            }

            function removeUpload() {
                $('.file-upload-input').replaceWith($('.file-upload-input').clone());
                $('.file-upload-content').hide();
                $('.image-upload-wrap').show();
            }
            $('.image-upload-wrap').bind('dragover', function () {
                $('.image-upload-wrap').addClass('image-dropping');
            });
            $('.image-upload-wrap').bind('dragleave', function () {
                $('.image-upload-wrap').removeClass('image-dropping');
            });

        </script>
    </head>
    <body>
        <jsp:include page="Narbar.jsp"></jsp:include>
            <div class="container">
                <div class="main-body">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="card">
                                <div class="card-body">
                                    <div class="d-flex flex-column align-items-center text-center">
                                        <img <c:choose>
                                            <c:when test = "${sessionScope.account.url_avata != null}">
                                                src="${pageContext.request.contextPath}/${sessionScope.account.url_avata}" 
                                            </c:when>
                                            <c:otherwise>
                                                src="${pageContext.request.contextPath}/assert/no_avata.jpg" 
                                            </c:otherwise>
                                        </c:choose>alt="Admin" class="rounded-circle p-1 bg-primary" width="110" height="110">
                                    <div class="mt-3">
                                        <h4>${sessionScope.account.displayname}</h4>
                                        <p class="text-secondary mb-1">${requestScope.profile.occupation}</p>
                                        <p class="text-muted font-size-sm">${requestScope.profile.location}</p>  
                                        <button class="btn btn-outline-primary upload_avata">Change Avata</button>
                                    </div>
                                </div>
                                <hr class="my-4">
                                <form action="edit?op=1" method="post" enctype="multipart/form-data">
                                    <div class="form-group change_avata" style="display: none;">

                                        <div class="image-upload-wrap">
                                            <input class="file-upload-input" type='file' onchange="readURL(this);" name="file" accept="image/*"/>
                                            <div class="drag-text">
                                                <h3>Drag and drop a file or select add Image</h3>
                                            </div>
                                        </div>
                                        <div class="file-upload-content">
                                            <img class="rounded-circle file-upload-image" src="#" alt="your image" />
                                            <div class="image-title-wrap">
                                                <button type="button" onclick="removeUpload()" class="remove-image">Remove <span class="image-title">Uploaded Image</span></button>
                                            </div>
                                        </div>
                                        <button type="submit" class="btn btn-success upload">Upload</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-8">    
                        <form method="post" action="edit?op=0">
                            <div class="card">

                                <div class="card-body">
                                    <div class="row mb-3">
                                        <div class="col-sm-4">
                                            <h6 class="mb-0">Full Name</h6>
                                        </div>
                                        <div class="col-sm-8 text-secondary">
                                            <input type="text" class="form-control" value="${requestScope.profile.fname}" name="name">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <div class="col-sm-4">
                                            <h6 class="mb-0">Gender</h6>
                                        </div>
                                        <div class="col-sm-8 text-secondary">
                                            <select class="custom-select" id="inputGroupSelect01" name="gender">    
                                                <option value="0" <c:if test = "${requestScope.profile.gender == 0}"> selected </c:if>>Female</option>
                                                <option value="1" <c:if test = "${requestScope.profile.gender == 1}"> selected </c:if>>Male</option>
                                                <option value="2" <c:if test = "${requestScope.profile.gender == 2}"> selected </c:if>>Other</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="row mb-3">
                                            <div class="col-sm-4">
                                                <h6 class="mb-0">Birth_Date</h6>
                                            </div>
                                            <div class="col-sm-8 text-secondary">
                                                <input type="date" class="form-control" <c:if test = "${requestScope.profile.dob != null}"> value="${requestScope.profile.dob}" </c:if> <c:if test = "${requestScope.profile.dob == null}">  value="2013-01-08"  </c:if>name="dob">
                                            </div>
                                        </div>
                                        <div class="row mb-3">
                                            <div class="col-sm-4">
                                                <h6 class="mb-0">Martail_Status</h6>
                                            </div>
                                            <div class="col-sm-8 text-secondary">
                                                    <input type="text" class="form-control" value="${requestScope.profile.mstatus}" name="status">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <div class="col-sm-4">
                                            <h6 class="mb-0">Location</h6>
                                        </div>
                                        <div class="col-sm-8 text-secondary">
                                            <input type="text" class="form-control" value="${requestScope.profile.location}" name="location">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <div class="col-sm-4">
                                            <h6 class="mb-0">Mobile_Number</h6>
                                        </div>
                                        <div class="col-sm-8 text-secondary">
                                            <input type="text" class="form-control" value="${requestScope.profile.number}" name="phone">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <div class="col-sm-4">
                                            <h6 class="mb-0">Occupation</h6>
                                        </div>
                                        <div class="col-sm-8 text-secondary">
                                            <input type="text" class="form-control" value="${requestScope.profile.occupation}" name="occupation">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <div class="col-sm-4">
                                            <h6 class="mb-0">Skills</h6>
                                        </div>
                                        <div class="col-sm-8 text-secondary">
                                            <input type="text" class="form-control" value="${requestScope.profile.skill}" name="skill">
                                        </div>
                                    </div>
                                </div>

                            </div>

                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="card">
                                        <div class="card-body">
                                            <h5 class="d-flex align-items-center mb-3">Link</h5>
                                            <div class="input-group mb-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text" id="inputGroup-sizing-default">Website</span>
                                                </div>
                                                <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="web" value="${requestScope.profile.wed}">
                                            </div>

                                            <div class="input-group mb-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text" id="inputGroup-sizing-default">Github</span>
                                                </div>
                                                <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="git" value="${requestScope.profile.github}">
                                            </div>

                                            <div class="input-group mb-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text" id="inputGroup-sizing-default">Twitter</span>
                                                </div>
                                                <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="twit" value="${requestScope.profile.twitter}">
                                            </div>

                                            <div class="input-group mb-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text" id="inputGroup-sizing-default">Instagram</span>
                                                </div>
                                                <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="ins" value="${requestScope.profile.insta}">
                                            </div>

                                            <div class="input-group mb-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text" id="inputGroup-sizing-default">Facebook</span>
                                                </div>
                                                <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="face" value="${requestScope.profile.face}">
                                            </div>

                                            <div class="row">
                                                <div class="col-sm-3"></div>
                                                <div class="col-sm-9 text-secondary">
                                                    <input type="submit" class="btn btn-primary px-4" value="Save Changes">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>

        <script>
            $('.upload_avata').click(function () {
                var content = $('.upload_avata').html();
                if (content === "Change Avata"){
                    $(".change_avata").show();
                    $('.upload_avata').html("Cancel");
                } else {
                    $(".change_avata").hide();
                    $('.upload_avata').html("Change Avata");
                }
                
            });
        </script>                                       
    </body>
</html>
