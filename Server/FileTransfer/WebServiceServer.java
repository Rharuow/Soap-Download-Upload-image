package Server.FileTransfer;

import javax.xml.ws.Endpoint;

public class WebServiceServer {

  public static void main(String[] args) {
    String bindingURI = "http://localhost:8000/fileService";
    FileTransferer service = new FileTransfererImpl();
    Endpoint.publish(bindingURI, service);
    System.out.println("Server started at: " + bindingURI);
  }
}