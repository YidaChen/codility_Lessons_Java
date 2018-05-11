package L4_CountingElements;

public class PermCheck {

	public static void main(String[] args) {
		

	}
	public static int solution(int[] A) {
        boolean[] bool = new boolean[A.length];
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] > A.length || bool[A[i]-1])
                return 0;
            bool[A[i]-1] = true;
        }
        return 1;
    }
}
