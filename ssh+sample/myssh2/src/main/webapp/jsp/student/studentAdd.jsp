<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="addStudent" namespace="/" theme="simple">
<table>
	<tr>
		<td>student name</td>
		<td>
			<s:textfield name="studentVO.studentName" size="24" maxlength="25"/>
		</td>
	</tr>
	<input type="button" value="submit" onclick="submitAddStudent();">
</table>
</s:form>

<script language="javascript">
function submitAddStudent(){
	document.addStudent.submit();
	window.opener.location.reload();
	window.close();
}
</script>
</body>
</html>