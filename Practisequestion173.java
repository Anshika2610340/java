interface encryptable{
    public void encrypt(String data);
    public void decrypt(String encrypteddata);
}
class AES implements encryptable{
    public void encrypt(String data){
        System.out.println("encrypting "+data);
    }
    public void decrypt(String encrypteddata){
        System.out.println("decrypting "+encrypteddata);
    }
}
class RSA implements encryptable{
    public void encrypt(String data){
        System.out.println("encrypting "+data);
    }
    public void decrypt(String encrypteddata){
        System.out.println("decrypting "+encrypteddata);
    }
}
public class Practisequestion173 {
    static void main() {
        /*Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData) that define encryption and decryption operations.
        Create two classes AES and RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.*/
        AES a=new AES();
        RSA r=new RSA();
        a.encrypt("123");
        a.decrypt("001010011");
        r.encrypt("222");
        r.decrypt("010010010");
    }
}
