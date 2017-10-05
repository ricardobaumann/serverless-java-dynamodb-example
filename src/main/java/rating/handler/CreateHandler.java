package rating.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import rating.model.Rating;
import rating.model.Response;

import java.util.HashMap;


public class CreateHandler implements RequestHandler<Rating, Response> {

    public Response handleRequest(Rating rating, Context context) {

        return new Response( "{\"name\" : \"test\"}",new HashMap<>(),200,false);
    }


}
