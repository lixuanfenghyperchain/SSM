/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: User
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午12:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.pojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/7
 * @since 1.0.0
 */
public class User {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}