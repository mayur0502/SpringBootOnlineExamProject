<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration Page</title>
	<link rel="icon" href="images/jbklogo.jpg">
	<style><%@include file="../css/style.css"%></style>
</head>
<body>
	<form style="border:none" action="/addStudent">
		<div style="text-align: center">
			<h1>
				Student/User Registration
			</h1>			
		</div>
		<div class="regcontainer">
			<table>
				<tr>
					<td><label>First Name:</label></td> 
					<td><input type="text" name="firstName" placeholder="First Name" required></td>
				</tr>
				<tr>
					<td><label>Last Name:</label></td> 
					<td><input type="text" name="lastName" placeholder="Last Name" required></td>
				</tr>
				<tr>
					<td><label>Mobile:</label></td> 
					<td><input type="text" name="mobile" pattern="[7-9]{1}[0-9]{9}" placeholder="Mobile" required></td>
				</tr>
				<tr>
					<td><label>Email:</label></td> 
					<td><input type="text" name="email" pattern="[a-z]+[a-zA-Z0-9!]+@gmail.com" placeholder="email" required></td>
				</tr>
				<tr>
					<td><label>Batch:</label></td> 
					<td><input type="text" name="batchCode" placeholder="Batch Code" required></td>
				</tr>
				<tr>
					<td><label>Username:</label></td> 
					<td><input type="text" name="username" placeholder="New Username" required></td>
				</tr>
				<tr>
					<td><label>Password:</label></td> 
					<td><input type="password" name="password" placeholder="Password" required></td>
				</tr>
				<tr>
					<td><button style="width: auto" type="submit">Submit</button></td>	
					<td><a style="float: right" href="/"><b>Already have an account? Goto Login Page</b></a></td>			
				</tr>
			</table>
		</div>
	</form>
</body>
</html>