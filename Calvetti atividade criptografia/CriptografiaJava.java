// Atividade de Criptografia em Java
// Inclui: Chave Simétrica (AES), Chave Assimétrica (RSA) e Função Hash (SHA-256)

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class CriptografiaJava {

    // ===== Criptografia Simétrica (AES) =====
    public static void simetricaAES() throws Exception {
        String mensagem = "Mensagem Secreta";

        // Geração da chave AES
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey chave = keyGen.generateKey();

        // Vetor de inicialização (IV)
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // Criptografar
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, chave, ivSpec);
        byte[] cifrado = cipher.doFinal(mensagem.getBytes());

        // Decifrar
        cipher.init(Cipher.DECRYPT_MODE, chave, ivSpec);
        byte[] decifrado = cipher.doFinal(cifrado);

        System.out.println("AES Original: " + mensagem);
        System.out.println("AES Cifrado: " + Base64.getEncoder().encodeToString(cifrado));
        System.out.println("AES Decifrado: " + new String(decifrado));
    }

    // ===== Criptografia Assimétrica (RSA) =====
    public static void assimetricaRSA() throws Exception {
        String mensagem = "Mensagem Secreta";

        // Geração de chave RSA
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair pair = keyGen.generateKeyPair();
        PublicKey publicKey = pair.getPublic();
        PrivateKey privateKey = pair.getPrivate();

        // Criptografar com chave pública
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] cifrado = cipher.doFinal(mensagem.getBytes());

        // Decifrar com chave privada
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decifrado = cipher.doFinal(cifrado);

        System.out.println("RSA Original: " + mensagem);
        System.out.println("RSA Cifrado: " + Base64.getEncoder().encodeToString(cifrado));
        System.out.println("RSA Decifrado: " + new String(decifrado));
    }

    // ===== Função Hash (SHA-256) =====
    public static void hashSHA256() throws Exception {
        String mensagem = "Mensagem Importante";

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(mensagem.getBytes());

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }

        System.out.println("SHA-256 Hash: " + hexString.toString());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("--- Criptografia com Chave Simétrica (AES) ---");
        simetricaAES();

        System.out.println("\n--- Criptografia com Chave Assimétrica (RSA) ---");
        assimetricaRSA();

        System.out.println("\n--- Função Hash (SHA-256) ---");
        hashSHA256();
    }
}
