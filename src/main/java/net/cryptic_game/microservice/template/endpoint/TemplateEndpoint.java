package net.cryptic_game.microservice.template.endpoint;

import net.cryptic_game.microservice.endpoint.UserEndpoint;
import org.json.simple.JSONObject;

import java.util.UUID;

public class TemplateEndpoint {

    @UserEndpoint(path = {"echo"}, keys = {"message"}, types = {String.class})
    public static JSONObject echo(JSONObject data, UUID user) {
        return data;
    }

}
