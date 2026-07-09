import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9 {
public static void main(String[] args) {
    var scan = new Scanner(System.in);
        System.out.println("Digite o texto:");
        String texto = scan.nextLine();
        System.out.println(checar(texto));
        scan.close();
}   

public static String checar(String str){
    Pattern pattern = Pattern.compile("\\#\\w+");
    Matcher matcher = pattern.matcher(str);
    
    ArrayList<String> hashtags = new ArrayList<>();

    while(matcher.find())
        hashtags.add(matcher.group());

    if(hashtags.isEmpty())
        return "Nenhuma hashtag encontrada.";
    else
        return String.format("Hashtags encontradas: " + String.join(", ", hashtags));
}
}
