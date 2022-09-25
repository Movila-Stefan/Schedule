package NextStep;

import java.time.LocalDate;

public class Vehicle {
    private String Model;
    private String Company;
    private LocalDate dateOfFabrication;

    public Vehicle(String model, String company, LocalDate dateOfFabrication) {
        Model = model;
        Company = company;
        this.dateOfFabrication = dateOfFabrication;
    }

    public Vehicle() {
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public LocalDate getDateOfFabrication() {
        return dateOfFabrication;
    }

    public void setDateOfFabrication(LocalDate dateOfFabrication) {
        this.dateOfFabrication = dateOfFabrication;
    }
}
