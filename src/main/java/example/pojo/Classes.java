/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: Classes
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午3:28
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
 * @create 2019/1/7
 * @since 1.0.0
 */
public class Classes {

    private int id;
    private String name;

    private Teacher teacher;

    private List<Student> students;


    public int getId() {
        return id;
    }

    public void setId(int it) {
        this.id = it;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}