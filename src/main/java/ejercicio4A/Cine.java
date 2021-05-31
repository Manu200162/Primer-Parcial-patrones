package ejercicio4A;

public class Cine {
    private BuilderPaquete builderPaquete;
    public void setBuilderPaquete(BuilderPaquete builderPaquete){
        this.builderPaquete=builderPaquete;
    }

    public Paquete getPaquete(){
        return builderPaquete.getPaquete();
    }

    public void armarPaquete(){
        this.builderPaquete.createPaquete();
        this.builderPaquete.buildPipoca();
        this.builderPaquete.buildRefresco();
        this.builderPaquete.buildChocolate();
    }
}
