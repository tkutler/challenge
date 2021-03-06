<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New</title>
</head>
<body>
<div>
   
<h1>New Song</h1>
<form:form action="/songs" method="post" modelAttribute="songs">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="artist">artist</form:label>
        <form:errors path="artist"/>
        <form:textarea path="artist"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:input type="number" min="1" max="10"  path="rating"/>
        
    </p>
    <input type="submit" value="Submit"/>
    
</form:form>  
</div>
</body>
</html>