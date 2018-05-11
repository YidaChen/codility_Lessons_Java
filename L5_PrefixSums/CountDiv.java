package L5_PrefixSums;

public class CountDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int solution(int A, int B, int K) {
		int ans = B/K - A/K;
        if(A % K == 0)
            ans++;
        return ans;
    }
}
