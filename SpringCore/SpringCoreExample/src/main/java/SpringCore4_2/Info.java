package SpringCore4_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Info {

	@Bean
	public MarvelStudios getInfo() {
		return new MarvelStudios();
	}
	}
