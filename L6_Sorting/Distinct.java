package L6_Sorting;
import java.util.Arrays;
public class Distinct {

	public static void main(String[] args) {

	}
	public static int solution(int[] A) {
        Arrays.sort(A);
        int val = 1000001;
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != val){
                val = A[i];
                count++;
            }
        }    
        return count;
    }
}