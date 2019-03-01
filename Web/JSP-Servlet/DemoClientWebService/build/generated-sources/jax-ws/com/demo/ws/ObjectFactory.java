
package com.demo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.ws package. 
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

    private final static QName _GetAllSinhVien_QNAME = new QName("http://ws.demo.com/", "getAllSinhVien");
    private final static QName _Hello_QNAME = new QName("http://ws.demo.com/", "hello");
    private final static QName _GetAllSinhVienResponse_QNAME = new QName("http://ws.demo.com/", "getAllSinhVienResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.demo.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetAllSinhVien }
     * 
     */
    public GetAllSinhVien createGetAllSinhVien() {
        return new GetAllSinhVien();
    }

    /**
     * Create an instance of {@link GetAllSinhVienResponse }
     * 
     */
    public GetAllSinhVienResponse createGetAllSinhVienResponse() {
        return new GetAllSinhVienResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SinhVien }
     * 
     */
    public SinhVien createSinhVien() {
        return new SinhVien();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSinhVien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "getAllSinhVien")
    public JAXBElement<GetAllSinhVien> createGetAllSinhVien(GetAllSinhVien value) {
        return new JAXBElement<GetAllSinhVien>(_GetAllSinhVien_QNAME, GetAllSinhVien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSinhVienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "getAllSinhVienResponse")
    public JAXBElement<GetAllSinhVienResponse> createGetAllSinhVienResponse(GetAllSinhVienResponse value) {
        return new JAXBElement<GetAllSinhVienResponse>(_GetAllSinhVienResponse_QNAME, GetAllSinhVienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
