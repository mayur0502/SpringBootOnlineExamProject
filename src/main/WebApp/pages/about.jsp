<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		.card{
		  color: #212529;
		  text-decoration: none;		  
		  border-radius: 5%;
		  width: 60%;
		  height: auto;		  
		  padding: 10px;
		  margin: 20px auto;
		}
		.about{			
			width: 100%;
			height: 400px;
			display: block;
			margin-left: auto;
			margin-right: auto;
			border-radius: 5%;
		}
	</style>

	<meta charset="UTF-8">
	<title>About</title>
	<%@ include file="header.jsp" %>  
<%@ include file="footer.jsp" %>
</head>
<body>
	<div>
		<table style="background-color: #f1f1f1;margin-top: 10px;">
			<tr>
				<td>
					<div class="card">
						<h2>What we do?</h2>
						<ul>
						<li><p>We understand that individual learning capabilities are different and so we offer customized course for each student.</p></li>
						<li><p>We provide 100% practical and real time training on Java, Selenium Testing, Spring and Python.</p></li>
						<li><p>Our Java Tutorials are made easy to learn for beginners to advanced learners. Hence, we don’t assume any existing knowledge of development from the readers.</p></li>
						</ul>
					</div>
				</td>
				<td>
					<img class="about" src="images/what-we-do.png" alt="what-we-do"/>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>