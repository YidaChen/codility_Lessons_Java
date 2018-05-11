package L4_CountingElements;

import java.util.*;

public class FrogRiverOne {

	public static void main(String[] args) {
		
	}
	public static int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= X; i++)
            set.add(i);
        for(int j = 0; j < A.length; j++){
            set.remove(A[j]);
            if(set.isEmpty())
                return j;
        }
        return -1;   
    }
}
