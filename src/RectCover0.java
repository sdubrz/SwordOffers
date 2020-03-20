
/**
 * ¾ØÐÎ¸²¸Ç
 * @author brz
 *
 */
public class RectCover0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int RectCover(int target) {
		if(target==1) {
			return 1;
		}
		if(target==2) {
			return 2;
		}
		
		int[] count = new int[target+1];
		count[1] = 1;
		count[2] = 2;
		for(int i=3; i<=target; i++) {
			count[i] = count[i-1] + count[i-2];
		}
		
		return count[target];
	}

}
