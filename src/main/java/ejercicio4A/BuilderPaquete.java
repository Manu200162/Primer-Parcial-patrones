package ejercicio4A;

public abstract class BuilderPaquete {
    protected Paquete paquete;

    public Paquete getPaquete(){
        return paquete;
    }

    public void createPaquete(){
        paquete=new Paquete();
    }

    public abstract void buildPipoca();
    public abstract void buildRefresco();
    public abstract void buildChocolate();





}
