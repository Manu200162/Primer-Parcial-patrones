package ejercicio1A;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String antiguedad;

    public Vehiculo(){}
    public Vehiculo(String placa, String modelo, String antiguedad){
        this.placa= placa;
        this.modelo=modelo;
        this.antiguedad= antiguedad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void mostrarVehiculo(){
        System.out.println("***************************");
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+modelo);
        System.out.println("Antiguedad: "+antiguedad);
        System.out.println("*******************************");
    }
}
