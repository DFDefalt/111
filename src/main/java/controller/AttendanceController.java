package controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Result;
import service.AttendanceService;

@RestController
@RequestMapping
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/checkIn")
    public Result checkIn(HttpServletRequest request){
        String token = request.getHeader("token");
        System.err.println(token);
        return Result.success();
    }

}
