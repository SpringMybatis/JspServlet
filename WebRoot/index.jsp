<%@ page language="java" import="java.util.*,zj.jsp.report.*"
	pageEncoding="UTF-8"%>
<%@page import="zj.jsp.report.model.TradeMsg"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>jspreport报表</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<body>
		<form action="ReportServlet" method="post">
			<input type="submit" value="查询报表数据" />
		</form>

		<br>
		<br>
		<br>
		<br>
		<br>

		<table border="1" background="#gukgjk">

			<%
				List<TradeMsg> tradeList = (List<TradeMsg>) request.getSession().getAttribute("list");
			%>


			<%
				if (tradeList != null && !tradeList.isEmpty()) {
			%>
			<thead>
				<tr>
					<td colspan="5">
						<center>
							5月份手机销售报表
						</center>
					</td>
				</tr>
				<tr>
					<td>
						交易ID
					</td>
					<td>
						商品名称
					</td>
					<td>
						交易笔数
					</td>
					<td>
						交易数量
					</td>
					<td>
						交易利润
					</td>
				</tr>
			</thead>
			<tbody>

				<%
					int temp1 = 0;
						int temp2 = 0;
						int temp3 = 0;
						for (TradeMsg tradeMsg : tradeList) {
							temp1 += tradeMsg.getTradeNum();
							temp2 += tradeMsg.getTradeCount();
							temp3 += tradeMsg.getTradeProfit();
				%>
				<tr>
					<td><%=tradeMsg.getTradeId()%></td>
					<td><%=tradeMsg.getTradeName()%></td>
					<td><%=tradeMsg.getTradeNum()%></td>
					<td><%=tradeMsg.getTradeCount()%></td>
					<td><%=tradeMsg.getTradeProfit()%></td>
				</tr>
				<%} %>
				<tr>
					<td colspan="2">
						<center>
							合计
						</center>
					</td>
					<td><%=temp1%></td>
					<td><%=temp2%></td>
					<td><%=temp3%></td>
				</tr>
			</tbody>
			<%
				}
			%>
		</table>
	</body>
</html>
