
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getCardName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getCardName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bandeira" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardName", propOrder = {
    "bandeira"
})
public class GetCardName {

    protected int bandeira;

    /**
     * Obtém o valor da propriedade bandeira.
     * 
     */
    public int getBandeira() {
        return bandeira;
    }

    /**
     * Define o valor da propriedade bandeira.
     * 
     */
    public void setBandeira(int value) {
        this.bandeira = value;
    }

}
