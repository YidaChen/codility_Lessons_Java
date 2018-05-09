package L2_Arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < A.length; ++i){
            if(set.contains(A[i]))
                set.remove(A[i]);
            else
                set.add(A[i]);
        }
        Object[] arr = set.toArray();
        int solu = 0;
        for(int i = 0; i < 1; i++)
           solu = (int) arr[i];
        return solu;
    }
}
