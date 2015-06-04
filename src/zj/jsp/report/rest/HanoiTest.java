package zj.jsp.report.rest;

public class HanoiTest {
	static int step = 0;

	/** 
	 * @param args 
	 */
	public static void main(String[] args) {
		hanioSort(3, "A", "B", "C");
	}

	/** 
	 * 递归函数，用来遍历hanoi步骤 
	 */
	public static void hanioSort(int num, String a, String b, String c) {
		if (num == 1) {
			move(num, a, c);
		} else {
			hanioSort(num - 1, a, c, b);
			move(num, a, c);
			hanioSort(num - 1, b, a, c);
		}
	}

	public static void move(int num, String a, String b) {
		step++;
		System.out.println("第" + step + "步，盘子" + num + "从" + a + "塔移到" + b
				+ "塔/n");
	}
}
