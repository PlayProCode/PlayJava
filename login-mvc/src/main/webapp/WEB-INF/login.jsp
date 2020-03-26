<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
form{
	background-color: skyblue;
	width: 250px;
	height: 200 px;
	border-style: solid;
	border-color: blue;
	padding: 10px;
}
</style>


<div>
	<form action="/login" method="post">
		<c:if test="${not empty error}">
			<div style="color: red;"><h3>${error}</h3></div>
			<div><br></div>
		</c:if>
		<c:if test="${not empty registerSuccess}">
			<div style="color:yellow;"><h3>${registerSuccess}</h3></div>
			<div><br></div>
		</c:if>
		<c:if test="${not empty registrationError}">
			<div style="color:red;"><h3>${registrationError}</h3></div>
			<div><br></div>
		</c:if>
		<div>UserName : <input type="text" name="userName" value=""><br></div>
		<div><br></div>
		<div>Password : <input type="text" name="password" value=""></div>
		<div><br></div>
		<div><input type="submit" value="Login" style="background-color: lime;"></div>
		<div><br></div>
		<div><input type="button" value="Register" onclick="goToRegister()" style="background-color: orange;"></div>
	</form>
</div>
<script type="text/javascript">
	function goToRegister(){
		window.location.href="/register";
	}
</script>

