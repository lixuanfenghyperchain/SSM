/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: Test2
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午1:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.test;

import example.mapping.UserMapperI;
import example.pojo.User;
import example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/7
 * @since 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
//        testDelete();
//        testGetUser();
        testGeAllr();
    }
    public static void testAdd() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        UserMapperI mapperI = sqlSession.getMapper(UserMapperI.class);
        User user = new User();
        user.setName("李敬畏");
        user.setAge(23);
        int add = mapperI.add(user);
        sqlSession.close();
        System.out.println(add);
    }

    public static void testUpdate() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
        User user = new User();
        user.setId(3);
        user.setAge(33);
        user.setName("李警卫");
        int update = mapper.update(user);
        sqlSession.close();
        System.out.println(update);
    }


    public  static void testDelete() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
        int i = mapper.deleteById(4);
        sqlSession.close();
        System.out.println(i);
    }


    public static void testGetUser() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
        User user = mapper.getById(3);
        sqlSession.close();
        System.out.println(user);
    }

    public static void testGeAllr() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
        List<User> all = mapper.getAll();
        sqlSession.close();
        System.out.println(all);
    }

}