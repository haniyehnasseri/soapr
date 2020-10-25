package example.domain.Person;


import example.domain.Person.Person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PersonInfo {

    @XmlElement(required = true)
    private Person Consignor;
    @XmlElement(required = true)
    private Person Consignee;

    public Person getConsignor() {
        return Consignor;
    }

    public void setConsignor(Person consignor) {
        Consignor = consignor;
    }

    public Person getConsignee() {
        return Consignee;
    }

    public void setConsignee(Person consignee) {
        Consignee = consignee;
    }
}
