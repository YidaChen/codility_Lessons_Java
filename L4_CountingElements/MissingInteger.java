package L4_CountingElements;
import java.util.*;
public class MissingInteger {

	public static void main(String[] args) {
		
	}
	public static int solution(int[] A) {
	 	Set<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++)
            set.add(A[i]);
        for(int j = 1; j <= 100001; j++)
            if(!set.contains(j))
                return j;
        return 0;
	}
}