package uniongraphix.baemin.user.service;

import uniongraphix.baemin.user.dto.UserDto;
import uniongraphix.baemin.user.entity.User;


import java.util.List;

public interface IUserService {
    UserDto addUser(UserDto userDto);
    UserDto editUser(UserDto userDto);
    List<User> getAll();
    UserDto getUserById(Long id);
}
