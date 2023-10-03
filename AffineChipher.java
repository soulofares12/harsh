import java.util.Scanner;

public class AffineChipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text to incrypt");
        String plainText = sc.nextLine();
        System.out.println("enter the multiplicative and additive keys ");
        int multiplicative = sc.nextInt();
        int additive = sc.nextInt();
        System.out.println("The encrypted message is : " + incrypt(plainText, multiplicative, additive));
        String a=incrypt(plainText,multiplicative,additive);
        System.out.println("The decrypting of "+a+" is "+decrypt(a,multiplicative,additive));


    }

    public static String incrypt(String s, int m, int a) {
        String etext="";
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            etext = etext+(char)((((((x - 97) *m) + a) % 26) + 65));
        }
        return etext;
    }


   public static String decrypt(String s,int m,int a){
    String ptext="";
    int inv=0;
    for(int i=0;i<26;i++){
        if((m*i)%26==1)
            inv=i;
    }
    for(int i=0;i<s.length();i++) {
        int x = s.charAt(i);
        ptext=(ptext+(char)(((((x-65)+24)*inv)%26)+97));
    }
    return ptext;
    }
}


