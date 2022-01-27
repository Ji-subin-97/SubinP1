<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>지수빈 포토폴리오 사이트</title>
		<link href="/css/common.css" rel="stylesheet" type="text/css">
		<link href="/css/index.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<div id="container">
				
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
			
			<main>
				<tiles:insertAttribute name="body"></tiles:insertAttribute>
			</main>
			
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
			
		</div>
	</body>
</html>