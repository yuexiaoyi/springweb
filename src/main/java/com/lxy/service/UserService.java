package com.lxy.service;

import com.lxy.vo.UserVO;

import java.util.List;

public interface UserService {
     List<UserVO> listAll();

     UserVO findById(int id);

     void deleteUser();

     void updateUser();
}
