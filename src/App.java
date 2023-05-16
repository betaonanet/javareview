public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Mundo Maravilhoso");

        String nome = "Betao";
        
        System.out.println(nome);

        TiraAcento txt = new TiraAcento("SAÚDE");
        System.out.println("Resultado: "+ txt.textofinal);


    }
}
