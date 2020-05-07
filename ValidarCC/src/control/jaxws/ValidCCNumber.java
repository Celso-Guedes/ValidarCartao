
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "validCCNumber", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validCCNumber", namespace = "http://control/")
public class ValidCCNumber {

    @XmlElement(name = "validacao", namespace = "")
    private String validacao;

    /**
     * 
     * @return
     *     returns String
     */
    public String getValidacao() {
        return this.validacao;
    }

    /**
     * 
     * @param validacao
     *     the value for the validacao property
     */
    public void setValidacao(String validacao) {
        this.validacao = validacao;
    }

}
