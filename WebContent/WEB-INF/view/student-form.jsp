<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title></title>
	</head>
	
	<body>
	
		<form:form action="processForm" modelAttribute="student">
			First name: <form:input path="firstName" placeholder="What's your name"/>
			<br/>
			Last name: <form:input path="lastName" placeholder="What's your lastname"/>
			<br/>
			<form:select path="country">
				<form:options items="${ theCountryOptions }"/>
			</form:select>
			<br/>
			<!--  
			Java <form:radiobutton path="favoriteLanguage" value="Java"/>
			Python <form:radiobutton path="favoriteLanguage" value="Python"/>
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
			JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript"/>
			-->
			<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOpts}"/>
			<br/>
			<input type="submit" value="Submit">
			
		</form:form>
	
	</body>
</html>