/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: UserService
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午5:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.service.impl;

import example.generator.dao.UserMapper;
import example.generator.pojo.User;
import example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/7
 * @since 1.0.0
 */
@Service("userService")
public class UserService implements UserServiceI {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserById() {
        User user = userMapper.selectByPrimaryKey("1");
        return user;
    }

}