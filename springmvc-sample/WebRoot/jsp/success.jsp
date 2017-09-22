<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
	/success.jsp<br/>
	成功<br/>
	${user.id}<br/>
	${user.username}<br/>
	${user.salary}<br/>
	
	<fmt:formatDate
		value="${user.hiredate}"
		type="both"
		dateStyle="full"
		timeStyle="default"
	/>
	
	<br/>
  
  </body>
</html>
