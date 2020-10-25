package example.SOAPService.serviceDTO;

import example.domain.Information.Information;
import example.domain.Product.ProductInfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.HashMap;
import java.util.Map;

@WebService(name="callService")
public class ProductService{

    //private static Map<Integer, ProductInfo> products = new HashMap<Integer, ProductInfo>();


    @WebMethod
    @WebResult(name = "PushResult", targetNamespace = "")
    @RequestWrapper(localName = "callService", partName = "IR_INF", className = "callService")
    @ResponseWrapper(localName = "callServiceResponse", partName = "IR_INF", className = "callServiceResponse")
    public String callService(@WebParam(name = "Information", targetNamespace = "") Information information) {
        return information.getConsignmentIdentifier();
    }
}
