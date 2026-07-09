import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo:");
        String texto = scan.nextLine();
        System.out.println(Padronizar(texto));
        System.out.println(Padronizar2(texto));
        scan.close();
    }

    public static String Padronizar(String texto){
        String regex = "(\\w+)\\.(\\w+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        if(matcher.matches()){
            return String.format("%s", matcher.group(1));
        }
        return  "nada foi encontrado";
    }

    public static String Padronizar2(String texto){
        int ponto = texto.lastIndexOf(".");
        if(ponto != -1){
            return texto.substring(0, ponto);
        }
        return "não é um arquivo.";
    }
}
