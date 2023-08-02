package Principal;
import envio.envio;
import envio.internacional;
import envio.municipal;

public class Principal {
  public static void imprimirTiempoDeEnvio(envio[] envios) {
    for (envio envio : envios) {
      System.out.println(envio.tiempoDeEnvio());
    }

  }

  public static void main(String[] args) {
    envio[] envios = {
            new municipal(5000),
            new internacional(25000)
    };
    imprimirTiempoDeEnvio(envios);

  }
}
