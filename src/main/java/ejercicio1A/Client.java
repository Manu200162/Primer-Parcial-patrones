package ejercicio1A;

public class Client {
public static void main(String[]args){

    ConductorVehiculo cv= new ConductorVehiculo();
    cv.pagoPeaje(50,new Vehiculo("2265-UIB","Toyota corolla","6 años"));
    cv.pagoPeaje(50,new Vehiculo("4578-UIO","Suzuki alto","2 años"));




    Administrador admi = new Administrador();
    admi.consultarSaldo();
    admi.listaVehiculos();

}
}
