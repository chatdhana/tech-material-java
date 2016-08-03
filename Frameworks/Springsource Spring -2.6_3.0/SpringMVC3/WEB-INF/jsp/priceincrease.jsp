<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>  
<!-- use spring.tld -->
<%@ taglib prefix="spring" uri="/spring" %>

<html>
<head><title><fmt:message key="title"/></title></head>
<body>
<h1><fmt:message key="priceincrease.heading"/></h1>
<form method="post">
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td alignment="right" width="20%">Increase (%):</td>
      
      <!-- 
      For the  input field, we surround it with a spring:bind tag and specify the "path" to the property we are concerned with, in this
       case priceIncrease.percentage, to refer to the percentageproperty of the model object stored in the request  object under the name command. 
      ie:
  The  spring:bind tag is used to bind an <input> form element to a command object PriceIncrease.java, 
  that is used together with the form. This command object is later passed in to the validator and if it passes
   validation it is passed on to the controller. The ${status.errorMessage} and ${status.value} are special
    variables declared by the framework that can be used to display error messages and the current value
     of the field.
  -->
  
      <spring:bind path="priceIncrease.percentage">
        <td width="20%">
          <input type="text" name="percentage" value="<c:out value="${status.value}"/>">
        </td>
        <td width="60%">
          <font color="red"><c:out value="${status.errorMessage}"/></font>
        </td>
      </spring:bind>
      
    </tr>
  </table>
  <br>
  
  <spring:hasBindErrors name="priceIncrease">
    <b>Please fix all errors!</b>
  </spring:hasBindErrors>
  
  <br><br>
  <input type="submit" alignment="center" value="Execute">
</form>
<a href="<c:url value="hello.htm"/>">Home</a>
</body>
</html>