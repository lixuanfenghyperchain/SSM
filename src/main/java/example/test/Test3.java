/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: Test3
 * Author:   lixuanfeng
 * Date:     2019/1/7 下午3:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package example.test;

import example.pojo.Order;
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
public class Test3 {


    public static void main(String[] args) {
        testGetOrderById();
    }

    public static void testGetOrderById() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

//        String statement = "example.mapping.orderMapper.getOrderById";
//        String statement = "example.mapping.orderMapper.selectOrderById";
        String statement = "example.mapping.orderMapper.selectOrderResultMap";

        Order order = sqlSession.selectOne(statement, 1);
        sqlSession.close();
        System.out.println(order);
    }


}