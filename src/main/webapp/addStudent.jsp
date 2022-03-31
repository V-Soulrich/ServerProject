<%--
  Created by IntelliJ IDEA.
  User: SRZ17
  Date: 2022/3/12
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme () + "://" +
            request.getServerName () + ":" + request.getServerPort () +
            request.getContextPath () + "/";
%>

<html>
<head>
    <title>注册学生</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<div align="center">
    <form action="student/addStudent.do" method="post">
        <table>
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="name"></td>
                <%--name要和StudentController中参数那个类的属性名一致--%>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="text" name="age"></td>
                <%--name要和StudentController中参数那个类的属性名一致--%>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
