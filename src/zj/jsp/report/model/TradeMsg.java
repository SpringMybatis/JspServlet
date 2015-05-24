package zj.jsp.report.model;

public class TradeMsg {

	/**
	 * 交易ID
	 */
	private int tradeId;

	/**
	 * 交易笔数
	 */
	private int tradeNum;

	/**
	 * 交易数量
	 */
	private int tradeCount;

	/**
	 * 商品名称
	 * 
	 */
	private String tradeName;

	/**
	 * 交易利润
	 * 
	 */
	private int tradeProfit;

	public TradeMsg() {

	}

	public TradeMsg(int tradeId, int tradeNum, int tradeCount,
			String tradeName, int tradeProfit) {
		super();
		this.tradeId = tradeId;
		this.tradeNum = tradeNum;
		this.tradeCount = tradeCount;
		this.tradeName = tradeName;
		this.tradeProfit = tradeProfit;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public int getTradeNum() {
		return tradeNum;
	}

	public void setTradeNum(int tradeNum) {
		this.tradeNum = tradeNum;
	}

	public int getTradeCount() {
		return tradeCount;
	}

	public void setTradeCount(int tradeCount) {
		this.tradeCount = tradeCount;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public int getTradeProfit() {
		return tradeProfit;
	}

	public void setTradeProfit(int tradeProfit) {
		this.tradeProfit = tradeProfit;
	}

}
