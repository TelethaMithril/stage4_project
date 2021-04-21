package com.sy.service;

import com.github.pagehelper.PageInfo;
import com.sy.model.User;


public interface UserService {

    User findByLogin(User user) throws Exception;

    int modify(User user) throws Exception;

    PageInfo findAll(User user, int pageNum, int pageSize) throws Exception;
}
