<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h2 style="text-align: center">welcome!my baby!</h2>
<div style="align-content: center">
    <button onclick="doClick()">测试按钮</button>
</div>
</body>

<script src="../static/jquery-1.11.3-min.js"></script>
<script>
    function doClick() {
        $.post('/rest/find/all',function (data) {
            alert(data)
        })
    }
</script>

</html>