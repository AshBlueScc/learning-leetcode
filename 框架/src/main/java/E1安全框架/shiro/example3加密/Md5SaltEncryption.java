package E1安全框架.shiro.example3加密;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author chengzhen
 * @date 2020/4/16
 * @time 下午2:14
 */
public class Md5SaltEncryption {
    public static void main(String[] args) {
        String password = "123";
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        int times = 2;
        String algorithmName = "md5";

        String encodedPassword = new SimpleHash(algorithmName, password, salt, times).toString();
        System.out.printf("原始密码是 %s , 盐是： %s, 运算次数是： %d, 运算出来的密文是：%s ",password,salt,times,encodedPassword);
    }
}
