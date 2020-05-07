
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCardID", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardID", namespace = "http://control/")
public class GetCardID {

    @XmlElement(name = "idcartao", namespace = "")
    private String idcartao;

    /**
     * 
     * @return
     *     returns String
     */
    public String getIdcartao() {
        return this.idcartao;
    }

    /**
     * 
     * @param idcartao
     *     the value for the idcartao property
     */
    public void setIdcartao(String idcartao) {
        this.idcartao = idcartao;
    }

}
