<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<canvas id="myChart" width="400" height="400"></canvas>


<script type="text/javascript" src="/plugins/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/plugins/Chart.min.js"></script>
<script type="text/javascript">
	$(function(){
		var ctx = $("#myChart").get(0).getContext("2d");
		var myNewChart = new Chart(ctx);
		new Chart(ctx).PolarArea(data,options);
	})
</script>
</body>
</html>