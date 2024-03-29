package MD5;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月3日 下午4:32:12
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class JavaPack {
	public static void main(String[] args) throws ParseException{
		String source="riskcontrol";
         System.out.println(decodeString("b2a9bfcdd4b0d6d0cec4"));
         System.out.println("加密："+decodeShiLiu(source));
         System.out.println("解密："+decodeString(decodeShiLiu(source)));
    }

	/**
     * 十六进制转中文字符串
     */
    public static String decodeString(String str) {
        if ( str == null ) {
            return "转换失败";
        }
        byte[] s = pack(str); //十六进制转byte数组
        String gbk;
        try {
            gbk = new String(s, "gbk"); //byte数组转中文字符串
        } catch ( UnsupportedEncodingException ignored ) {
            gbk = "转换失败";
        }
        return gbk;
    }
    
    /**
     * 十六进制转byte数组，模拟php中pack
     */
    public static byte[] pack(String str) {
        int nibbleshift = 4;
        int position = 0;
        int len = str.length() / 2 + str.length() % 2;
        byte[] output = new byte[len];
        for (char v : str.toCharArray()) {
            byte n = (byte) v;
            if (n >= '0' && n <= '9') {
                n -= '0';
            } else if (n >= 'A' && n <= 'F') {
                n -= ('A' - 10);
            } else if (n >= 'a' && n <= 'f') {
                n -= ('a' - 10);
            } else {
                continue;
            }
            output[position] |= (n << nibbleshift);
            if (nibbleshift == 0) {
                position++;
            }
            nibbleshift = (nibbleshift + 4) & 7;
        }
        return output;
    }
    /**
     * 中文字符串转十六进制
     */
    public static String decodeShiLiu(String str) {
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
