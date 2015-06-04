package zj.jsp.report.rest;

public class Hanoi {

	
	
	/**
	 * 移动步数 
	 */
	private int moveStep;
	
	
	/**
	 * 移动盘子
	 * 
	 * @param panNum   盘子标识
	 * @param A        起始柱子
	 * @param B        中间柱子
	 * @param C        目的柱子
	 */
	public void moveHanoi(int panNum,String A,String B,String C){
		if(panNum==1){
			moveTarget(panNum, A, C);
		}else{
			// 中间柱子B
			moveHanoi(panNum-1, A, B, C);
			// A挪到C
			moveTarget(panNum, A, C);
			// 中间柱子A
			moveHanoi(panNum-1, B, A, C);
		}
	}
	
	
	/**
	 * 移动到目的位置
	 * 
	 * @param panNum           只有一个盘子
	 * @param startPosition
	 * @param targetPosition
	 */
	public void moveTarget(int panNum,String startPosition,String targetPosition){
		moveStep ++;
		System.out.println("第"+moveStep+"步：盘子"+panNum+"从"+startPosition+"挪到"+targetPosition);
	}
	
	
	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();
		hanoi.moveHanoi(3, "A", "B", "C");
	}

}
