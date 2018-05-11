package L5_PrefixSums;

public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int solution(int[] A) {
       int zero = 0;
       int ans = 0;
       for(int i = 0; i < A.length; i++){
           if(A[i] == 0)
               zero++;
           else
               ans += zero;
       }
       if(ans > 1000000000 || ans < 0)
           return -1;
       return ans;
   }
}