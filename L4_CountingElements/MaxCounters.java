package L4_CountingElements;

public class MaxCounters {

	public static void main(String[] args) {
		
	}
	public static int[] solution(int N, int[] A) {
        int[] ans = new int[N];
        int max = 0;
        int min = 0;
        for(int i = 0; i < A.length; i++){
            int idx = A[i]-1;
            if(A[i] == N + 1){
                min = max;   //所有counter必須更新至max
            } else {
                ans[idx] = Math.max(ans[idx], min) + 1;
                max = Math.max(max, ans[idx]);
            }
        }
        for(int j = 0; j < ans.length; j++)
            ans[j] = Math.max(ans[j], min); //把沒有在else更新的counter更新
        return ans;
    }
}