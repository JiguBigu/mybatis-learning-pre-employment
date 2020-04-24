package com.neo.Service;

import com.neo.mapper.test1.User1Mapper;
import com.neo.mapper.test2.User2Mapper;
import com.neo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/9/26 16:16
 */
@Service
public class UserService {
    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @Transactional(rollbackFor = Exception.class)
    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        users.addAll(user1Mapper.getAll());
        users.addAll(user2Mapper.getAll());
        return users;
    }

}
