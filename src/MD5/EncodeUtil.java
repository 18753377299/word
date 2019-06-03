package MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class EncodeUtil {
	
		public String MD5Util(String data){
			//获得java提供加密类的一个实例
			MessageDigest md5=null;
			try {
				 md5=MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//将string 转换成byte[] 
			char[] chars=data.toCharArray();
			//utf-8字符编码规则：一个数字、一个字母都是占一个字节
			byte[] bytes=new byte[chars.length];
			for(int i=0;i<chars.length;i++){
				bytes[i]=(byte)chars[i];
			}
			
			//获取MD5计算后的值
			byte[] md5byte=md5.digest(bytes);
			//将获取到的byte值转回string
			StringBuffer stringBuffer=new StringBuffer();
			for(int i=0;i<md5byte.length;i++){
				//为了保证转换不会出错（更精确）    0xff 缩写     
				int val=((int)md5byte[i]) & 0xff;
				if(val<16){
					stringBuffer.append("0");
				}else{
					stringBuffer.append(Integer.toHexString(val));
				}
			}
			return stringBuffer.toString();
		}
}