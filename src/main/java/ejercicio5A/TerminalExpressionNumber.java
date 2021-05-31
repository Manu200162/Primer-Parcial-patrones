package ejercicio5A;

public  class TerminalExpressionNumber extends AbstractExpression{

    public TerminalExpressionNumber(int cantidadMovible){
        this.cantidadMovible=cantidadMovible;
    }

    @Override
    public void interpreter(ContextArit context) {
        context.output= context.output+Integer.parseInt(context.input.substring(0,this.cantidadMovible))*(context.signo);
        context.input=context.input.substring(this.cantidadMovible);

    }
}
