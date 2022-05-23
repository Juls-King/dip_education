package uniongraphix.baemin.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import uniongraphix.baemin.user.dto.UserDto;
import uniongraphix.baemin.user.entity.User;
import uniongraphix.baemin.user.service.IUserService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final IUserService userService;

    @PostMapping("/user/add")
    public UserDto addUser(@RequestBody UserDto userDto){
        log.info("{}",userDto);
        return userService.addUser(userDto);
    }

    @GetMapping("/user/getall")
    public List<User> getAll(){
        return userService.getAll();
    }

}
