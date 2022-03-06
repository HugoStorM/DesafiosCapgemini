import java.util.ArrayList;
import java.util.List;

public class QuestaoTres {

    public String questaoTres(String s){
        s = s.replace(" ", "");

        int t = s.length();
        double raizT = Math.sqrt(t);
        int tamanho = (int) Math.ceil(raizT);

        String newString = "";

        int aux = 0;
        for (int posicao=0;posicao<t;posicao++){
            newString += s.charAt(posicao);
            aux +=1;
            if (aux == tamanho){
                newString += "\n";
                aux = 0;
            }
        }
        System.out.println(newString);

        String[] lista = newString.split("\n");
        List<String> novaLista = new ArrayList<>();
        String auxString = "";
        for(int x = 0;x<tamanho;x++){
            for(String partes : lista){
                if (partes.length() > x) auxString += partes.charAt(x);
                else break;
            }
            novaLista.add(auxString);
            auxString = "";
        }

        String retorno = String.join(" ", novaLista);
        return retorno;
    }
}

