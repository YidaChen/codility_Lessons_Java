package L3_TimeComplexity;

public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int solution(int[] A) {
		long ans = 0;
        for(int i = 0; i < A.length; i++)
            ans = ans - A[i] + (i+1);
        ans += A.length + 1;
        return (int) ans;
    }
}
