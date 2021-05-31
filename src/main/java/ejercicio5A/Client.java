package ejercicio5A;

public class Client {

    public static void main(String[]args){
        String operacion = "1 sumar 2 restar 2 sumar 1 sumar 1";

        InterpreterArit interpreterArit = new InterpreterArit(operacion);
        System.out.println("Operacion: "+operacion);
        System.out.println("Resultado: "+interpreterArit.interpretar());
    }

}
