package example.domain.Transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ContainerInfo {

    @XmlElement(required = true)
    private String ContainerIdentificator;
    @XmlElement(required = true)
    private boolean Indicator;


    public String getContainerIdentificator() {
        return ContainerIdentificator;
    }

    public void setContainerIdentificator(String containerIdentificator) {
        ContainerIdentificator = containerIdentificator;
    }

    public boolean isIndicator() {
        return Indicator;
    }

    public void setIndicator(boolean indicator) {
        Indicator = indicator;
    }
}
