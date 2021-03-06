<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>会议管理系统</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
<style type="text/css">
	.copydiv{
		border: 1px solid #fff;
		padding: 1em 0;
	}
</style>
</head>
<body>
<header class="header">
</header>
<section class="container">
	<div class="container">
		<p>复制会议号</p>
		<div class="row mt50">
		  <div class="col-lg-12">
			<div class="copydiv">请加入会议号为${mnum}的会议</div><br>
			<button type="button" class="btn btn-default" data-clipboard-action="copy" 
			data-clipboard-target=".copydiv">复制</button>
	</div>
</section>

<script src="${pageContext.request.contextPath}/js/clipboard.min.js"></script>

<script>
var clipboard = new Clipboard('.btn');

clipboard.on('success', function(e) {
	alert("文字已复制到剪贴板中");
	console.log(e);
});

clipboard.on('error', function(e) {
	console.log(e);
});
</script>

</body>
</html>