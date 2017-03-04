package util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

/**
 * Created by maweijiang on 2017/3/4.
 */
public class TestDemo {
    public static byte[] encrypt(String content,String key){
        try {
            DESKeySpec desKey = new DESKeySpec(key.getBytes());
            SecureRandom random = new SecureRandom();
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secureKey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE,secureKey,random);
            byte[] result = cipher.doFinal(content.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String args[]){
        String test = "sdfasfa";
        String token = new TokenProcessor().generateToken(test,true);
        System.out.println(token);
        String token2 = new TokenProcessor().generateToken(test,false);
        System.out.println(token2);
    }
}
