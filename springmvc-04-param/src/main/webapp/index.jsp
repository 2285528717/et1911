<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>首页</title>
	</head>
	<body>
		<h2>测试数组传参</h2>
		<form enctype="application/x-www-form-urlencoded" action="${pageContext.request.contextPath}/complex/array" method="post">
			爱好:
			<input type="checkbox" name ="hobby" value="踢球">踢球
			<input type="checkbox" name ="hobby" value="听音乐">听音乐
			<input type="checkbox" name ="hobby" value="看书">看书
			<BR>
			<BR>
			<input type="submit" value="测试数组传参" />
		</form>
		<hr />
		<h2>测试List传参</h2>
		<form enctype="application/x-www-form-urlencoded" action="${pageContext.request.contextPath}/complex/list" method="post">
			爱好:
			<input type="checkbox" name ="hobbyList" value="踢球">踢球
			<input type="checkbox" name ="hobbyList" value="听音乐">听音乐
			<input type="checkbox" name ="hobbyList" value="看书">看书
			<BR>
			<BR>
			<input style="margin-top:10px" type="submit" value="测试List传参" />
		</form>
		<hr >
		<button id="testMap" type="button">测试Map传参</button>
		<hr >
		<button onclick="jsonToMap()" type="button">测试json转Map传参</button>
		<hr >
		<button onclick="jsonToList()" type="button">测试json转List传参</button>
		<hr >
		<button onclick="jsonToBean()" type="button">测试json转Java Bean</button>
		<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
		<script type="text/javascript">
			const path = "${pageContext.request.contextPath}"
			$(function() {
				//测试map传参
				$('#testMap').click(()=>{
					$.ajax({
						url:path + '/complex/map',
						type:'post',
						dataType:'text',//文本
						data:"stuMap['id']=1&stuMap['name']=xuance",
						success:function(data){
							alert(data);
						}
					});
				});
			});
			
			function jsonToMap() {
				let obj = {id:1,name:"大波波"};
				$.ajax({
					url:path +'/json/jsonToMap',
					type:'post',
					data:JSON.stringify(obj),//将js对象转换成json字符串
					dataType:'json',
					contentType:"application/json;charset=utf-8",
					success:function(data){
						alert(data.msg)
					}
				})
			}
			
			function jsonToList() {
				let array = [{id:2,name:"李白",age:21}];
				let user = {id:1,name:"韩信",age:20}
				array.push(user)
				
				$.ajax({
					url:path + '/json/jsonToList',
					type:'post',
					data:JSON.stringify(array),
					dataType:'json',
					contentType:"application/json;charset=utf-8",
					success:function(data){
						alert(data.code + " - " +data.msg);
					}
				})
			}
			
			function jsonToBean() {
				let obj = 
				{
					id:1,
					name:"玄策",
					age:20,
					hobbyList:["小疯子","甩钩"],
					stuMap:{id:2,score:200}
				}
				$.ajax({
					url:path + '/json/jsonToBean',
					type:'post',
					data:JSON.stringify(obj),
					dataType:'json',
					contentType:"application/json;charset=utf-8",
					success:function(data){
						alert(data.code + " : " +data.msg);
					}
				})
			}
		</script>
	</body>
</html>