/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: UserController
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午5:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.controller;

import example.generator.pojo.User;
import example.pojo.Student;
import example.pojo.StudentList;
import example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/7
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServiceI userServiceI;

    @ResponseBody
    @RequestMapping(value = "/getUserById")
    public User getUserById() {
        User user = userServiceI.getUserById();
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/addUser")
    public Student addUser(@RequestBody Student student) {
        System.out.println(student);
        return student;
    }


    @ResponseBody
    @RequestMapping(value = "/addUsers")
    public void addUsers(StudentList students) {
        for (Student student : students.getStudents()) {
            System.out.println(student.getName());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/deleteUsers")
    public void deleteUsers(Integer[] students_id) {
        for (int i = 0; i < students_id.length; i++) {
            System.out.println(students_id[i]);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getStudentById")
    public void getStudentById(Integer studentId) {
        System.out.println(studentId);
    }


}