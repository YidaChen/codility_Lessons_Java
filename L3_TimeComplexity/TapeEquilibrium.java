package L3_TimeComplexity;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int ans = solution(new int[]{3, 1, 2, 4, 3});
		System.out.println(ans);
	}
	public static int solution(int[] A) {
		int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++)
            sum += A[i];
        for(int j = A.length-1; j > 0; j--){
            sum -= 2 * A[j];
            if(Math.abs(sum) < ans)
                ans = Math.abs(sum);
        }
        return ans;
    }
}