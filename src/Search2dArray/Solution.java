package Search2dArray;

public class Solution {
	
	/***
	 * Search a number in a sorted 2-d array
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find2(int target, int [][] array) {
		int n = array.length;
		int m = array[0].length;
		
		int n_low = 0;
		int n_high = n - 1;
		int m_low = 0;
		int m_high = m - 1;
		
		// 先判断应该在哪一行
		while(n_low < n_high){
			if(n_high - n_low == 1) {
				if(array[n_low][m-1] >= target) {
					n_high = n_low;
				}else {
					n_low = n_high;
				}
				break;
			}
			int temp_n = (n_high+n_low)/2;
			if(array[temp_n][0]>target) {
				n_high = temp_n;
			}else if(array[temp_n][m-1]<target) {
				n_low = temp_n;
			}else {
				n_low = temp_n;
				n_high = temp_n;
				break;
			}
		}
		
		if(array[n_low][m-1]<target || array[n_low][0]>target) {
			return false;
		}
		
		while(m_low < m_high) {
			if(m_low+1==m_high) {
				if(array[n_low][m_low]==target || array[n_low][m_high]==target) {
					return true;
				}else {
					return false;
				}
			}
			int temp_m = (m_low+m_high) / 2;
			if(array[n_low][temp_m]==target) {
				return true;
			}else if(array[n_low][temp_m] > target) {
				m_high = temp_m;
			}else {
				m_low = temp_m;
			}
		}
		
		
		return false;
	}
	
	public boolean Find1(int target, int [][] array) {
		int n = array.length;
		int m = array[0].length;
		
		int n_low = 0;
		int n_up = n;
		int m_low = 0;
		int m_up = m;
		
		while(n_low<n_up-1) {
			int point = (n_low+n_up) / 2;
			if(array[point][0]>=target) {
				
			}
		}
		
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
		Solution s = new Solution();
		int[][] numbers = {{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{14, 15, 16, 17}};
		boolean temp_bool = s.Find(9,  numbers);
		System.out.println(temp_bool);
		for(int i=0; i<20;i++) {
			System.out.print(i+" \t");
			System.out.println(s.Find(i, numbers));
		}
		//System.out.println(s.Find(5, numbers));
		//System.out.println(numbers.length);
	}

}
