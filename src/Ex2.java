import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Digite o texto:");
        String texto = scan.nextLine();
        System.out.println("1 para minuscula, 2 para MAIUSCULA.");
        int i = scan.nextInt();
        System.out.println(caseChange(texto, i));
        scan.close();
    }   

    public static String caseChange(String texto, int i){
        if(i == 1){return texto.toLowerCase();}
        else if(i == 2){return texto.toUpperCase();}
        return texto;
    } 
}
