import java.awt.image.BufferedImage; 
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import javax.crypto.Cipher; 
import javax.crypto.CipherInputStream; 
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO; 

public class sample
{ 
    public static void main(String[] arg) throws Exception { 
        
        //The 16 char AES key
        String b = "M02cnQ51Ji97vwT4";

        { 
            
            Cipher scCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            scCipher.init(2, new SecretKeySpec(b.getBytes(), "AES"));
            
            FileInputStream output = new FileInputStream("/Users/Andrew/Documents/h1a81hurcs00h467440779872671347.jpg"); 
            CipherInputStream cis = new CipherInputStream(output, scCipher); 
            BufferedImage input1 = ImageIO.read(cis); 
            FileOutputStream out = new FileOutputStream("/Users/Andrew/Documents/test.jpg"); 
            ImageIO.write(input1,"jpg", out); 
            cis.close(); 
        
        } 
    }
}