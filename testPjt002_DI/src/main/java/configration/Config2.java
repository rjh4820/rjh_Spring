package configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import stu.DataBaseConnectionInfo;

@Configuration
public class Config2 {

	@Bean
	public DataBaseConnectionInfo dataBaseConnectionInfo() {
		DataBaseConnectionInfo infoDev = new DataBaseConnectionInfo();
		infoDev.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		infoDev.setUserId("scott");
		infoDev.setUserPw("tiger");
		return infoDev;
	}
	
//	@Bean
//	public DataBaseConnectionInfoReal dataBaseConnectionInfoReal() {
//		DataBaseConnectionInfo infoReal = new DataBaseConnectionInfo();
//		infoReal.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
//		infoReal.setUserId("masterid");
//		infoReal.setUserPw("masterpw");
//		return infoReal;
//	}
	
}
