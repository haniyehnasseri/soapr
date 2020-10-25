package example.domain.Transport;

import example.domain.Transport.ContainerInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TransportInfo {

    @XmlElement(required = true)
    private ContainerInfo ContainerNumber;

    public ContainerInfo getContainerNumber() {
        return ContainerNumber;
    }

    public void setContainerNumber(ContainerInfo containerNumber) {
        ContainerNumber = containerNumber;
    }
}
