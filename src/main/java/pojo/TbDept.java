package pojo;

import lombok.Data;

import java.time.LocalTime;
@Data
public class TbDept {
    private Long id;
    private String name;
    private LocalTime chkin;
    private LocalTime chkout;
}
