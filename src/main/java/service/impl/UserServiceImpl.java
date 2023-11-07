package service.impl;

import mapper.AttendanceMapper;
import pojo.TbUser;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AttendanceMapper attendanceMapper;

    @Override
    public void userAdd(TbUser tbUser) {
        userMapper.userAdd(tbUser);
    }

    @Override
    public List<TbUser> userGetListByName(String name) {
        return userMapper.userGetListByName(name);
    }

    @Override
    @Transactional
    public void userDeleteById(Long id) {
        userMapper.userDeleteById(id);
        attendanceMapper.userDeleteById(id);
    }

    @Override
    public void userUpdateById(TbUser tbUser) {
       userMapper.userUpdateById(tbUser);
    }
}
