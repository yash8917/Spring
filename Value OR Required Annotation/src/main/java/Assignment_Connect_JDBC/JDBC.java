package Assignment_Connect_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBC {
    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("AssignmentBean.xml");
    JDBCConnection jdbcConnection = context.getBean("jdbc", JDBCConnection.class);
    jdbcConnection.display();
    }
}
