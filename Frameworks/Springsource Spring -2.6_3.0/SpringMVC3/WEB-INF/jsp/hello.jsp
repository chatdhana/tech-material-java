<%@ page session="false"%>
<!-- 
(JSTL1.1) apache 'jakarta-taglibs-standard-20051214.zip' download.
 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>        

<html>
<head><title><fmt:message key="title"/></title></head>
<body>
<h1><fmt:message key="heading"/></h1>
<!-- JSTL fmt:message tag that pulls the text to display from a provided 'message' source . -->
<p><fmt:message key="greeting"/> <c:out value="${model.now}"/>
</p>
<h2>Products...</h2>
<c:forEach items="${model.products}" var="prod">
  <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
</c:forEach>
<br>
<a href="<c:url value="priceincrease.htm"/>">Increase Prices</a>
<br>
</body>
</html>
