package zj.jsp.report.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zj.jsp.report.model.TradeMsg;
import zj.jsp.report.service.ReportService;
import zj.jsp.report.service.impl.ReportServiceImpl;

public class ReportServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	ReportService reportService = new ReportServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		List<TradeMsg> list = reportService.getTradeList();

		req.getSession().setAttribute("list", list);

		resp.sendRedirect("index.jsp");

	}

}
