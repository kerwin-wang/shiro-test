<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2019/12/3
  Time: 0:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../../static/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#input_add").click(function () {
                $.ajax({
                    url: "/customer/add",
                    data: "",
                    type: "GET",
                    success: function (data) {
                        if (data.status == "SUCCESS"){
                            window.location.href = "/customer/update";
                        } else{
                            console.log(data.msg);
                        }
                    },
                    error: function () {
                        console.log("错误")
                    }
                });
            })
        })
    </script>
</head>
<body>
    登录成功
    <input id="input_add" type="button" value="添加"><br>
    <input id="input_update" type="button" value="修改"><br>
    <a href="/user/logout">退出</a>
</body>
</html>
