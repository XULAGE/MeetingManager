<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>注册</title>
	<style type="text/css">
		html, body, div, ul, li, h1, h2, h3, h4, h5, h6, p, dl, dt, dd, ol, form, input, textarea, th, td, select {
    		margin: 0;
   		 	padding: 0;
		}
		html,body{
			height: 100%;width: 100%;margin:0;padding:0;
		} 
		body{
			font-family: "宋体","微软雅黑";
			background: url(${pageContext.request.contextPath}/images/denglubeijing.jpg) no-repeat;
			background-size:100% 100%;
			-moz-background-size:100% 100%;
		}
		form{
			position:absolute;
			height: 524px;
			width: 800px;
			border-radius:10px;
			margin: auto;
			top: 0; left: 0; bottom: 0; right: 0; 
			background-color: rgba(0,0,0,0.15);
			color: white;
		}
		form .header{
			height: 43px;
			width: 744px;
			border-bottom: 1px solid #9399AF;
			padding-top: 31px;
			font-size: 15px;
			line-height: 43px;
			margin:0 auto;
		}
		form .header a{
			color: #9CCA34;
			cursor:pointer;
		}
		form .cl{
			height: 7px;
			clear: both;
		}
		form .mid{
			width: 464px;
			margin: 0 auto;
		}
		form .mid .zi{
			width: 84px;
			float: left;
			height: 41px;
			padding-top: 10px;
			line-height: 41px;
			font-size: 15px;
			text-align:justify;
    		text-justify:distribute-all-lines;/*ie6-8*/
    		text-align-last:justify;/* ie9*/
    		-moz-text-align-last:justify;/*ff*/
    		-webkit-text-align-last:justify;/*chrome 20+*/
		}
		form .mid .kuang{
			width: 380px;
			float: right;
			height: 41px;
			padding-top: 11px;
		}
		form .mid .kuang input{
			height: 41px;
			width: 332px;
			border: 0;
			border-radius:5px;
            padding-left: 20px;
		}
		form .mid .yanzheng{
			width: 380px;
			float: left;
			height: 41px;
			padding-top: 11px;
		}
		form .mid .yanzheng input{
			height: 41px;
			width: 194px;
			border: 0;
			border-radius:5px;
            padding-left: 20px;
		}
		form .mid .matu{
			border: 1px solid white;
			float: right;
			width: 110px;
			height: 39px;
			margin-top: 11px;
			margin-right: 28px;
		}
		.cl1{
			height: 29px;
			clear: both;
		}
		form div #anniu{
			background-color: #89BA3B;
			color: white;
			height: 45px;
			width: 150px;
			margin: 0 297px 0 353px;
			border-radius:5px;
			font-size: 17px;
			font-weight: bold;
		}
		.right {  /*正确的*/
            color: #5EFF5E;
            background:url(${pageContext.request.contextPath}/images/right.png) no-repeat 4px 3px;
			background-color: rgba(0,0,0,0);
        }
        .wrong {  /*错误的*/
            background:url(${pageContext.request.contextPath}/images/wrong.png) no-repeat 4px 3px;
            color: #FF6B39;
            background-color: rgba(0,0,0,0);
        }
        form .mid .kuang span{
        	height: 39px;
        	width: 20px;
        	float: right;
        }
        .xiaoshou{
        	cursor: pointer;
        }
        form .mid .row{

        }
	</style>
	<script src="../js/jquery-3.3.1.min.js"></script>    
	
	<script>
		window.onload = function()
        {
            function $(id){return document.getElementById(id);}
            $("txt").onblur = function() 
            {
                str = new String(this.value);
                var reg = /^[0-9a-zA-Z]+$/
                if(str.length == 0){
                    $("result").className ="wrong";
                }
                else if(str.length<=7||str.length>=16)
                {
                    $("result").className ="wrong";
                }
                else if(!reg.test(str))
                {
                    $("result").className ="wrong"; 
                }
                else 
                {
                    $("result").className ="right";
                    $("anniu").disabled = false;
                }
            }
            $("mima").onblur = function() 
            {
                str = new String(this.value);
                var reg = /^[0-9a-zA-Z]+$/
                if(str.length == 0){
                    $("result1").className ="wrong";
                }
                else if(str.length<=5||str.length>=16)
                {
                    $("result1").className ="wrong";
                }
                else if(!reg.test(str))
                {
                    $("result1").className ="wrong";   
                }
                else 
                {
                    $("result1").className ="right";
                    $("anniu").disabled = false;
                }
            }
            $("queren").onblur = function()
            {
            	
            	//alert(qr);
                if(this.value =="")
                {
                    $("result2").className ="wrong";
                }
            	else if(this.value == $("mima").value)
            	{
            		$("result2").className = "right";
                    $("anniu").disabled = false;
            	}
            	else 
                {
                    $("result2").className ="wrong";
                }
            } 
            $("haoma").onblur = function()
            {
            	str = new String(this.value);
            	if(isNaN(str))
            	{
            		$("result3").className ="wrong";
            	}
                else if(str.length != 11)
                {
                    $("result3").className ="wrong";
                }
                else
                {
                	$("result3").className ="right";
                    $("anniu").disabled = false;
                }
            } 
            $("anniu").onmouseover = function()
            {
                if($("result3").className =="right" && $("result2").className == "right" && $("result").className =="right" && $("result1").className =="right")
                {
                    $("anniu").disabled = false;
                    $("anniu").className = "xiaoshou";
                }
                else
                {
                    $("anniu").disabled = true;
                }
            }
        }
	</script>
    <script type="text/javascript">
        function sub(){
            var authCode=document.getElementById("authCode").value;
            var txt=document.getElementById("txt").value;
            var mima=document.getElementById("mima").value;
            var haoma=document.getElementById("haoma").value;
            var email=document.getElementById("email").value;
            if(txt && mima && haoma && email){
                $.ajax({
                       type: "POST",
                       url: "${pageContext.request.contextPath}/User/add",
                       data: {
                            authCode:authCode,
                            userid:txt,
                            userpw:mima,
                            phone:haoma,
                            email:email,
                       },
                       success: function(data){
                            var data = eval('(' + data + ')');
                            if (data.status==1){
                                location.href="${pageContext.request.contextPath}/";
                            }
                            else if(data.status==2){
                                alert("验证码错误！");//成功后需要把这反馈改成在验证码右边显示
                            }
                            //假如账号冲突返回什么
                        }
                });
            }
        }
    </script>
