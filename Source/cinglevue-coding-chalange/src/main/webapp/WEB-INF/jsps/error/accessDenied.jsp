<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="baseURL"
	value="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, pageContext.request.contextPath)}" />


<div style="padding: 0 .7em;" class="ui-state-error ui-corner-all">
	<p align="center">
		<img src="${baseURL}/static/img/denied.png" width="170" height="170"/>
		
	</p>
	<p align="center" style="font-size:26px; padding-bottom:20px;">Access Denied</p>
</div>