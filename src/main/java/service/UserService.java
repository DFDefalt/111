package service;

import pojo.TbUser;

import java.util.List;

public interface UserService {
    void userAdd(TbUser tbUser);

    List<TbUser> userGetListByName(String name);

    void userDeleteById(Long id);

    void userUpdateById(TbUser tbUser);
}
