package configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import dao.StudentDao;
import service.StudentAllSelectService;
import service.StudentDeleteService;
import service.StudentModifyService;
import service.StudentRegisterService;
import service.StudentSelectService;

@Configuration
@Import({Config2.class, Config3.class})
public class Config1 {
	
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

}
