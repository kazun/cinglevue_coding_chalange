<%@page contentType="text/html" import="java.util.*"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="baseURL"
	value="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, pageContext.request.contextPath)}" />

<!DOCTYPE html>
<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" />
</title>

<link href="${baseURL}/static/css/table.css" rel="stylesheet" media="screen">
<link href="${baseURL}/static/css/bootstrap.min.css" rel="stylesheet"
	media="screen">

<script type="text/javascript" language="javascript"
	src="${baseURL}/static/js/jquery.js"></script>
<script type="text/javascript" language="javascript"
	src="${baseURL}/static/js/jquery.dataTables.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${baseURL}/static/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container">

		<tiles:insertAttribute name="header" />

		<hr />

		<tiles:insertAttribute name="body" />


		<hr />

		<tiles:insertAttribute name="footer" />

	</div>
	<!-- /container -->
</body>
</html>