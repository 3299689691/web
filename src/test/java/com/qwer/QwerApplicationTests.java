//package com.qwer;
//
//import com.qwer.admin.bean.User;
//import com.qwer.admin.mapper.UserMapper;
//import com.qwer.admin.service.UserService;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//import java.util.List;
//import java.util.Map;
//
//@Slf4j
//@SpringBootTest
//class QwerApplicationTests {
//
//
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//    @Autowired
//    DataSource dataSource;
//    @Test
//    void contextLoads() {
//
//        List<Map<String, Object>> a=jdbcTemplate.queryForList("select * from user");
//        log.info("记录:\n{}",a);
//        log.info("数据源:\n{}",dataSource);
//
//    }
//    @Autowired
//    UserMapper userMapper;
//
//    @Autowired
//    UserService userService;
//
//    @Test
//    void testUserMapper(){
//        User user=userMapper.selectById(1L);
//        log.info("用户信息{}",user);
//        userMapper.deleteById(1);
//
//    }
//
//}
