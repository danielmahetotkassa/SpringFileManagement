<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File | Upload Page</title>
</head>
<body>


<h1> File Upload page</h1>
<hr>

<form action = "upload" method = "post" enctype="multipart/form-data">

  File <input type = "file" name = "file" id ="file"><br><br>
  <input type = "submit" value = "submit">

</form>

</body>
</html>