package ArrayTest;

/**
 * �����е��ظ�����
 * https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8?tpId=13&tqId=11203&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 
 * @author sdu20
 *
 */
public class RepetNumber {
	
	// Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	boolean has_number = false;
    	int[] record = new int[length];
    	
    	for(int i=0; i<length; i++) {
    		if(record[numbers[i]]>0) {
    			duplication[0] = numbers[i];
    			has_number = true;
    			break;
    		}
    		else {
    			record[numbers[i]] += 1;
    		}
    	}
    	return has_number;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0, 1, 1, 2, 3};
		int length = numbers.length;
		int[] duplication = new int[1];
		RepetNumber obj = new RepetNumber();
		boolean has = obj.duplicate(numbers, length, duplication);
		System.out.println(has);
		System.out.print(duplication[0]);
	}

}
