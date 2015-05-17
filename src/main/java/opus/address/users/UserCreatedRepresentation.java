package opus.address.users;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public final class UserCreatedRepresentation extends UserEventWriteRepresentation {
    private static final String EVENT_NAME = "user_created";

    @NotNull
    public final String username;
    @NotNull
    public final String password;
    @NotNull
    public final String email;

    @JsonCreator
    public UserCreatedRepresentation(
            @JsonProperty("username") String username,
            @JsonProperty("password") String password,
            @JsonProperty("email") String email,
            @JsonProperty("actorId") long actorId
    ) {
        super(actorId);
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public String getName() {
        return EVENT_NAME;
    }
}
