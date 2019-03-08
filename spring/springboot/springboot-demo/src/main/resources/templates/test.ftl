<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form style="text-align: center" action="${rootPath.contextPath}/date.do">
    <h3>Date数据绑定的验证</h3>
    <input type="text" name="createTime" id="createTime" value="2018-05-28">
    <input type="text" name="person.birthday" id="birthday" value="2018-05-28">
    <input type="text" name="personList[0].birthday" id="date" value="2018-05-28">
    <input type="text" name="person.name" id="name" value="null">
    <button type="button" id="sub">提交</button>

    <h2>json特殊字符串解析报错验证</h2>
    <button type="button" id="jsonValidate">验证</button>
</form>

</body>


<script src="${rootPath.contextPath}/static/jquery-1.11.3-min.js"></script>

<script>
           $(function () {
               var p = ${person};
               $('#sub').click(function () {
                   $.ajax({
                       type    :'post',
                       url     :'http://localhost:18080/date.do',
                       data    :p,
                       dataType:'json',
                       success:function (data) {
                           alert(JSON.stringify(data));
                       }
                   })
               })
               $('#jsonValidate').click(function () {
                   $.ajax({
                       type    :'post',
                       url     :'http://localhost:18080/jsonValidate.do',
                       data    :'',
                       dataType:'text',
                       success:function (data) {
                           console.log(JSON.parse(data))
                       }
                   })
               })
           })
</script>


</html>