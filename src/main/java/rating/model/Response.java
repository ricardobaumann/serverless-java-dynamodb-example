package rating.model;


import java.util.HashMap;
import java.util.Map;


import java.util.Collections;

/**
 * The response that will be the passed back to the API Gateway.
 * <p>
 * The implementation depends on the AWS API Gateway response template and
 * is designed to get serialized to it.
 *
 * @author Bjoern Bilger
 *
 */
public final class Response {

    private final String body;
    private final Map<String, String> headers;
    private final int statusCode;
    private final boolean base64Encoded;

    public Response(String body,  Map<String, String> headers,
                           int statusCode, boolean base64Encoded) {
        this.statusCode = statusCode;
        this.body = body;
        this.headers = Collections.unmodifiableMap(new HashMap<>(headers));
        this.base64Encoded = base64Encoded;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public int getStatusCode() {
        return statusCode;
    }
    // APIGW expects the property to be called "isBase64Encoded"
    public boolean isIsBase64Encoded() {
        return base64Encoded;
    }

}
