import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua mensage: ");
        String srt = scan.nextLine();
        final String texto = srt.replaceAll(" ", "");

        Pattern rostoFeliz = Pattern.compile(":-\\)");
        Pattern rostoTriste = Pattern.compile(":-\\(");
        Matcher feliz = rostoFeliz.matcher(texto);
        Matcher triste = rostoTriste.matcher(texto);

        int contadorFeliz = 0;
        while(feliz.find()){
            contadorFeliz++;
        }

        int contadorTriste = 0;
        while(triste.find()){
            contadorTriste++;
        }

        if(contadorTriste > contadorFeliz){
            System.out.println("Menssagem triste");
        }else if(contadorTriste < contadorFeliz){
            System.out.println("Menssagem feliz");
        }else{
            System.out.println("Menssagem neutra");
        }
    }
}