package cat.itacademy.s04.t02.n01.model;

import jakarta.persistence.*;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int quantityKg;

    public Fruit() {
    }

    public Fruit(String name, int quantityKg) {
        this.name = name;
        this.quantityKg = quantityKg;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityKg() {
        return quantityKg;
    }

    public void setQuantityKg(int quantityKg) {
        this.quantityKg = quantityKg;
    }
}
