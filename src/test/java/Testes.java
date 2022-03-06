import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes {
    @Test
    public static void main(String[] args) {

        QuestaoTres questao = new QuestaoTres();
        String resultado = questao.questaoTres("ola mundo");
        Assertions.assertEquals("omd luo an", resultado);

    }

}

