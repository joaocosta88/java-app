package my.java.template.app.data.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = City.TABLE_NAME)
public class City {

    public static final String TABLE_NAME = "CITY";

    private UUID id;
    private String name;
    private double lat;
    private double lon;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
