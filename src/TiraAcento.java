
public class TiraAcento {
    
    String texto;
    String textofinal="";

    TiraAcento(String texto){
        this.texto = texto;
        
        for (int i=0;texto.length()>i;i++){            
            String letra = Character.toString(texto.charAt(i));
    
            System.out.print("verificando letra: "+ letra); 
    
            switch (letra){
                case "Á","Â","Ã":
                  letra = "A";
                  System.out.println(" - acento removido: ");
                  break;
                case "É","Ê":
                  letra = "E";
                  System.out.println(" - acento removido");
                  break;
                case "Í":
                  letra = "i";
                  System.out.println(" - acento removido");
                  break;
                case "Ó","Ô","Õ":
                  letra = "O";
                  System.out.println(" - acento removido");
                  break;
                case "Ú":
                  letra = "U";
                  System.out.println(" - acento removido");
                  break;
                  
                default:
                  System.out.println(" - sem acento"); 
            }
        
            textofinal = textofinal + letra;
        }
    }


    
}


