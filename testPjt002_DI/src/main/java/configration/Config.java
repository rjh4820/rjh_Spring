package configration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.StudentDao;
import service.EMSInformationService;
import service.StudentAllSelectService;
import service.StudentDeleteService;
import service.StudentModifyService;
import service.StudentRegisterService;
import service.StudentSelectService;
import stu.DataBaseConnectionInfo;

@Configuration
public class Config {
	
	//<bean id="studentDao" class="dao.StudentDao" />
	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	}
	
//	<bean id="registerService" class="service.StudentRegisterService">
//	<constructor-arg ref="studentDao" ></constructor-arg>
//	</bean>
	@Bean
	public StudentRegisterService registerService() {
		return new StudentRegisterService(studentDao());
	}
	
	
	@Bean
	public StudentModifyService modifyService() {
		return new StudentModifyService(studentDao());
	}
	@Bean
	public StudentDeleteService deleteService() {
		return new StudentDeleteService(studentDao());
	}
	@Bean
	public StudentSelectService selectService() {
		return new StudentSelectService(studentDao());
	}
	@Bean
	public StudentAllSelectService allSelectService() {
		return new StudentAllSelectService(studentDao());
	}

	
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
	
	@Bean 
	public EMSInformationService informationService() {
		EMSInformationService info = new EMSInformationService();
		info.setInfo("Education Management System program was developed in 2015.");
		info.setCopyRight("COPYRIGHT(C) 2015 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");
		info.setVer("The version is 1.0");
		info.setsYear(2015);
		info.setsMonth(1);
		info.setsDay(1);
		info.seteYear(2015);
		info.seteMonth(2);
		info.seteDay(28);
		
		ArrayList<String> developers = new ArrayList<String>();
		developers.add("Chenev.");
		developers.add("Eloy.");
		developers.add("Jasper.");
		developers.add("Dillon.");
		developers.add("Kian.");
		info.setDevelopers(developers);

		Map<String, String> administrators = new HashMap<String, String>();
		administrators.put("Chenev", "cheney@springPjt.org");
		administrators.put("Jasper", "jasper@springPjt.org");
		info.setAdministrators(administrators);
		
		Map<String, DataBaseConnectionInfo> dbInfos = new HashMap<String, DataBaseConnectionInfo>();
		dbInfos.put("dev", dataBaseConnectionInfo());
		//dbInfos.put("real", dataBaseConnectionInfoReal());
		info.setDbInfos(dbInfos);
		
		return info;
	}
	
	
}
