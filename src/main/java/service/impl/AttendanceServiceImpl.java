package service.impl;

import mapper.AttendanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImpl {
    @Autowired
    private AttendanceMapper attendanceMapper;
}
