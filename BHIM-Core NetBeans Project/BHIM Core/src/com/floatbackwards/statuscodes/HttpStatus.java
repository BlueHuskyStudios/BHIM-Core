package com.floatbackwards.statuscodes;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/**
 * Enum representing an HttpStatus code
 *
 * @author Ben Griffiths
 * @author Kyli Rouge of Blue Husky Studios
 *
 * @see https://github.com/BlueHuskyStudios/status-codes
 */
public enum HttpStatus {
    // 1xx Informational
    Continue(100, "Continue", "The client should continue with its request."),
    SwitchingProtocols(101, "Switching Protocols", "Informs the client that the server will switch to the protocol specified in the Upgrade message header field."),
    // 2xx Success
    OK(200, "OK", "The request sent by the client was successful."),
    Created(201, "Created", "The request was successful and the resource has been created."),
    Accepted(202, "Accepted", "The request has been accepted but has not yet finished processing."),
    NonAuthoritativeInformation(203, "Non-Authoritative Information", "The returned meta-information in the entity header is not the definitative set of information, it might be a local copy or contain local alterations."),
    NoContent(204, "No Content", "The request was successful but not require the return of an entity body."),
    ResetContent(205, "Reset Content", "The request was successful and the user agent should reset the view that sent the request."),
    PartialContent(206, "Partial Content", "The partial request was successful."),
    // 3xx Redirection
    MultipleChoices(300, "Multiple Choices", "The requested resource has multiple choices, each of which has a different location."),
    MovedPermanently(301, "Moved Permanently", "The requested resources has moved permanently to a new location."),
    Found(302, "Found", "The requested resource has been found at a different location but the client should use the original URI."),
    SeeOther(303, "See Other", "The requested resource is located at a different location which should be returned by the location field in the response."),
    NotModified(304, "Not Modified", "The resource has not been modified since the last request."),
    UseProxy(305, "Use Proxy", "The requested resource can only be accessed through a proxy which should be provided in the location field."),
    UnUsed(306, "Unused", "This status code is no longer in use but is reserved for future use."),
    TemporaryRedirect(307, "Temporary Redirect", "The requested resource is temporarily moved to the provided location but the client should continue to use this location as the resource may again move."),
    // 4xx Client Error
    BadRequest(400, "Bad Request", "The request could not be understood by the server."),
    Unauthorized(401, "Unauthorized", "The request requires authorization."),
    PaymentRequired(402, "Payment Required", "Reserved for future use."),
    Forbidden(403, "Forbidden", "Whilst the server did understand the request, the server is refusing to complete it. This is not an authorization problem."),
    NotFound(404, "Not Found", "The requested resource was not found."),
    MethodNotAllowed(405, "Method Not Allowed", "The supplied method was not allowed on the given resource."),
    NotAcceptable(406, "Not Acceptable", "The resource is not able to return a response that is suitable for the characteristics required by the accept headers of the request."),
    ProxyAuthenticationRequired(407, "Proxy Authentication Required", "The client must authenticate themselves with the proxy."),
    RequestTimeout(408, "Request Timeout", "The client did not supply a request in the period required by the server."),
    Conflict(409, "Conflict", "The request could not be completed as the resource is in a conflicted state."),
    Gone(410, "Gone", "The requested resource is no longer available on the server and no redirect address is available."),
    LengthRequired(411, "Length Required", "The server will not accept the request without a Content-Length field."),
    PreconditionFailed(412, "Precondition Failed", "The supplied precondition evaluated to false on the server."),
    RequestEntityTooLarge(413, "Request Entity Too Large", "The request was unsuccessful because the request entity was larger than the server would allow"),
    RequestedURITooLong(414, "Request URI Too Long", "The request was unsuccessful because the requested URI is longer than the server is willing to process (that's what she said)."),
    UnsupportedMediaType(415, "Unsupported Media Type", "The request was unsuccessful because the request was for an unsupported format."),
    RequestRangeNotSatisfiable(416, "Request Range Not Satisfiable", "The range of the resource does not overlap with the values specified in the requests Range header field and not alternative If-Range field was supplied."),
    ExpectationFailed(417, "Expectation Failed", "The expectation supplied in the Expectation header field could not be met by the server."),
    ImATeapot(418, "I'm a teapot", "I'm a teapot"),
    // 5xx Server Error
    InternalServerError(500, "Internal Server Error", "The request was unsuccessful because the server encountered an unexpected error."),
    NotImplemented(501, "Not Implemented", "The server does not support the request."),
    BadGateway(502, "Bad Gateway", "The server, whilst acting as a proxy, received an invalid response from the server that was fulfilling the request."),
    ServiceUnavailable(503, "Service Unavailable", "The request was unsuccessful as the server is either down or slash^H^H^H^H^Hdug^H^H^Hreddited."),
    GatewayTimeout(504, "Gateway Timeout", "The server, whilst acting as a proxy, did not receive a response from the upstream server in an acceptable time."),
    HttpVersionNotSupported(505, "HTTP Version Not Supported", "The server does not supported the HTTP protocol version specified in the request"),
    // Unofficial codes (sourced from https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#Unofficial_codes and included so they can be handled)
    // - IIS
    LoginTimeout(440, "Login Timeout", "The client's session has expired and must log in again."),
    RetryWith(449, "Retry With", "The server cannot honour the request because the user has not provided the required information."),
    Redirect(451, "Redirect", "Either a more efficient server is available or the server cannot access the users' mailbox. Re-run the HTTP AutoDiscover operation to find a more appropriate server."),
    // - nginx
    NoResponse(444, "No Response", "The server has returned no information to the client and closed the connection."),
    SSLCertificateError(495, "SSL Certificate Error", "The client has provided an invalid client certificate."),
    SSLCertificateRequired(496, "SSL Certificate Required", "A client certificate is required, but wasn't provided."),
    HTTPRequestSenttoHTTPSPort(497, "HTTP Request Sent to HTTPS Port", "The client has made a HTTP request to a port listening for HTTPS requests."),
    ClientClosedRequest(499, "Client Closed Request", "The client has closed the request before the server could send a response."),
    // - CloudFlare
    UnknownError(520, "Unknown Error", "Either the origin server returned something unexpected, the listing connection was reset, a header was too large, or a response was empty/invalid ."),
    WebServerIsDown(521, "Web Server Is Down", "The origin server has refused the connection from CloudFlare."),
    ConnectionTimedOut(522, "Connection Timed Out", "CloudFlare could not negotiate a TCP handshake with the origin server."),
    OriginIsUnreachable(523, "Origin Is Unreachable", "CloudFlare could not reach the origin server. Perhaps the DNS records for the origin server are incorrect."),
    ATimeoutOccurred(524, "A Timeout Occurred", "CloudFlare was able to complete a TCP connection to the origin server, but did not receive a timely HTTP response."),
    SSLHandshakeFailed(525, "SSL Handshake Failed", "CloudFlare could not negotiate a SSL/TLS handshake with the origin server."),
    InvalidSSLCertificate(526, "Invalid SSL Certificate", "CloudFlare could not validate the SSL/TLS certificate that the origin server presented."),
    // - Misc.
    Checkpoint(103, "Checkpoint", "Resuming aborted PUT or POST requests."),
    MethodFailure(420, "Method Failure", "A method has failed."),
    EnhanceYourCalm(420, "Enhance Your Calm", "Twitter Search and Trends API has limited network traffic."),
    BlockedByWindowsParentalControls(450, "Blocked by Windows Parental Controls", "Windows Parental Controls are turned on and are blocking network access."),
    InvalidToken(498, "Invalid Token", "Tried to use an expired or otherwise invalid token."),
    TokenRequired(499, "Token Required", "Did not use a required token."),
    ForbiddenByAntivirus(499, "Request has been forbidden by antivirus", "Blocked by antivirus software."),
    BandwidthLimitExceeded(509, "Bandwidth Limit Exceeded", "The server has exceeded the bandwidth specified by the server administrator; this often means shared hosting providers have limited your the bandwidth."),
    SiteIsFrozen(530, "Site is frozen", "The site has been frozen due to inactivity."),
    Unknown(999, "Unknown HTTP Status Code", "Unknown or unsupported HTTP status code.");

