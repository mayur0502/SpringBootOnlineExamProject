<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		a.card,
		a.card:hover {
		  color: #212529;
		  text-decoration: none;
		  background-color: #f1f1f1;
		  border-radius: 10%;
		  width: 250px;
		  height: 120px;
		}
		h2 {
			color: green;
			font-size: 40px;
			text-align: center;
			margin: 25px;
		}
		.icon{
			width: 50px;
			height: 50px;
		}
	</style>
		
	<meta charset="UTF-8">
	<title>Home</title>
	
	<%@ include file="header.jsp" %>
	<%@ include file="footer.jsp" %>    
</head>
<body>
	<h2>${welcome}</h2>	
	<div style="margin-left: 50px;">
		<table style="width:80%;text-align: center">
			<tr>
				<td>
					<a href="/takeExam" class="card" style="width: 15rem; display: inline-block">
						<table>
							<tr>
								<td><img class="icon" src="images/test.png" alt="Card image cap"/></td>
								<td><h3 class="card-title">Take Exam</h3></td>
							</tr>
						</table>
					    <p>Take an online java exam.</p>
					</a>
				</td>
				<td>
					<a href="/scoreBoard" class="card" style="width: 15rem; display: inline-block">
						<table>
							<tr>
								<td><img class="icon" src="images/score.png" alt="Card image cap"/></td>
								<td><h3 class="card-title">View Scoreboard</h3></td>
							</tr>
						</table>
					</a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>