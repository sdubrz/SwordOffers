package ArrayTest;

/**
 * 旋转数组的最下数字
 * @author brz
 * https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&tqId=11159&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 
 */

public class MinRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinRotate obj = new MinRotate();
		int[] a = {3, 4, 5, 1, 2};
		int b = obj.minNumberInRotateArray(a);
		System.out.println(b);
	}
	
	public int minNumberInRotateArray(int[] array) {
		int n = array.length;
		if(n<1) {
			return 0;
		}
		
		int i = n-1;
		while(i>0 && array[i]>=array[i-1]) {
			i--;
		}
		
		return array[i];
		
	}

}
