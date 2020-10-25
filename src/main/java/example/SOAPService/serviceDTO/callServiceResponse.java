package example.SOAPService.serviceDTO;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callTrQueueResponse", propOrder = {
        "pushResult"
})
public class callServiceResponse {
    @XmlElement(name = "PushResult")
    protected String pushResult;

    public String getPushResult() {
        return pushResult;
    }

    public void setPushResult(String pushResult) {
        this.pushResult = pushResult;
    }
}
