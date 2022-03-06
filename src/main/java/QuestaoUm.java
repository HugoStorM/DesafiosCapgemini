import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestaoUm {
    public static void main(String[] args) {

        List<Integer> mediana = new ArrayList<>();
        mediana.add(9);
        mediana.add(2);
        mediana.add(1);
        mediana.add(4);
        mediana.add(6);

        Collections.sort(mediana);
        System.out.println(mediana);
        int tamanho = mediana.size();

        if (tamanho % 2 != 0) {
            int meio = (int) Math.floor(mediana.size()/2);
            System.out.println(mediana.get(meio));

        }else {

            int aux = tamanho/2;

            float meio = (float) (mediana.get(aux) + mediana.get(aux- 1))/2;
            System.out.println(meio);

        }
    }
}
