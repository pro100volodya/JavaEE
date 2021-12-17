<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Travel agency</title>
</head>
<body>

<form action="travel" method="POST">
   <br>Welcome to our travel agency, please fill in the following fields</br>
    <br>Full name: <input name="username" /></br>
    <br>Age: <input name="userage" /></br>
    <br>Price: <input name="userprice" /></br>
    <br>Gender: <input type="radio" name="gender" value="female" checked />Female
    <input type="radio" name="gender" value="male" />Male </br>
    <br>Country: <select name="country">
    <option>Canada</option>
    <option>Spain</option>
    <option>France</option>
    <option>Germany</option>
    <option>Brazil</option>
    <option>India</option>
    <option>Argentina</option>
    <option>Kazakhstan</option>
    <option>Turkey</option>
    <option>Egypt</option>
</select></br>
    <br><input type="submit" value="Submit" />
    </br>
</form>
</body>
</html>