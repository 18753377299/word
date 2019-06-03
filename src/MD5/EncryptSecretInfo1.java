package MD5;

import java.text.ParseException;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月3日 下午5:20:41
 * @version 1.0 
 * @parameter 
 * @since  加密私有信息
 * @return  */
public class EncryptSecretInfo1 {
	public static void main(String[] args) throws ParseException{
		String source="riskcontrol";
        System.out.println("加密："+decodeSecretInfo(source));
    }
	
	/**
     * 中文字符串转十六进制
     */
    public static String decodeSecretInfo(String str) {
        if ( str == null ) {
            return "转换失败";
        }
        String gbk;
        try {
            byte[] sss = str.getBytes("GBK");  //中文字符串转byte数组
            gbk = unpack(sss); // byte数组转十六进制
        } catch ( Exception E ) {
            gbk = "转换失败";
        }
        return gbk;
    }
    /**
     * byte数组转十六进制，模拟php中unpack
     */
    public static String unpack(byte[] bytes) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (bytes == null || bytes.length <= 0) {
            return null;
        }
        for (int i = 0; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
}
