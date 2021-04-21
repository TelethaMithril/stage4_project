package com.sy.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.mapper.UserMapper;
import com.sy.model.User;
import com.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User findByLogin(User user) throws Exception {
        return mapper.selectByLogin(user);
    }

    @Transactional
    @Override
    public int modify(User user) throws Exception {
        return mapper.modify(user);
    }

    @Override
    public PageInfo findAll(User user, int pageNum, int pageSize) throws Exception {

        PageHelper.startPage(pageNum,pageSize);
        List<User> list = mapper.selectAll(user);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }


}
