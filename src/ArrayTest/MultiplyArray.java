package ArrayTest;

import java.util.ArrayList;

/***
 * 构建乘积数组
 * @author brz
 * 
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，
 * B[n-1] = A[0] * A[1] * ... * A[n-2];）
 */

public class MultiplyArray {
	
	public int[] multiply(int[] A) {
		int n = A.length;
		int[] B = new int[n];
		
		int[] C1 = new int[n];
		int[] C2 = new int[n];
		C1[0] = A[0];
		C2[n-1] = A[n-1];
		
		for(int i=1; i<n-1; i++) {
			C1[i] = C1[i-1] * A[i];
			C2[n-1-i] = A[n-1-i] * C2[n-i];
		}
		
		B[0] = C2[1];
		for(int i=1; i<n-1; i++) {
			B[i] = C1[i-1] * C2[i+1];
		}
		B[n-1] = C1[n-2];
		
		return B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyArray obj = new MultiplyArray();
		int[] A = {1, 2, 3, 4};
		int[] B = obj.multiply(A);
		
		for(int i=0; i<B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
