package com.system.trinity.service;


import com.system.trinity.dto.UserDto;
import com.system.trinity.entity.User;

import java.util.Optional;

public interface UserService {

    void register(UserDto userDto) ;

    Optional<User> getActiveUser();


}
