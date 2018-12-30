/**
 * Copyright (C), 2016-2018, 趣链科技有限有限公司
 * FileName: StudentService
 * Author:   lixuanfeng
 * Date:     2018/12/21 下午5:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.service;

import example.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2018/12/21
 * @since 1.0.0
 */
//@Service(value = "studentService")
public class StudentService {
    private StudentDao studentDao;

    public void say() {
        System.out.println("student service");
        studentDao.say();
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}