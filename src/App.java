import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Mundo Maravilhoso");

        String nome = "Betao";
        
        System.out.println(nome);

        
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite o texto: ");
            String texto = sc.nextLine(); 
        
        sc.close();

        TiraAcento txt = new TiraAcento(texto.toUpperCase());
        System.out.println("Resultado: "+ txt.textofinal);

    }
}
