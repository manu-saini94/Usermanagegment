<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link href="<c:url value="CSS/userlogin.css" />" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<form class="form" action="login" method="post">
		<div id="wrapper">
			<div class="vertical-align-wrap">
				<div class="vertical-align-middle">
					<div class="auth-box">
						<div class="left">
							<div class="content">
								<div class="header">
									<div class="text-center">
										<img class="img-circle img-thumbnail img-responsive"
											src="http://www.ittutorials.in/images/mi-logo.jpg"
											alt="User Management">
									</div>
									<p class="lead">Login to your account</p>
								</div>
								<div class="form-group">
									<input name="username" type="text" id="txtusername"
										class="form-control" placeholder="Username">
								</div>
								<div class="form-group">
									<input name="password" type="password" id="txtpassword"
										class="form-control" placeholder="Password">
								</div>
								<div class="form-group">
									<label class="switch"> <input type="checkbox" checked>
										<span class="slider round"></span>
									</label> <span>Remember Me</span>
								</div>
								<div class="form-group">
									<input class="button" type="submit" value="LOGIN"></input>
								</div>
								<span class="helper-text"> <i class="fa fa-lock"> </i>
									&nbsp; <a class="forgot" href="forgotpassword">Forgot
										Password?</a>
								</span>
							</div>
						</div>
						<div class="right"></div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>