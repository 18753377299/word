package MD5;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月3日 下午4:01:09
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class EncodeMain {
	public static void main(String[] args) {
		EncodeUtil util=new EncodeUtil();
		String s=new String("123abc");
		System.out.println("原始"+s);
		System.out.println("MD5后:"+util.MD5Util(s));
	}
}
