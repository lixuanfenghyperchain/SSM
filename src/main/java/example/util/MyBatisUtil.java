/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: MyBatisUtil
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午12:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/7
 * @since 1.0.0
 */
public class MyBatisUtil {
    /**
     * 获取SqlSessionFactory
     *
     * @return SqlSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        String respurce = "conf.xml";
        InputStream is = MyBatisUtil.class.getClassLoader().getResourceAsStream(respurce);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        return factory;
    }

    /**
     * 获取SqlSession
     *
     * @return SqlSession
     */
    public static SqlSession getSqlSession() {
        return getSqlSessionFactory().openSession();
    }

    /**
     * 获取SqlSession
     *
     * @param isAutoCommit true 表示创建的SqlSession对象在执行完SQL之后会自动提交事务
     *                     false 表示创建的SqlSession对象在执行完SQL之后不会自动提交事务，这时就需要我们手动调用sqlSession.commit()提交事务
     * @return SqlSession
     */
    public static SqlSession getSqlSession(boolean isAutoCommit) {
        return getSqlSessionFactory().openSession(isAutoCommit);
    }


}