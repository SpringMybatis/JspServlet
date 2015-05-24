package zj.jsp.report.dao.impl;

import java.util.ArrayList;
import java.util.List;

import zj.jsp.report.dao.ReportDAO;
import zj.jsp.report.model.TradeMsg;

public class ReportDAOImpl implements ReportDAO {

	private static List<TradeMsg> list = new ArrayList<TradeMsg>();
	
	static{
		
		TradeMsg tm1 = new TradeMsg(1500, 12, 58,"小米2",6800);
		TradeMsg tm2 = new TradeMsg(1503, 16, 69,"小米3",7900);
		TradeMsg tm3 = new TradeMsg(1505, 35, 45,"红米标准版",6700);
		TradeMsg tm4 = new TradeMsg(1509, 67, 98,"红米增强版",9400);
		TradeMsg tm5 = new TradeMsg(1512, 12, 34,"IPHONE5",9300);
		TradeMsg tm6 = new TradeMsg(1515, 28, 54,"IPHONES",9900);
		TradeMsg tm7 = new TradeMsg(1519, 76, 88,"IPHONE6",18000);
		TradeMsg tm8 = new TradeMsg(1528, 39, 63,"IPHONE6 PLUS",15000);
		TradeMsg tm9 = new TradeMsg(1534, 34, 58,"MX3",5400);
		TradeMsg tm10 = new TradeMsg(1546, 28, 58,"MX4",6900);
		TradeMsg tm11 = new TradeMsg(1578, 18, 21,"MX2",3200);
		
		list.add(tm1);
		list.add(tm2);
		list.add(tm3);
		list.add(tm4);
		list.add(tm5);
		list.add(tm6);
		list.add(tm7);
		list.add(tm8);
		list.add(tm9);
		list.add(tm10);
		list.add(tm11);
	}
	
	
	
	
	public List<TradeMsg> getTradeList() {
		
		// todo JDBC
		
		
		return list;
	}

}
