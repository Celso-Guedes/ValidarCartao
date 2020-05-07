
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "validCC", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validCC", namespace = "http://control/")
public class ValidCC {

    @XmlElement(name = "numero", namespace = "")
    private String numero;

    /**
     * 
     * @return
     *     returns String
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * 
     * @param numero
     *     the value for the numero property
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

}
