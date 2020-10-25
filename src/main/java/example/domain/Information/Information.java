package example.domain.Information;
import example.domain.Person.PersonInfo;
import example.domain.Product.ProductInfo;
import example.domain.Transport.TransportInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(
        namespace = "IR_INFO"
)
public class Information {

    @XmlElement(required = true, name="DocumentID")
    private String DocumentID;

    @XmlElement(required = true, name="DocumentDateTime")
    private Date DocumentDateTime;

    @XmlElement(required = true, name="ConsignmentIdentifier")
    private String ConsignmentIdentifier;

    @XmlElement(required = true, name="TransportInfo")
    private TransportInfo TransportInfo;

    @XmlElement(required = true, name="GoodsInfo")
    private ProductInfo GoodsInfo;

    @XmlElement(required = true, name="DocumentInfo")
    private PersonInfo DocumentInfo;

    public String getDocumentID() {
        return DocumentID;
    }

    public void setDocumentID(String documentID) {
        DocumentID = documentID;
    }

    public Date getDocumentDateTime() {
        return DocumentDateTime;
    }

    public void setDocumentDateTime(Date documentDateTime) {
        DocumentDateTime = documentDateTime;
    }

    public String getConsignmentIdentifier() {
        return ConsignmentIdentifier;
    }

    public void setConsignmentIdentifier(String consignmentIdentifier) {
        ConsignmentIdentifier = consignmentIdentifier;
    }

    public example.domain.Transport.TransportInfo getTransportInfo() {
        return TransportInfo;
    }

    public void setTransportInfo(example.domain.Transport.TransportInfo transportInfo) {
        TransportInfo = transportInfo;
    }

    public ProductInfo getGoodsInfo() {
        return GoodsInfo;
    }

    public void setGoodsInfo(ProductInfo goodsInfo) {
        GoodsInfo = goodsInfo;
    }

    public PersonInfo getDocumentInfo() {
        return DocumentInfo;
    }

    public void setDocumentInfo(PersonInfo documentInfo) {
        DocumentInfo = documentInfo;
    }
}
