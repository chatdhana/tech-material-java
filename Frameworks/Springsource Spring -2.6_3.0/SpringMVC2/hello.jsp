<%@ page session="false"%>
<!-- 
(JSTL1.1) apache 'jakarta-taglibs-standard-20051214.zip' download.
 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>        


<html>
<head><title>Example :: Spring Application</title>
</head>
<body>
 
<h1>Hello ,Hello,Hello - Spring Application....</h1>

<%-- current date & time is s is retrieved from the model --%>
    
<p>Greetings, it is now :  <c:out value="${now}"/></p>

</body>
</html>
