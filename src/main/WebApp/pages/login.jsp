<html>
	<head>
		<title>Login</title>
		<link rel="icon" href="images/MayurtechLogo1.jpg">
		<style><%@include file="../css/style.css"%></style>
	</head>
	
	<body>
		
		<form name="login" action="login" method="post">
			<div>
				<a style="float: right" href="registration"> New Register/Sign Up </a><br>
			</div>
			
			<h1>
				Login
			</h1>
		<!-- 	<h4><span style="color: green">${success}</span></h4>
			 --><h4><span style="color: red">${error}</span></h4>
						
			<div class="imgcontainer">
				<img class="avatar" src="images/img_avatar.png"> 
			</div>
			
			<div class="container">
				<label>Username</label><br>
				<input type="text" name="username" placeholder="Enter username" ><br>
				
				<label>Password</label><br>
				<input type="password" name="password" placeholder="Enter password" ><br>
				
				<button type="submit">Login</button>				
			</div>
			
			<div class="container">		
				<label style="width:auto"><input type="checkbox">Remember me</label>		
				<span class="forgotpwd"><a href="https://www.facebook.com/login/">Forgot password?</a></span>
			</div>	
			<br>	
		</form>
	</body>
</html>