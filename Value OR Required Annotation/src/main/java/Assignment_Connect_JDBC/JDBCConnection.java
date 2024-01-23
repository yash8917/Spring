package Assignment_Connect_JDBC;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.username}")
    private String username;
    @Value("${mysql.password}")
    private String password;
    @Value("${mysql.driver}")
    private String driver;
    public void display(){
        System.out.println(username+"\n"+password);
    }
}