    private final int code;
    private final String name;
    private final String description;
    private final String jsonString;

    private static Map<HttpStatus, JaxbStatus> jaxbStatuses;

    static {
        jaxbStatuses = new EnumMap<HttpStatus, JaxbStatus>(HttpStatus.class);
        for (HttpStatus status : values()) {
            jaxbStatuses.put(status, new JaxbStatus(status));
        }
    }

    private HttpStatus(int code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.jsonString = generateJsonString();
    }

    /**
     * Returns the int status code this enum represents
     *
     * @return the int status code this enum represents
     */
    public final int getCode() {
        return code;
    }

    /**
     * Returns the name of the HTTP status this enum represents
     *
     * @return the name of the HTTP status this enum represents
     */
    public final String getName() {
        return name;
    }

    /**
     * Returns a description of the HTTP status this enum represents
     *
     * @return a description of the HTTP status this enum represents
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Returns a json string representing this HttpStatus
     *
     * @return a json string representing this HttpStatus
     */
    public final String getJsonString() {
        return jsonString;
    }

    /**
     * Returns the HttpStatus object with a code matching the supplied int
     *
     * @param httpStatus the httpStatus code
     * @return the HttpStatus object with a code matching the supplied int
     */
    public static HttpStatus getByCode(int httpStatus) {
        for (HttpStatus status : HttpStatus.values()) {
            if (status.getCode() == httpStatus) {
                return status;
            }
        }
        return Unknown;
    }

    /**
     * Returns the HttpStatus with the Integer code that matches the supplied String. Returns HttpStatus.Unknown if the
     * supplied String is not a valid Integer or is not in the list of available HTTP status codes.
     *
     * @param httpStatus the String containing the status code to match
     * @return the HttpStatus for the supplied String
     */
    public static HttpStatus getByCode(String httpStatus) {
        int statusCode;
        try {
            statusCode = Integer.parseInt(httpStatus);
        } catch (NumberFormatException e) {
            return Unknown;
        }
        return getByCode(statusCode);
    }

    /**
     * Returns a json string representing this HttpStatus
     *
     * @return a json string representing this HttpStatus
     */
    public String generateJsonString() {
        return String.format("{\"code\": %s, \"name\": \"%s\", \"description\": \"%s\"}", code, name, description);
    }

    /**
     * Returns a reference to a JaxbStatus object that represents this HttpStatus
     *
     * @return a reference to a JaxbStatus object that represents this HttpStatus
     */
    public JaxbStatus asJaxbStatus() {
        return jaxbStatuses.get(this);
    }

    /**
     * Returns an unmodifiable collection of JaxbStatus objects, one for each HttpStatus
     *
     * @return an unmodifiable collection of JaxbStatus objects, one for each HttpStatus
     */
    public static Collection<JaxbStatus> getJaxbValues() {
        return Collections.unmodifiableCollection(jaxbStatuses.values());
    }
}
