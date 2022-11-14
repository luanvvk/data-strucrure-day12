package hwday12;

import java.util.HashMap;

public class OddTimesAppearNumber {
	public static int countAppearance(int n, int arr[]) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
	
		for (int i = 0; i < n; i++) {
			if (hmap.containsKey(arr[i])) {
				hmap.put(arr[i], hmap.get(arr[i]) + 1);
			} else {
				hmap.put(arr[i], 1);
			}
		}
		for (Integer a:hmap.keySet()) {
			if (hmap.get(a) % 2 == 1) {
				System.out.println("Value " + a +  " appeared " + hmap.get(a) + " times ");
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 6, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		int n = arr.length;
		countAppearance(n, arr);
	}
}
//O(n)