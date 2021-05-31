package ejercicio2A;

public class SmartTV implements ITele{
    private  String sistemaOperativo;
    private String  versionSistemaOperativo;
    private int     pulgadas;
    private int     resolucion;
    private boolean puertoHdmi;
    private int     puertosUsb;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String  serial;


    public SmartTV(){}

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHdmi() {
        return puertoHdmi;
    }

    public void setPuertoHdmi(boolean puertoHdmi) {
        this.puertoHdmi = puertoHdmi;
    }

    public int getPuertosUsb() {
        return puertosUsb;
    }

    public void setPuertosUsb(int puertosUsb) {
        this.puertosUsb = puertosUsb;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
    @Override
    public Object clone() {
        SmartTV objClone= new SmartTV();
        objClone.setSistemaOperativo(this.sistemaOperativo);
        objClone.setVersionSistemaOperativo(this.versionSistemaOperativo);
        objClone.setPulgadas(this.pulgadas);
        objClone.setResolucion(this.resolucion);
        objClone.setPuertoHdmi(this.puertoHdmi);
        objClone.setPuertosUsb(this.puertosUsb);
        objClone.setControlRemoto(this.controlRemoto);
        objClone.setBluetooth(this.bluetooth);
        objClone.setSerial(this.serial);

        return objClone;
    }
    public void showInfo(){
        System.out.println("***********************************************");
        System.out.println("Sistema operativo: "+sistemaOperativo);
        System.out.println("Version sistema operativo: "+versionSistemaOperativo);
        System.out.println("Pulgadas: "+pulgadas);
        System.out.println("Resolucion: "+resolucion);
        System.out.println("Puerto HDMI: "+puertoHdmi);
        System.out.println("Puerto Usb: "+puertosUsb);
        System.out.println("Control remoto: "+controlRemoto);
        System.out.println("Bluetooth: "+bluetooth);
        System.out.println("Serial: "+serial);
        System.out.println("***********************************************");
    }


}
