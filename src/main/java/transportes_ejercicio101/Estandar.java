package transportes_ejercicio101;

public class Estandar implements Transportista{

    private double tarifa_por_kilo_envio_local;
    private double tarifa_por_kilo_envio_larga_distacia;

    public double costo_de_envio(Envio envio) {
        return es_envio_local(envio)?envio.peso()*tarifa_por_kilo_envio_local:envio.peso()*tarifa_por_kilo_envio_larga_distacia;
    }

    public boolean es_envio_local(Envio envio){
        return true;
    }

    public double getTarifa_por_kilo_envio_local() {
        return tarifa_por_kilo_envio_local;
    }

    public void setTarifa_por_kilo_envio_local(double tarifa_por_kilo_envio_local) {
        this.tarifa_por_kilo_envio_local = tarifa_por_kilo_envio_local;
    }

    public double getTarifa_por_kilo_envio_larga_distacia() {
        return tarifa_por_kilo_envio_larga_distacia;
    }

    public void setTarifa_por_kilo_envio_larga_distacia(double tarifa_por_kilo_envio_larga_distacia) {
        this.tarifa_por_kilo_envio_larga_distacia = tarifa_por_kilo_envio_larga_distacia;
    }
}
