package uniongraphix.baemin.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uniongraphix.baemin.user.dto.UserDto;
import uniongraphix.baemin.user.entity.User;
import uniongraphix.baemin.user.repository.IUserRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImple implements IUserService{

    private final IUserRepository iUserRepository;

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = User.builder()
                .userName(userDto.getUserName())
                .address(userDto.getAddress())
                .password(userDto.getPassword())
                .phone(userDto.getPhone())
                .build();
        iUserRepository.save(user);
        log.info("added User : {}", user);
        return userDto;
    }

    @Override
    public UserDto editUser(UserDto userDto) {
        User user = iUserRepository.findById(userDto.getId()).get();
        User.builder()
                .id(userDto.getId())
                .userName(userDto.getUserName())
                .address(userDto.getAddress())
                .password(userDto.getPassword())
                .phone(userDto.getPhone())
                .build();

        log.info("updated User : {}", user);
        iUserRepository.save(user);
        return userDto;
    }

    @Override
    public List<User> getAll() {
        List<User> userList = iUserRepository.findAll();
//        List<UserDto> userDtoList = userList.stream(user -> {
//            UserDto userDto = new UserDto();
//
//            UserDto.builder()
//                            .id(user.getId())
//                            .userName(user.getUserName())
//                            .address(user.getAddress())
//                            .password(user.getPassword())
//                            .phone(user.getPhone())
//                            .build();
//        });
        return userList;
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = iUserRepository.findById(id).get();
        UserDto userDto = UserDto.builder()
                .id(user.getId())
                .userName(user.getUserName())
                .address(user.getAddress())
                .password(user.getPassword())
                .phone(user.getPhone())
                .build();

        log.info("Get User :", userDto);
        return userDto;
    }
}
