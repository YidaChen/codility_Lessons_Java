package L2_Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		

	}
	public static int[] solution(int[] A, int K) {
		int len = A.length;
		if(len == 0) return A;
		K = K % len;
        int[] B = new int[len];
        for(int i = 0; i < len; i++)
            B[i] = A[i];
        
        for(int i = 0; i < len; i++)
            A[i] = B[(i+len-K)%len];
        return A;
    }
}
