<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>	
<!DOCTYPE html>
<html>
<head>
<title>Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./resources/style.css" rel="stylesheet">
</head>
<body>
	<header>
	  <h2>Template</h2>
	</header>
	<section>
		<nav><tiles:insertAttribute name="header"/></nav>
		<article><tiles:insertAttribute name="body"/></article>
	</section>

	<footer>
		<p>Footer</p>
	</footer>
</body>
</html>
