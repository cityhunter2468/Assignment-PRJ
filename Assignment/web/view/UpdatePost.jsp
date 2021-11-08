<%-- 
    Document   : Upload
    Created on : Oct 19, 2021, 4:25:25 PM
    Author     : levan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/styleUpload.css" rel="stylesheet">
        <script class="jsbin" src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
    </head>
    <body>
        <jsp:include page="Narbar.jsp"></jsp:include>
            <main>
                <div class="container">
                    <form action="updatepost?id=${requestScope.post.post_id}" method="post" enctype='multipart/form-data' onsubmit="return validateform()">
                    <div class="post">

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for="inputGroupSelect01">Options</label>
                            </div>
                            <select class="custom-select" id="inputGroupSelect01" name="status">
                                <option value="0" <c:if test = "${requestScope.post.status == 0}"> selected </c:if>>Private</option>
                                <option value="1" <c:if test = "${requestScope.post.status == 1}"> selected </c:if>>Friend</option>
                                <option value="2" <c:if test = "${requestScope.post.status == 2}"> selected </c:if>>Public</option>
                                </select>
                            </div>

                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text" id="inputGroup-sizing-default">Content</span>
                                </div>
                                <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="content" value="${requestScope.post.content}">
                        </div>
                        <c:if test = "${requestScope.post.url_img != null}">
                            <div id="displayimg">
                                <img src="${pageContext.request.contextPath}/${requestScope.post.url_img}" width="50%"/>
                            </div> 
                        </c:if>


                        <div class="image-upload-wrap">
                            <input class="file-upload-input" type='file' multiple accept='image/*' onchange="readURL(this);" name="file" />
                            <div class="drag-text">
                                <h3>Drag and drop a file or select add Image</h3>
                            </div>
                        </div>

                        <div class="file-upload-content">
                            <img class="file-upload-image" src="#"  alt="your image" />
                            <div class="image-title-wrap">
                                <button type="button" onclick="removeUpload()" class="remove-image">Remove <span class="image-title">Uploaded Image</span></button>
                            </div>
                        </div>

                        <button type="submit" class="btn btn-success upload">Upload</button>
                    </div>
                </form>
            </div>
        </main>
        <script>
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

            function validateform() {
                var con = document.getElementsByName("content")[0].value;
                if (con == "" || con == null) {
                    alert("Content not null");
                    return false;
                }
            }
        </script>
    </body>
</html>
