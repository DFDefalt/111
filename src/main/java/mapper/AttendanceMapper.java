package mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttendanceMapper {
    @Delete("delete from kaohe.tb_attendance where user_id = #{id}")
    void userDeleteById(Long id);
}
