package transportes_ejercicio101;

public class Envio {

    private double peso;
    private String direccion;
    private Transportista transportista;

    public double peso(){
        return peso;
    }

    public double costo_de_envio(){
        return transportista.costo_de_envio(this);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }
}
