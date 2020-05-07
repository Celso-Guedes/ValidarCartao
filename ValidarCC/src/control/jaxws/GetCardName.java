
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCardName", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardName", namespace = "http://control/")
public class GetCardName {

    @XmlElement(name = "bandeira", namespace = "")
    private int bandeira;

    /**
     * 
     * @return
     *     returns int
     */
    public int getBandeira() {
        return this.bandeira;
    }

    /**
     * 
     * @param bandeira
     *     the value for the bandeira property
     */
    public void setBandeira(int bandeira) {
        this.bandeira = bandeira;
    }

}
