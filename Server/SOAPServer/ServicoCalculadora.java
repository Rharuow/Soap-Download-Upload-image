package Server.SOAPServer;

import javax.jws.WebService;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

@WebService(endpointInterface = "SOAPServer.InterfaceCalculadora")
public class ServicoCalculadora implements InterfaceCalculadora {

  @Override
  public float som(float num1, float num2) {
    System.out.println("Acessando Soma");
    return num1 + num2;
  }

  @Override
  public float sub(float num1, float num2) {
    System.out.println("Acessando Subtração");
    if (num1 > num2)
      return num1 - num2;
    else
      return num2 - num1;

  }

  @Override
  public float mul(float num1, float num2) {
    System.out.println("Acessando Multiplicação");
    return num1 * num2;
  }

  @Override
  public float div(float num1, float num2) {
    System.out.println("Acessando Divisão");

    if (num2 == 0) {
      System.out.println("Não é possível dividir por 0");
      return 0;
    } else
      return num1 / num2;
  }

}
