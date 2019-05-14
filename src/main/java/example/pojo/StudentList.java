/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: StudentList
 * Author:   lixuanfeng
 * Date:     2019/1/31 上午10:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.pojo;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/31
 * @since 1.0.0
 */
public class StudentList {


    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "students=" + students +
                '}';
    }
}