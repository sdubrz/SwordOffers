package ArrayTest;

/***
 *      题目链接
 *      https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 *      
 * @author sdu20
 *
 */
public class Search2dArray {
	
	/***
	 * 应该用递归的方法
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find2(int target, int [][] array) {
		int n = array.length;
		int m = array[0].length;
		if(n==1 && m==1) {
			if(array[0][0]==target) {
				return true;
			}else {
				return false;
			}
		}
		if(array[0][0] > target) {
			return false;
		}
		if(array[n-1][m-1]<target) {
			return false;
		}
		
		int n_point = n/2;
		int m_point = m/2;
		if(array[n_point][m_point]==target) {
			return true;
		}else if(array[n_point][m_point]<target){
			int[][] right_array = new int[n][m-m_point];  // 右方的矩阵
			int[][] down_array = new int[n-n_point][m];  // 下方的矩阵
			for(int i=0; i<n;i++) {
				for(int j=0; j<m-m_point; j++) {
					right_array[i][j] = array[i][m_point+j];
				}
			}
			for(int i=0; i<n-n_point; i++) {
				for(int j=0; j<m; j++) {
					down_array[i][j] = array[n_point+i][j];
				}
			}
			return this.Find(target, right_array) || this.Find(target, down_array);
		}else if(array[n_point][m_point]>target) {
			int[][] left_array = new int[n][m_point+1];  // 左方的矩阵
			int[][] up_array = new int[n_point+1][m];  //  上方的矩阵
			for(int i=0; i<n; i++) {
				for(int j=0; j<m_point+1; j++) {
					left_array[i][j] = array[i][j];
				}
			}
			for(int i=0; i<n_point+1; i++) {
				for(int j=0; j<m; j++) {
					up_array[i][j] = array[i][j];
				}
			}
			return this.Find(target, left_array) || this.Find(target, up_array);
		}
		
		//System.out.println("no found");
		return false;
	}
	
	public boolean Find(int target, int [][] array) {
		int n = array.length;
		int m = array[0].length;
		if(n==0 || m==0) {
			return false;
		}
		
		int i = 0;
		int j = m-1;
		while(i<n && j>=0) {
			if(array[i][j]==target) {
				return true;
			}
			if(array[i][j] > target) {
				j--;
			}else {
				i++;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = {{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{14, 15, 16, 17}};
		int[][] array = {numbers[3]};
		Search2dArray obj = new Search2dArray();
		System.out.println(obj.Find(7, numbers));
	}

}
