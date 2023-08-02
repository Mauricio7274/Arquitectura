package envio;

public class municipal extends envio{
    public municipal(int precio) {
        super(precio);
    }

    @Override
    public String tiempoDeEnvio() {
        return "Tiempo envio 12 horas";
    }


}
