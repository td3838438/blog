package com.lrm.service;

import com.lrm.po.User;

/**
 * @author mallooc
 * @version 1.0
 * @date 2020/8/11 11:51
 */
public interface UserService {

    User checkUser(String username, String password);
}
