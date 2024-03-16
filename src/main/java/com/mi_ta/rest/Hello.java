ackage com.mi_ta.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("hello")
public class Hello {

    @GET
    public String helloResponse() {
        return "Hello Liberty!!";
    }
}
