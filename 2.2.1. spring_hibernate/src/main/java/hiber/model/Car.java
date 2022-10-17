package hiber.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private String series;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Car(String model, String series) {
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", id=" + id +
                '}';
    }
}
