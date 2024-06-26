package org.isd.shop.responses.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
public class UserLoginResponse {

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("tokens")
    private RefreshTokenResponse tokens;

    @JsonProperty("role")
    private String role;
}
