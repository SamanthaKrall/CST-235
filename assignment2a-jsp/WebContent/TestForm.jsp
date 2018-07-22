<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Form</title>
</head>
<body>

<h2>HTML Forms</h2>

<form action="HandleFormInput" method="post">
  First name:<br>
  <input type="text" name="firstname" value="Mickey">
  <br>
  Last name:<br>
  <input type="text" name="lastname" value="Mouse">
  <br>
    Birth date: <br>
  <input type="text" birthdate="birthdate" value="05/13/1983">
  <br>
  Age: <br>
  <input type="text" age="age" value="35">
  <br>
  Favorite Color: <br>
  <input type="text" favoriteColor="color" value="Green">
  <br>
  <br><br>
  <input type="submit" value="Submit">

  
</form> 

<p>If you click the "Submit" button, the form-data will be sent to a page called "/action_page.php".</p>



</body>
</html>