
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getCardID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getCardID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardID", propOrder = {
    "idcartao"
})
public class GetCardID {

    protected String idcartao;

    /**
     * Obt�m o valor da propriedade idcartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcartao() {
        return idcartao;
    }

    /**
     * Define o valor da propriedade idcartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcartao(String value) {
        this.idcartao = value;
    }

}
