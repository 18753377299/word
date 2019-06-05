package wordTest;

import java.text.MessageFormat;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月4日 上午9:29:03
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class ReplaceString {
	public static void main(String []args){
		String str1 = "大秦 {0} {1} {2}";
		System.out.println(MessageFormat.format(str1, "将军", "梦回", "秦朝"));
	}
}
