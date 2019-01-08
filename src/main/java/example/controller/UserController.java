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
import example.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

//    @ResponseBody
//    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
//    public List<User> getUsers() {
//        List<User> users = userServiceI.getUsers();
//        return users;
//    }

}