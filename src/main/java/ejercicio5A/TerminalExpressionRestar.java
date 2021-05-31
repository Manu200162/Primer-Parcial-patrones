package ejercicio5A;

public class TerminalExpressionRestar extends AbstractExpression{

    public TerminalExpressionRestar(int cantidadMovible){
        this.cantidadMovible=cantidadMovible;
    }

    @Override
    public void interpreter(ContextArit context) {
        if(context.input.startsWith("restar")){
            context.signo=-1;
            context.input=context.input.substring(this.cantidadMovible);
        }
    }
}
