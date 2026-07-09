import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();
        System.out.println(noSpaceString(nome));
        scan.close();
    }
    
    public static String noSpaceString(String textoString){
        return textoString.trim();
    }
}
