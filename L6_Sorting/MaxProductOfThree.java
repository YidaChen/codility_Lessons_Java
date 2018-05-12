package L6_Sorting;
import java.util.Arrays;
public class MaxProductOfThree {

	public static void main(String[] args) {
		
	}
	public static int solution(int[] A) {
        Arrays.sort(A);
        int ans1 = A[0]*A[1]*A[A.length-1];
        int ans2 = A[A.length-1]*A[A.length-2]*A[A.length-3];
        
        return Math.max(ans1, ans2);
    }
}