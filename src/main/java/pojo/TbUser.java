package pojo;

import lombok.Data;

@Data
public class TbUser {
    private Long id;
    private String name;
    private String username ;
    private String pwd;
    private String role;
    private Long deptId;

}
