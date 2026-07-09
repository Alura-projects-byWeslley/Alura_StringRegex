import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
public static void main(String[] args) {
    var scan = new Scanner(System.in);
        System.out.println("Digite o texto:");
        String texto = scan.nextLine();
        System.out.println(checar(texto));
        scan.close();
}   

public static String checar(String str){
    Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    Matcher matcher = pattern.matcher(str);
    
    if(matcher.matches()){
        return "A senha esta valida";
    }
    
    return "Errada!!";
}
}
