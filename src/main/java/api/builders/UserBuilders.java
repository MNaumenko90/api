package api.builders;

import api.dto.request.UserDto;

public class UserBuilders {

    public UserDto userDefaultBuilder() {
        return UserDto.builder()
                .userName("TestQa")
                .password("123456789Qa!")
                .build();
    }
}
