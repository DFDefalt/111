package pojo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class TbAttendance {
    private Long id;
    private Long userId;
    private String result;
    private LocalDate date;
    private LocalTime chkin;
    private LocalTime chkout;
}
