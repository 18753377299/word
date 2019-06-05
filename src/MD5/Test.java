package MD5;

import encode.EncryptSecretInfo;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月3日 下午5:25:47
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class Test {
	public static void main(String[]args){
		
		System.out.println("===="+EncryptSecretInfo.encodeSecretInfo("riskcontrol"));
		System.out.println("===="+EncryptSecretInfo.encodeSecretInfo("fcfkdb_1009"));
		System.out.println("===="+EncryptSecretInfo.decodeSecretInfo("7269736b636f6e74726f6c"));
		System.out.println("===="+EncryptSecretInfo.decodeSecretInfo("6663666b64625f31303039"));
		
	}
}
