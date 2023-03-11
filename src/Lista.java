import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List frutas = new ArrayList();
        frutas.add("mazana");
        frutas.add("durazno");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("durazno");
        frutas.set(2, "uva");
        frutas.remove(4);

        System.out.println(frutas);
        System.out.println(frutas.get(2));
        System.out.println("Index/indice del primer durazno: " + frutas.indexOf("durazno"));
        System.out.println("Index/indice del ultimo durazno: " + frutas.lastIndexOf("durazno"));
    }
}
