package L7_StacksandQueues;
import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {
		
	}
	public static int solution(int[] H) {
        Stack<Integer> s = new Stack<Integer>();
        int count = 0;
        
        for(int i = 0; i < H.length; i++)
        {
            while(!s.empty() && H[i] < s.peek()){
                s.pop();
                count++;
            }
            if(s.empty() || H[i] > s.peek())
                s.push(H[i]);
        }
        count += s.size();
        
        return count;
    }
}