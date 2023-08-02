package envio;


public class internacional extends envio implements ipermitidoav{
    private int menorprecioenvio = 100;

    public internacional(Integer precio) {
        super(precio);
    }

    @Override
    public String tiempoDeEnvio() {
        return "Tiempo envio 190 horas";
    }

    @Override
    public boolean permitidoenav() {
        if (this.tipo.equals("envio.internacional")) {
            if (this.precio < 100) {
                return true;
            } else {
                return false;
            }
        }
        throw new IllegalArgumentException("no es posible cargar en el avion un envio no internacional");
    }

}

