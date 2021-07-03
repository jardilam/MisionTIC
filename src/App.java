public class App {
    public static void main(String args[]) throws Exception {
        /*
        var numero = 0;
        
        while (numero < 20) {
            System.out.println("Número while " + numero);
            numero++;
        }
        do {
            System.out.println("Numero do while: " + numero);
            numero++;
        } while (numero < 20);

        System.out.println("Valor numero final: " + numero);
        */

        var a = 5;

        var b = a++;
        System.out.println("Valor a: " + a);
        System.out.println("Valor b: " + b);

        var c = 5;

        var d = ++c;
        System.out.println("Valor c: " + c);
        System.out.println("Valor d: " + d);
    }

}