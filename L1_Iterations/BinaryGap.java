package L1_Iterations;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(1041));

	}

	public static int solution(int N) {
		String str = Integer.toBinaryString(N);
		boolean one = false;
		int maxCount = 0;
		int count = 0;

		for (int i = 0, n = str.length(); i < n; i++) {
			char c = str.charAt(i);
			if (c == '1' && one) {
				if (count > maxCount)
					maxCount = count;
				count = 0;
			} else if (c == '1' && !one) // 第一個1
				one = true;
			else // c == '0'
				count++;
		}
		return maxCount;
	}
}
