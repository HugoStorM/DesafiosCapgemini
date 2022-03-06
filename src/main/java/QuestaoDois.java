public class QuestaoDois {

    public static void main(String[] args) {
        int[] n = { 1, 5, 3, 4, 2 };
        int x = 2;

        int ocorrencias=0;

        for (int contx = 0; contx < n.length; contx++) {
            for (int conty = 0; conty < n.length; conty++) {
                if (n[contx] - n[conty] == x) {
                    System.out.println(String.format("%d,%d=%d", n[contx], n[conty], n[contx] - n[conty]));
                    ocorrencias+=1;
                }
            }

        }
        System.out.println(ocorrencias);
    }

}