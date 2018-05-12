package L6_Sorting;
import java.util.Arrays;
public class Triangle {

	public static void main(String[] args) {
		
	}
	public static int solution(int[] A) {
        Arrays.sort(A);
        for(int i = A.length-3; i >= 0; i--){
            if(A[i] <= 0)
                continue;
            if((long)A[i]+A[i+1] > A[i+2])
                return 1;
        }
        return 0;
    }
}