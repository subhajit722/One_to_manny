package dto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Mob_id")
    private  int id;
    @Column(name = "mob_Brand")
    private String brand;
    @Column(name = "Mob_Modle")
    private  String model;
    @Column(name = "Prices")
    private int price;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Sims>  s1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Sims> getS1() {
        return s1;
    }

    public void setS1(List<Sims> s1) {
        this.s1 = s1;
    }
}
