/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: UserServiceI
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午5:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.service;

import example.pojo.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/7
 * @since 1.0.0
 */
public interface UserServiceI {

    User getUserById();


    List<User> getUsers();
}