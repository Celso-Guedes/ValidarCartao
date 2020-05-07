
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "isNumber", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isNumber", namespace = "http://control/")
public class IsNumber {

    @XmlElement(name = "n", namespace = "")
    private String n;

    /**
     * 
     * @return
     *     returns String
     */
    public String getN() {
        return this.n;
    }

    /**
     * 
     * @param n
     *     the value for the n property
     */
    public void setN(String n) {
        this.n = n;
    }

}
