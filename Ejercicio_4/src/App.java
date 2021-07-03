public class App {
    public static void main(String[] args) throws Exception {
        String nombre = "Alejo";
        String resultado = saludo(nombre);

        System.out.println(resultado);    
    }

    public static String saludo(String nombre) {
        return "Hola " + nombre + "!";
    }

}
