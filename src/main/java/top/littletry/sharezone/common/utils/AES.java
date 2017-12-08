package top.littletry.sharezone.common.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/8
 * Time: 22:12
 *
 * @author LittleTry
 */
public class AES {
    /**
     * 使用CBC模式，需要一个向量iv，可增加加密算法的强度
     */
    public static final String IV="7tWGBRwBdDmzTKVr";
    /**
     * key 16位
     */
    public static final String KEY="W0A74sg23yhcermr";

    /**
     * 加密
     * @param sSrc
     * @param sKey
     * @return
     * @throws Exception
     */
    public static String Encrypt(String sSrc,String sKey) throws Exception{
        if (sKey == null){
            sKey = AES.KEY;
        }
        byte[] raw = sKey.getBytes();
        SecretKeySpec sKeySpec = new SecretKeySpec(raw,"AES");
        //"算法/模式/补码方式"
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        //使用CBC模式，需要一个向量iv，可增加加密算法的强度
        IvParameterSpec iv = new IvParameterSpec(AES.IV.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, sKeySpec, iv);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes("UTF-8"));
        return ByteUtil.bytesToHexString(encrypted);
    }

    /**
     * 解密
     * @param sSrc
     * @param sKey
     * @return
     * @throws Exception
     */
    public static String Decrypt(String sSrc, String sKey) throws Exception {
        // 判断Key是否正确
        if (sKey == null) {
            sKey=AES.KEY;
        }
        byte[] raw = sKey.getBytes("ASCII");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec(AES.IV.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        //  byte[] encrypted1 = Base64.decodeBase64(sSrc);//先用bAES64解密
        byte[] encrypted1 =  ByteUtil.hexStringToBytes(sSrc);
        byte[] original = cipher.doFinal(encrypted1);
        String originalString = new String(original,"UTF-8");
        return originalString;
    }

    public static void main(String[] args){
        String s = "root";

        try {
            String as = AES.Encrypt(s,"IcAvgpSJxzqcKnyx");
            System.out.println(as);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
