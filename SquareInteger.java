package hwday12;

public class SquareInteger {

//find all perfect square using binary search O(logn)
	public static int findSquareNum(int num) {
		int start = 0;
		int end = num;
		int sqNum = 0;
		if (start >= end)
			return -1;
		while (start <= end) {
			sqNum = (start + end) / 2;
			if (sqNum * sqNum == num) {
				return sqNum;
			} else if (sqNum * sqNum < num) {
				start = start + 1;
			} else if (sqNum * sqNum > num) {
				end = sqNum - 1;
			}
		}
		return sqNum;
	}

//O(n)
	public static int countSqInt(int start, int end) {
		int num = findSquareNum(start) + 1;
		int count = 0;
		for (; num * num <= end; num++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 17;
		int b = 26;
		System.out.println("Square Integer between " + a + " and " + b + " : " + countSqInt(a, b));
	}
}
//total O(n)