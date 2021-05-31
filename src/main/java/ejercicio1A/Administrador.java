package ejercicio1A;

import java.util.List;

public class Administrador {
    private String nombre;
    private String codigo;

    public Administrador(){ }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void consultarSaldo(){
        int saldo= CasetaPeaje.getInstance().getEstadoDeCuenta();
        System.out.println("El saldo disponible en la caseta de peaje es: "+saldo);
    }

    public void listaVehiculos(){
        List<Vehiculo> carros= CasetaPeaje.getInstance().getCarros();
        System.out.println("La cantidad de vehiculos registrada es: "+carros.size());
        System.out.println("La lista de vehiculos es");
        for(int i=0 ; i< carros.size();i++){
            carros.get(i).mostrarVehiculo();
        }


    }
}
