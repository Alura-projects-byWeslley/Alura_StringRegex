import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Digite o texto, a palavra a ser substituida e a substituicao:");
        String texto = scan.nextLine();
        String palavra = scan.nextLine();
        String substituicao = scan.nextLine();
        System.out.println(Trocador(texto, palavra, substituicao));
        scan.close();
    }

    public static String Trocador(String texto, String palavra, String substituicao){
        if (texto.contains(palavra)) return texto = texto.replace(palavra, substituicao);
        return "Palavra nao encontrada";
    }
}
