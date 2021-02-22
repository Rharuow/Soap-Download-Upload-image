package Server.SOAPServer;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.WebMethod;

@WebService
@SOAPBinding(style = Style.RPC)
public interface InterfaceCalculadora {

  @WebMethod
  float som(float num1, float num2);

  @WebMethod
  float sub(float num1, float num2);

  @WebMethod
  float mul(float num1, float num2);

  @WebMethod
  float div(float num1, float num2);

}
