package Server.SOAPServer;

import Server.SOAPServer.ServicoCalculadora;
import javax.xml.ws.Endpoint;

public class CalculadoraEndpoint {

  public static void main(String[] args) {
    Endpoint.publish("http://127.0.0.1:8000/calculadoraSOAP", new ServicoCalculadora());
  }
}
