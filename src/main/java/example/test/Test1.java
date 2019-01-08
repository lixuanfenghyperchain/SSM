/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: Test1
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午12:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.test;

import example.pojo.User;
import example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/7
 * @since 1.0.0
 */
public class Test1 {


    public static void main(String[] args) {
//        String resource = "conf.xml";
//        InputStream is = Test1.class.getClassLoader().getResourceAsStream(resource);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = sessionFactory.openSession();
//        String statement = "example.mapping.userMapper.getUser";
//        User user = sqlSession.selectOne(statement, 1);
//        System.out.println(user);
//        testAdd();
//        updateAdd();
//        deleteAdd();
        testGetAll();
    }

    public static void testAdd() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statement = "example.mapping.userMapper.addUser";
        User user = new User();
        user.setName("李玄风");
        user.setAge(23);
        int insertResult = sqlSession.insert(statement, user);
        sqlSession.close();
        System.out.println(insertResult);


    }

    public static void updateAdd() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statement = "example.mapping.userMapper.updateUser";
        User user = new User();
        user.setId(3);
        user.setName("李玄风update");
        user.setAge(23);
        int insertResult = sqlSession.update(statement, user);
        sqlSession.close();
        System.out.println(insertResult);
    }

    public static void deleteAdd() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statement = "example.mapping.userMapper.deleteUser";
        int insertResult = sqlSession.delete(statement, 5);
        sqlSession.close();
        System.out.println(insertResult);
    }


    public static void testGetAll() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String statement = "example.mapping.userMapper.getAllUsers";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成List<User>返回
        List<User> lstUsers = sqlSession.selectList(statement);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(lstUsers);
    }
}