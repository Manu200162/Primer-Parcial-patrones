package ejercicio5A;

public class TerminalExpressionSumar extends AbstractExpression {

    public TerminalExpressionSumar(int cantidadMovible){
        this.cantidadMovible=cantidadMovible;
    }

    @Override
    public void interpreter(ContextArit context) {
        if(context.input.startsWith("sumar")){
            context.signo=1;
            context.input= context.input.substring(this.cantidadMovible);
        }
    }
}
