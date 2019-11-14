package StringTest;

/***
 * 替换空格
 * 题目地址
 * https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 * @author sdu20
 *
 */
public class ChangeSpace {
	
	public String replaceSpace(StringBuffer str) {
		StringBuffer str2 = new StringBuffer();
		for(int i=0; i<str.length(); i++) {
			String s = str.substring(i, i+1);
			if(s.equals(" ")) {
				str2.append("%20");
			}else {
				str2.append(s);
			}
		}
		
    	return str2.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeSpace obj = new ChangeSpace();
		StringBuffer str = new StringBuffer("hello world");
		System.out.println(obj.replaceSpace(str));
	}

}
