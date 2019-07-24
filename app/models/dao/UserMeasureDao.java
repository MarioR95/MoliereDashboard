package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.megadix.jfcm.CognitiveMap;

import constants.IConstants;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.UserMeasureDto;
import utilities.Measures;
import utilities.TrimmedBeanHandler;
import utilities.TrimmedBeanListHandler;

public class UserMeasureDao {

	public static UserMeasureDto retieveUserMeasure(String courseId, String userId, int weekNumber) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			UserMeasureDto userDto = qRunner.query(conn, FileQueryReader.getQuery("USER_MEASURE_S01"),new TrimmedBeanHandler<UserMeasureDto>(UserMeasureDto.class),new Object[]{courseId,userId,weekNumber});
			
            return userDto;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static List<UserMeasureDto> retieveUserMeasure(String courseId, String userId) throws ConfigurationException, Exception {
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<UserMeasureDto> userDto = qRunner.query(conn, FileQueryReader.getQuery("USER_MEASURE_S04"),new TrimmedBeanListHandler<UserMeasureDto>(UserMeasureDto.class),new Object[]{courseId,userId});
			
            return userDto;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static List<UserMeasureDto> retrieveWeekInterations(String courseId, String userId, int weekNumber) throws ConfigurationException, Exception {
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			List<UserMeasureDto> userDto = qRunner.query(conn, FileQueryReader.getQuery("USER_MEASURE_S05"),new TrimmedBeanListHandler<UserMeasureDto>(UserMeasureDto.class),new Object[]{courseId,userId,weekNumber});
			
            return userDto;
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static void doUpdateMeasures(String courseId, String userId, int weekNumber, Measures measures) throws ConfigurationException, Exception {				
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			qRunner.update(conn, FileQueryReader.getQuery("USER_MEASURE_S02"),new Object[]{measures.getMotivation_value(), measures.getEngagement_value(), courseId, userId, weekNumber});
		}
	
		
		finally {
			ConnectionPool.close(conn);
		}
	}
	
	public static void doSaveMapIteration(String courseId, String userId, int weekNumber,int iterationNumber, CognitiveMap map, String date) throws ConfigurationException, Exception {
		
		Connection conn = null;
		
		try {
			conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
			QueryRunner qRunner = new QueryRunner();
			
			ResultSetHandler<Integer> rsh=new ResultSetHandler<Integer>() {
				@Override
				public Integer handle(ResultSet rs) throws SQLException {
					return 1;
				}
			};
			
			qRunner.insert(conn, FileQueryReader.getQuery("USER_MEASURE_S03"), rsh,
					new Object[]{courseId, userId, weekNumber, iterationNumber, date,
							map.getConcept("c2").getOutput(),map.getConcept("c3").getOutput(),map.getConcept("c4").getOutput(),map.getConcept("c5").getOutput(),map.getConcept("c6").getOutput(),
							map.getConcept("c7").getOutput(),map.getConcept("c8").getOutput(),map.getConcept("c9").getOutput(),map.getConcept("c10").getOutput(),map.getConcept("c11").getOutput(),
							map.getConcept("c12").getOutput(),map.getConcept("c13").getOutput(),map.getConcept("c14").getOutput(),map.getConcept("c15").getOutput(),map.getConcept("c16").getOutput(),
							map.getConcept("c17").getOutput(),map.getConcept("c18").getOutput()});
		}
		
		finally {
			ConnectionPool.close(conn);
		}
	
	}
	
}