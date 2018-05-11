package L5_PrefixSums;

public class GenomicRangeQuery {

	public static void main(String[] args) {
		// https://app.codility.com/demo/results/trainingSZZ7DP-JZK/
		//Correctness 20%
		
	}
	//計算S[i]時，1234各出現幾次，再用Q-P得區間1234出現次數，以找出最小值
	public static int[] solution(String S, int[] P, int[] Q) {
        int Slen = S.length();
        int[][] count = new int[Slen][5];
        for (int i = 0; i < Slen; i++) {
            char c = S.charAt(i);
            switch(c){
                case 'A':
                    count[i][1]++; break;
                case 'C':
                    count[i][2]++; break;
                case 'G':
                    count[i][3]++; break;
                case 'T':
                    count[i][4]++; break;
            }
        }
        int[] ans = new int[P.length];
        int diff = 0;
        for(int j = 0; j < P.length; j++){
            for(int k = 1; k <= 4; k++){
                if(P[j] == 0)
                    diff = count[Q[j]][k];
                else
                    diff = count[Q[j]][k] - count[P[j]-1][k];
                if(diff > 0){
                    ans[j] = k;
                    break;
                }
            }
        }
        return ans;
    }
}