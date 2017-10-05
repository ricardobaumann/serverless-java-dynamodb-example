package rating.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import rating.model.ListResponse;
import rating.model.Rating;


public class GetHandler implements RequestHandler<Rating, ListResponse> {

    @Override
    public ListResponse handleRequest(Rating rating, Context context) {


        return new ListResponse("GET result for chargeStationId: " + rating.getChargeStationId(), null);
    }

}
