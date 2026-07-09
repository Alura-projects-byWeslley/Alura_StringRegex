import java.util.Scanner;

public class Ex5 {
public static void main(String[] args) {
    var scan = new Scanner(System.in);
    System.out.println("Digite o texto e depois a palavra:");   
    String texto = scan.nextLine();
    String palavra = scan.nextLine();
    System.out.println(checagem(texto, palavra));
    scan.close();
}

public static String checagem(String texto, String palavra){
    if (texto.contains(palavra)){
        return String.format("A palavra %s esta presente no texto",palavra);
    }
    return "não esta presente";
}
}
