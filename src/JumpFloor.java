/***
 * 青蛙跳台阶
 * @author brz
 *
 */
public class JumpFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int JumpFloor1(int target) {
		if(target==0) {
			return 0;
		}
		if(target==1) {
			return 1;
		}
		if(target==2) {
			return 2;
		}
		
		int[] count = new int[target+1];
		count[0] = 0;
		count[1] = 1;
		count[2] = 2;
		for(int i=3; i<=target; i++) {
			count[i] = count[i-1] + count[i-2];
		}
		
		return count[target];
	}
	
	//变态跳台阶
	public int JumpFloorII(int target) {
		if(target==1) {
			return 1;
		}
		
		int count = 1;
		for(int i=2; i<=target; i++) {
			count *= 2;
		}
		
		return count;
	}

}
