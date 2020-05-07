
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de validCCNumber complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="validCCNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validCCNumber", propOrder = {
    "validacao"
})
public class ValidCCNumber {

    protected String validacao;

    /**
     * Obt�m o valor da propriedade validacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacao() {
        return validacao;
    }

    /**
     * Define o valor da propriedade validacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacao(String value) {
        this.validacao = value;
    }

}
