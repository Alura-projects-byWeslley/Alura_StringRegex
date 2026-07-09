import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        String texto = "meu email weslley@gmail.com, mas o meu pessoal é wills@outlook.com";
        Pattern pat = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher mat = pat.matcher(texto);
        
        if (mat.find()){
            System.out.println(mat.group());
        }

        System.out.println(formatarTell("2199887766"));
    }

    public static String formatarTell(String textString){
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pat =Pattern.compile(regex);
        Matcher mat = pat.matcher(textString);

        if(mat.matches()){
            return String.format("(%s) %s - %s", mat.group(1), mat.group(2), mat.group(3));
        }

        return "Número de Telefone inválido";
    }
}
