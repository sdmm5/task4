package util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

/**
 * Created by maweijiang on 2017/3/4.
 */
public class DESUtil {
    public static void main(String args[]){
        String content = "DESTest";
        //密码长度必须是8的倍数
        String password = "12345678";
        System.out.println("密 钥: " + password);
        System.out.println("加密前: " + content);
        byte[] result = encrypt(content,password);
        System.out.println("加密前: " + new String(result));
        String decryResult = decrypt(result,password);
        System.out.println("解密前: " + decryResult);
    }

           /* 加密
            @param content
                        待加密内容
            @param key
                        加密的密钥*/

           public static byte[] encrypt(String content,String key){
               try{
                   SecureRandom random = new SecureRandom();
                   DESKeySpec desKey = new DESKeySpec(key.getBytes());
                   SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
                   SecretKey secureKey = keyFactory.generateSecret(desKey);
                   Cipher cipher = Cipher.getInstance("DES");
                   cipher.init(Cipher.ENCRYPT_MODE,secureKey,random);
                   byte[] result = cipher.doFinal(content.getBytes());
                   return result;
               } catch (Exception e) {
                   e.printStackTrace();
               }
               return null;
           }



   /* 解密
    @param content
            待解密内容
    @param key
            解密的密钥*/

   public static String decrypt(byte[] content,String key){
       try{
           SecureRandom random = new SecureRandom();
           DESKeySpec desKey = new DESKeySpec(key.getBytes());
           //创建DES对象
           SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
           SecretKey secureKey = keyFactory.generateSecret(desKey);
           Cipher cipher = Cipher.getInstance("DES");
           cipher.init(Cipher.DECRYPT_MODE,secureKey,random);
           byte[] result = cipher.doFinal(content);
           return new String(result);
       } catch (Exception e) {
           e.printStackTrace();
       }
       return null;
   }

}
