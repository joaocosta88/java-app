package my.java.template.app.data.entities;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = Weather.TABLE_NAME)
public class Weather {

    public static final String TABLE_NAME = "WEATHER";

    private UUID id;
    private City city;
    private double temperature;

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "id")
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
