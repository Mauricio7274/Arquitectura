package envio;
public abstract class envio implements ienvio {
    public abstract String tiempoDeEnvio();

    Integer precio;
    String tipo;

    envio(Integer precio) {
        this.precio = precio;
    }

    envio(String tipo, Integer precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    String gettipoenvio() {
        return this.tipo;
    }


    @Override
    public void cargarMercancia() {

    }

    @Override
    public void rastrearPaquete() {
    }
}
