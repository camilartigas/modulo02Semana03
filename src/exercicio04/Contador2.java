package exercicio04;

import java.util.StringTokenizer;

public class Contador2 {

    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public int contarPalavras(){
        if(this.frase == null)
            return 0;
//        String[] palavars = this.frase.split(" ");
//            return palavars.length;
        StringTokenizer tokenizer = new StringTokenizer(this.frase, " ");
        return tokenizer.countTokens();

    }
}
