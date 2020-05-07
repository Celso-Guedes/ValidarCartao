
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://control/", "Exception");
    private final static QName _ValidCCNumberResponse_QNAME = new QName("http://control/", "validCCNumberResponse");
    private final static QName _ValidCCNumber_QNAME = new QName("http://control/", "validCCNumber");
    private final static QName _IsNumberResponse_QNAME = new QName("http://control/", "isNumberResponse");
    private final static QName _GetCardName_QNAME = new QName("http://control/", "getCardName");
    private final static QName _GetCardNameResponse_QNAME = new QName("http://control/", "getCardNameResponse");
    private final static QName _IsNumber_QNAME = new QName("http://control/", "isNumber");
    private final static QName _ValidCCResponse_QNAME = new QName("http://control/", "validCCResponse");
    private final static QName _ValidCC_QNAME = new QName("http://control/", "validCC");
    private final static QName _GetCardID_QNAME = new QName("http://control/", "getCardID");
    private final static QName _GetCardIDResponse_QNAME = new QName("http://control/", "getCardIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCardIDResponse }
     * 
     */
    public GetCardIDResponse createGetCardIDResponse() {
        return new GetCardIDResponse();
    }

    /**
     * Create an instance of {@link GetCardID }
     * 
     */
    public GetCardID createGetCardID() {
        return new GetCardID();
    }

    /**
     * Create an instance of {@link ValidCC }
     * 
     */
    public ValidCC createValidCC() {
        return new ValidCC();
    }

    /**
     * Create an instance of {@link ValidCCResponse }
     * 
     */
    public ValidCCResponse createValidCCResponse() {
        return new ValidCCResponse();
    }

    /**
     * Create an instance of {@link IsNumber }
     * 
     */
    public IsNumber createIsNumber() {
        return new IsNumber();
    }

    /**
     * Create an instance of {@link GetCardNameResponse }
     * 
     */
    public GetCardNameResponse createGetCardNameResponse() {
        return new GetCardNameResponse();
    }

    /**
     * Create an instance of {@link GetCardName }
     * 
     */
    public GetCardName createGetCardName() {
        return new GetCardName();
    }

    /**
     * Create an instance of {@link IsNumberResponse }
     * 
     */
    public IsNumberResponse createIsNumberResponse() {
        return new IsNumberResponse();
    }

    /**
     * Create an instance of {@link ValidCCNumber }
     * 
     */
    public ValidCCNumber createValidCCNumber() {
        return new ValidCCNumber();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ValidCCNumberResponse }
     * 
     */
    public ValidCCNumberResponse createValidCCNumberResponse() {
        return new ValidCCNumberResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidCCNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "validCCNumberResponse")
    public JAXBElement<ValidCCNumberResponse> createValidCCNumberResponse(ValidCCNumberResponse value) {
        return new JAXBElement<ValidCCNumberResponse>(_ValidCCNumberResponse_QNAME, ValidCCNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidCCNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "validCCNumber")
    public JAXBElement<ValidCCNumber> createValidCCNumber(ValidCCNumber value) {
        return new JAXBElement<ValidCCNumber>(_ValidCCNumber_QNAME, ValidCCNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "isNumberResponse")
    public JAXBElement<IsNumberResponse> createIsNumberResponse(IsNumberResponse value) {
        return new JAXBElement<IsNumberResponse>(_IsNumberResponse_QNAME, IsNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "getCardName")
    public JAXBElement<GetCardName> createGetCardName(GetCardName value) {
        return new JAXBElement<GetCardName>(_GetCardName_QNAME, GetCardName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "getCardNameResponse")
    public JAXBElement<GetCardNameResponse> createGetCardNameResponse(GetCardNameResponse value) {
        return new JAXBElement<GetCardNameResponse>(_GetCardNameResponse_QNAME, GetCardNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "isNumber")
    public JAXBElement<IsNumber> createIsNumber(IsNumber value) {
        return new JAXBElement<IsNumber>(_IsNumber_QNAME, IsNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidCCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "validCCResponse")
    public JAXBElement<ValidCCResponse> createValidCCResponse(ValidCCResponse value) {
        return new JAXBElement<ValidCCResponse>(_ValidCCResponse_QNAME, ValidCCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidCC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "validCC")
    public JAXBElement<ValidCC> createValidCC(ValidCC value) {
        return new JAXBElement<ValidCC>(_ValidCC_QNAME, ValidCC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "getCardID")
    public JAXBElement<GetCardID> createGetCardID(GetCardID value) {
        return new JAXBElement<GetCardID>(_GetCardID_QNAME, GetCardID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "getCardIDResponse")
    public JAXBElement<GetCardIDResponse> createGetCardIDResponse(GetCardIDResponse value) {
        return new JAXBElement<GetCardIDResponse>(_GetCardIDResponse_QNAME, GetCardIDResponse.class, null, value);
    }

}
