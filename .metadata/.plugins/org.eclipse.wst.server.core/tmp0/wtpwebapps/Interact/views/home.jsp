<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="homePage.title"/></title>
</head>
<body>
	<spring:message code="homePage.label.welcome" arguments="${user}"/>
	
	<br>
	<br>
	
	
	<a href="#movieForm"><button><spring:message code="homePage.label.create"></spring:message></button></a>
	
	<a href="/movie/update"><button><spring:message code="homePage.label.update"></spring:message></button></a>
	
	<a href="/movie/delete"><button><spring:message code="homePage.label.delete"></spring:message></button></a>
	
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
		
	<form action="/movie/add" id="movieForm">
		<table border="0">
			<tr>
				<td>Movie title</td>					
				<td><input type="text"/></td>
			</tr>
			<tr>
				<td>Genre </td>
				<td><select>
					<option>Action</option>
					<option>Adventure</option>
					<option>Comedy</option>
					<option>Crime</option>
					<option>Drama</option>
					<option>SciFi</option>
					<option>Western</option>
				</select></td>
				</tr>
				<tr>
					<td>Year</td>
					<td>
						<select>
					<%for(int i = 1950; i<2018;i++){ %>
						<option name="year" value="<%=i%>"><%=i%></option>
					<%} %>
						</select>
					</td>
				</tr>
				<tr></tr>
				<tr>
					<td></td><td> Director</td> 
				</tr>
				<tr>
					<td>Name</td><td>First Name</td><td>Year of Birth</td>
				</tr>
				<tr>
					<td><input type="text" name="directorName"></td><td><input type="text" name="directorFN"></td><td><select>
					<%for(int i = 1930; i<2001;i++){ %>
						<option name="directorYoB" value="<%=i%>"><%=i%></option>
					<%} %>
						</select></td>
				</tr>
				<tr></tr>
				<tr><td></td><td><input type="submit" name="movieForm"value="Create movie"></td></tr>		
		
			</table>
		
	</form>
</body>
</html>