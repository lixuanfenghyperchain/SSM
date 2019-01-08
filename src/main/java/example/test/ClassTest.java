/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: ClassTest
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午3:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.test;

import example.pojo.Classes;
import example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/1/7
 * @since 1.0.0
 */
public class ClassTest {

    public static void main(String[] args) {
        testGetClass();
    }

    public static void testGetClass() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        String statement = "example.mapping.classMapper.getClass";
        String statement = "example.mapping.classMapper.getClass2";
        Classes classes = sqlSession.selectOne(statement, 1);
        sqlSession.close();
        System.out.println(classes);

    }
}