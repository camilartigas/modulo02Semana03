package exercicio03;

import java.util.StringTokenizer;

public class Contador {
    public static int contarPalavras(String frase){
        if(frase == null)
            return 0;
//        String[] palavars = frase.split(" ");
//            return palavars.length;
          StringTokenizer tokenizer = new StringTokenizer(frase, " ");
            return tokenizer.countTokens();

    }
}
