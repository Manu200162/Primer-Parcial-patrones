package ejercicio1A;

import java.util.ArrayList;
import java.util.List;

public class CasetaPeaje {
 private static CasetaPeaje instancia = null;
 private int estadoDeCuenta;
 private List<Vehiculo> carros ;

 private CasetaPeaje(){
     System.out.println("********************Instanciando Peaje**************************");
        this.estadoDeCuenta=0;
        this.carros= new ArrayList<>();
        ponerAutos();

 }
 public void ponerAutos(){
     carros.add(new Vehiculo("0023-UBN","Suzuki sx4","9 años"));
     carros.add(new Vehiculo("0489-NHY","Toyota corolla","7 años"));
     carros.add(new Vehiculo("7823-GFR","Mazda mx3","2 años"));
     carros.add(new Vehiculo("2314-PPP","Nissan xtrail","10 años"));
     carros.add(new Vehiculo("5648-LVN","Toyota 4 runner","5 años"));
     carros.add(new Vehiculo("0599-ABC","Suzuki grandvitara","4 años"));


 }

 public static synchronized void makeInstance(){
     if(instancia == null){
         instancia= new CasetaPeaje();
     }
 }

 public static synchronized CasetaPeaje getInstance(){
     if(instancia ==null){
         makeInstance();
     }
    return instancia;
 }

 public void recibirPagoPeaje(int monto, Vehiculo vehiculo){
     estadoDeCuenta = estadoDeCuenta+monto;
     carros.add(vehiculo);
     System.out.println("El automovil con los siguientes datos paso por peaje: ");
     vehiculo.mostrarVehiculo();
 }

    public int getEstadoDeCuenta() {
        return estadoDeCuenta;
    }

    public List<Vehiculo> getCarros() {
        return carros;
    }
}
