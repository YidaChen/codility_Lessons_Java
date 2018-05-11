package L3_TimeComplexity;

public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int solution(int X, int Y, int D) {
		double ans = (Y - X) / (double) D;
        return (int) Math.ceil(ans);
    }
}