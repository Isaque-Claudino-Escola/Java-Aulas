import java.util.ArrayList;

/*
 * Elaborar uma classe java contendo:
 * 
 * a) um array do tipo ponto flutuante;
 * b) uma lista do tipo String;
 * c) Laço de repetição for e/ou foreach;
 * d) tratamento para 02 tipos de exceção;
 */

public class Aula1 {
    public static void main(String[] args) {
        Float[] prices = new Float[] { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f };
        ArrayList<String> names = new ArrayList<String>();

        names.add("João");
        names.add("Maria");
        names.add("Pedro");
        names.add("Ana");
        names.add("João");
        names.add("Maria");

        for (Float price : prices) {
            System.out.println(price);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}