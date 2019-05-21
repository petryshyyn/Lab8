package ua.lviv.iot.Lab8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(StationaryRepository stationaryRepository){
		return (args) -> {
			stationaryRepository.save(new Stationary("Mizar", 200, Quality.NORMAL, "Linz"));
			stationaryRepository.save(new Stationary("Optima", 180, Quality.GOOD, "Box"));
			stationaryRepository.save(new Stationary("Cabinet", 100, Quality.BEST, "Pen"));
		};
	}
}
