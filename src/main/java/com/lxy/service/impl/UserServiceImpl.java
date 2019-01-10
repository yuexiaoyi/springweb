package com.lxy.service.impl;

import com.lxy.service.UserService;
import com.lxy.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

   private List<UserVO> userList = new ArrayList<>();
   {
        userList.add( new UserVO(1,"1",1,"1","1"));
        userList.add( new UserVO(2,"2",2,"2","2"));
        userList.add( new UserVO(3,"3",3,"3","3"));
        userList.add( new UserVO(4,"4",4,"4","4"));
        userList.add( new UserVO(5,"5",5,"5","5"));
    }


    @Override
    public List<UserVO> listAll() {
      return userList;
    }

    @Override
    public UserVO findById() {
        return null;
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void updateUser() {

    }
}
