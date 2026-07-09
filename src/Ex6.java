import java.util.Scanner;

public class Ex6 {
public static void main(String[] args) {
    var scan = new Scanner(System.in);//utilizar virgula ( , ) ao inves de ponto
    System.out.println("Digite o valor:");
    float valor = scan.nextFloat();
    System.out.println(formatar(valor));
    scan.close();
}   

public static float formatar(float n){
    String a = String.format("%.2f",n);
    a=a.replace(",", ".");
    return Float.parseFloat(a);
}
}
