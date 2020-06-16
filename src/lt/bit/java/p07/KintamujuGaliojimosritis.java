package lt.bit.java.p07;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class KintamujuGaliojimosritis {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        if (Math.random() < 0.5) {
            System.out.println(x + y);
        } else {
            int z = 333;
            // int x = 1111; // x kintamasis konfliktuoja su bloko isores x
            System.out.println(x * y);
        }
        //System.out.println(z); // z kintamasis neprieinamas bloko isoreje

        // blokus galima kurti ten kur norim,
        //t.y. bet kur kitu bloku viduje
        {
        int z = 999 * x;
        System.out.println(z);

   //     for (int i = 0; i < x; i++) {
   //         z += i;
   //     }
            int i = 0;
            while (i < x) {
                z +=i;
                i++;
            }
        //System.out.println(i); //ciklo kintamasis i  neprieinamas ciklo bloko isoreje
        System.out.println(z);
    }

    String z = kitas(y-99);
    System.out.println(z);

    }
   static String kitas(int y) {
        int x = 100;
        return x + y + "";
    }
}
