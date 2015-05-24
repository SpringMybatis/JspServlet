package zj.jsp.report.service.impl;

import java.util.List;

import zj.jsp.report.dao.ReportDAO;
import zj.jsp.report.dao.impl.ReportDAOImpl;
import zj.jsp.report.model.TradeMsg;
import zj.jsp.report.service.ReportService;

public class ReportServiceImpl implements ReportService {

	
	ReportDAO reportDAO = new ReportDAOImpl();
	
	public List<TradeMsg> getTradeList() {
		
		return reportDAO.getTradeList();
	}

}
