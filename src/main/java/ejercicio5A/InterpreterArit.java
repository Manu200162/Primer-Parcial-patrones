package ejercicio5A;

import java.util.ArrayList;
import java.util.List;

public class InterpreterArit extends AbstractExpression{

    private List<AbstractExpression> parseTree = new ArrayList<>();
    private ContextArit context;

    public InterpreterArit(String word){
        this.interpretacion(word);
    }

    public void interpretacion(String words){
        String input= words;
        context= new ContextArit(input.replace(" ",""));
        for (String word : input.split(" ")){

            switch (word){
                case "sumar":
                    parseTree.add(new TerminalExpressionSumar(word.length()));
                    break;
                case"restar":
                    parseTree.add(new TerminalExpressionRestar(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpressionNumber(word.length()));
                    break;


            }
        }
    }
    public int interpretar(){
        for(AbstractExpression terminalExpression: parseTree){
            terminalExpression.interpreter(context);
        }
        return context.output;
    }


    @Override
    public void interpreter(ContextArit context) {

    }
}
