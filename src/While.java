
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
public class While {

    public static void main(String[] args) {

        Double mesada = 50.0;
        while(mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
            valorDoce = mesada;

            System.out.println( "Doce do valor: " + valorDoce + "Adicionao no carrinho");
              mesada = mesada - valorDoce;


        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(12,15);
    }
}
