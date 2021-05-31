package ejercicio1A;

public class ConductorVehiculo {
    private String nombre;
    private Vehiculo vehiculo;

    public ConductorVehiculo(){
        this.vehiculo= new Vehiculo("0000-aaa","Auto","muchos años");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void pagoPeaje(int monto, Vehiculo vehiculo){
        CasetaPeaje.getInstance().recibirPagoPeaje(monto,vehiculo);
    }
}
