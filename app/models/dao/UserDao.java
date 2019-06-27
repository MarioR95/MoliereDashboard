package models.dao;

import constants.IConstants;
import models.database.*;
import models.dto.UserDto;
import utilities.TrimmedBeanHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.TimeZone;

import org.apache.commons.dbutils.QueryRunner;

public class UserDao {

    public UserDao(){

    }

    public UserDto doLogin(String username, String password)throws Exception {
       
    	Connection conn = null;
        try {
            conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
            QueryRunner qRunner = new QueryRunner();
            UserDto user = qRunner.query(conn, FileQueryReader.getQuery("LOGIN_S01"), new TrimmedBeanHandler<UserDto>(UserDto.class), new Object[]{username, password});
            if(user == null){
                user = new UserDto();
                user.setEmail(username);
            }
            System.out.println(user.getEmail()+", "+user.getName());
            return user;
        } finally {
            ConnectionPool.close(conn);
        }
		
    }
}