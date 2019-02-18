package tcc.ifes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class TCCApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TCCApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
	}
}
