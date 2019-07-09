
package com.mycompany.exam;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.exam package. 
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

    private final static QName _GetAllMoviesResponse_QNAME = new QName("http://exam.mycompany.com/", "getAllMoviesResponse");
    private final static QName _GetMovieResponse_QNAME = new QName("http://exam.mycompany.com/", "getMovieResponse");
    private final static QName _MOVIE_QNAME = new QName("http://exam.mycompany.com/", "MOVIE");
    private final static QName _GetDirecotr_QNAME = new QName("http://exam.mycompany.com/", "getDirecotr");
    private final static QName _GetDirecotrResponse_QNAME = new QName("http://exam.mycompany.com/", "getDirecotrResponse");
    private final static QName _GetAllMovies_QNAME = new QName("http://exam.mycompany.com/", "getAllMovies");
    private final static QName _GetMovie_QNAME = new QName("http://exam.mycompany.com/", "getMovie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.exam
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieResponse }
     * 
     */
    public GetMovieResponse createGetMovieResponse() {
        return new GetMovieResponse();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link GetAllMoviesResponse }
     * 
     */
    public GetAllMoviesResponse createGetAllMoviesResponse() {
        return new GetAllMoviesResponse();
    }

    /**
     * Create an instance of {@link GetAllMovies }
     * 
     */
    public GetAllMovies createGetAllMovies() {
        return new GetAllMovies();
    }

    /**
     * Create an instance of {@link GetMovie }
     * 
     */
    public GetMovie createGetMovie() {
        return new GetMovie();
    }

    /**
     * Create an instance of {@link GetDirecotr }
     * 
     */
    public GetDirecotr createGetDirecotr() {
        return new GetDirecotr();
    }

    /**
     * Create an instance of {@link GetDirecotrResponse }
     * 
     */
    public GetDirecotrResponse createGetDirecotrResponse() {
        return new GetDirecotrResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exam.mycompany.com/", name = "getAllMoviesResponse")
    public JAXBElement<GetAllMoviesResponse> createGetAllMoviesResponse(GetAllMoviesResponse value) {
        return new JAXBElement<GetAllMoviesResponse>(_GetAllMoviesResponse_QNAME, GetAllMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exam.mycompany.com/", name = "getMovieResponse")
    public JAXBElement<GetMovieResponse> createGetMovieResponse(GetMovieResponse value) {
        return new JAXBElement<GetMovieResponse>(_GetMovieResponse_QNAME, GetMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exam.mycompany.com/", name = "MOVIE")
    public JAXBElement<Movie> createMOVIE(Movie value) {
        return new JAXBElement<Movie>(_MOVIE_QNAME, Movie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirecotr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exam.mycompany.com/", name = "getDirecotr")
    public JAXBElement<GetDirecotr> createGetDirecotr(GetDirecotr value) {
        return new JAXBElement<GetDirecotr>(_GetDirecotr_QNAME, GetDirecotr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirecotrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exam.mycompany.com/", name = "getDirecotrResponse")
    public JAXBElement<GetDirecotrResponse> createGetDirecotrResponse(GetDirecotrResponse value) {
        return new JAXBElement<GetDirecotrResponse>(_GetDirecotrResponse_QNAME, GetDirecotrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exam.mycompany.com/", name = "getAllMovies")
    public JAXBElement<GetAllMovies> createGetAllMovies(GetAllMovies value) {
        return new JAXBElement<GetAllMovies>(_GetAllMovies_QNAME, GetAllMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exam.mycompany.com/", name = "getMovie")
    public JAXBElement<GetMovie> createGetMovie(GetMovie value) {
        return new JAXBElement<GetMovie>(_GetMovie_QNAME, GetMovie.class, null, value);
    }

}
