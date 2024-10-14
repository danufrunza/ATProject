package DTO;

public class CarDTO
{

    public int id;
    public String marca;
    public String model;

    // Constructor
    public CarDTO(int id, String marca, String model) {
        this.id = id;
        this.model = model;
        this.marca = marca;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNModel() {
        return model;
    }
}
