package mapper;

import pojo.TbUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into kaohe.tb_user(id, name, username, pwd, role, dept_id) values(#{id},#{name},#{username},#{pwd},#{role},#{deptId})")
    public void userAdd(TbUser tbUser);

    @Select("select id, name, username, pwd, role, dept_id from kaohe.tb_user where  name LIKE CONCAT('%', #{name}, '%')")
    public List<TbUser> userGetListByName(String name);

    @Delete("delete from kaohe.tb_user where id = #{id}")
    void userDeleteById(Long id);

    @Update("UPDATE kaohe.tb_user SET name = #{name},username = #{username},pwd = #{pwd},role = #{role},dept_id = #{deptId} WHERE id = #{id}")
    void userUpdateById(TbUser tbUser);
}
