<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	
	<body>
		Student: ${ student.firstName } ${ student.lastName }
		<br/>
		Country: ${ student.country }
		<br/>
		Student's favorite Language: ${ student.favoriteLanguage }
		<br/>
		Operating systems:
		<ul>
			<c:forEach var="temp" items="${ student.operatingSystems }">
			<li>${ temp }</li>
			</c:forEach>	
		</ul>
	
	</body>
</html>