</head>
<body>
	<form >
		<div class="header">
			欢迎您注册网站管理员，如果您已拥有网站账号，则可在此<a href="index.html">登录</a>
		</div>
		<div class="cl"></div>
		<div class="mid">
			<p class="zi">用户名：</p><p class="kuang"><input type="text" placeholder="请输入8到15位的数字或字母,字母区分大小写(必填)" id="txt" name="txt" /> <span id="result"></span></p>
			<p class="zi">设置密码：</p><p class="kuang"><input type="password" placeholder="请输入6到15位的数字或字母,字母区分大小写(必填)" id="mima" /> <span id="result1"></span></p>
			<p class="zi">确认密码：</p><p class="kuang"><input type="password" placeholder="请再次确认密码(必填)" id="queren" /> <span id="result2"></span></p>
			<p class="zi">手机号码：</p><p class="kuang"><input type="text" placeholder="请输入11位手机号码，用于找回密码(必填)" id="haoma" /> <span id="result3"></span></p>
			<p class="zi">邮箱：</p><p class="kuang"><input type="text" placeholder="请输入邮箱地址"/ id="email"></p>
			<!-- <p class="zi">验证码：</p><p class="yanzheng"><input type="text" placeholder="请输入验证码(必填)"/ id="yz"></p><div class="matu">验证码</div> --> <p class="zi">验证码：</p>
            <div class="yanzheng">
               <input id="authCode" type="text" placeholder="请输入验证码">
                <img src="${pageContext.request.contextPath}/kaptcha/getKaptchaImage" alt="验证码" onclick="this.src='${pageContext.request.contextPath}/kaptcha/getKaptchaImage'" >   
                    <!-- <a id="kanbuq" href="javascript:;">看不清，换一张</a>  -->
            </div>
		</div>
		<div class="cl1"></div>
		<div><input type="button" onclick="sub()" value="注册" id="anniu"/></div>
	</form>
</body>
</html>
