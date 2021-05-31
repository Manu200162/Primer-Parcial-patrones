package ejercicio2A;

public class Client {

    //sistemaOperativo: Android
    //versionSistemaOperativo: 11.0
    //pulgadas: 80
    //resolucion: 50
    //puertoHdmi: true
    //puertosUsb:4
    //controlRemoto true
    //bluetooth: true
    //serial:"0000000000"

    public static void main(String[]args){

        SmartTV base = new SmartTV();
        base.setSistemaOperativo("Android");
        base.setVersionSistemaOperativo("11.0");
        base.setPulgadas(80);
        base.setResolucion(50);
        base.setPuertoHdmi(true);
        base.setPuertosUsb(4);
        base.setControlRemoto(true);
        base.setBluetooth(true);


        SmartTV tele1= (SmartTV) base.clone();
        tele1.setSerial("1111111111");
        SmartTV tele2= (SmartTV) base.clone();
        tele2.setSerial("1111111112");
        SmartTV tele3= (SmartTV) base.clone();
        tele3.setSerial("1111111113");
        SmartTV tele4= (SmartTV) base.clone();
        tele4.setSerial("1111111114");
        SmartTV tele5= (SmartTV) base.clone();
        tele5.setSerial("1111111115");

        tele1.showInfo();
        tele2.showInfo();
        tele3.showInfo();
        tele4.showInfo();
        tele5.showInfo();

    }
}
