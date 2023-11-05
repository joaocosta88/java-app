package my.java.template.app.data.repositories;

import my.java.template.app.data.entities.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WeatherRepository  extends JpaRepository<Weather, UUID> {
}
