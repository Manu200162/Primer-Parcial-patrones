package ejercicio4A;

public class Paquete {
    private String pipoca;
    private String refresco;
    private String chocolate;
    public Paquete(){}

    public String getPipoca() {
        return pipoca;
    }

    public void setPipoca(String pipoca) {
        this.pipoca = pipoca;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public void showInfo(){
        System.out.println("Pipoca: "+pipoca);
        System.out.println("Refresco: "+refresco);
        System.out.println("Chocolate: "+chocolate);
    }
}
