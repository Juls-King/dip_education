package egovframework.example.sample.service.impl;

import egovframework.example.sample.service.UserVO;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import java.util.List;

@Mapper(value="userMappper")
public interface IUserMapper {

    void addUser(UserVO userVO);
    List<?> getAllUser();
    UserVO getUserById(Long id);

}
