package api.step;

import api.config.Requests;
import api.dto.response.get.GetUserDto;
import api.endpoints.UserEndpoints;

import static api.config.RequestService.requestWithToken;
import static api.config.ResponseService.ok;

public class UserSteps {

    Requests requests = new Requests();

    public GetUserDto getUser() {
        return requests.get(requestWithToken(),
                UserEndpoints.GET_USER.getEndpoints() + "9d78c0f9-52dc-4ff7-a433-43b557960e3b").then().spec(ok())
                .extract().body().as(GetUserDto.class);
    }
}
