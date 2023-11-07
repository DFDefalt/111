package controller;

import pojo.Result;
import pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/userGetListByName")
    public Result userGetList(String name){
        List<TbUser> tbUserList = userService.userGetListByName(name);
        return Result.success(tbUserList);
    }
    @PostMapping("/userAdd")
    public Result userAdd(@RequestBody TbUser tbUser){
        userService.userAdd(tbUser);
        return Result.success();
    }
    @DeleteMapping("/userDeleteById/{id}")
    public Result userDeleteById(@PathVariable("id")Long id){
        userService.userDeleteById(id);
        return Result.success();
    }
    @PutMapping("/userUpdateById")
    public Result userUpdateById(@RequestBody TbUser tbUser){
        userService.userUpdateById(tbUser);
        return Result.success();
    }
}
