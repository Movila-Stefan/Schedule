import java.time.LocalDate;

public class Trainer extends Person{

    private boolean isAutorisated;

    public Trainer() {
    }

    public Trainer(boolean isAutorisated) {
        this.isAutorisated = isAutorisated;
    }

    public Trainer(String firstName, String lastName, LocalDate dateOfBirth, boolean isAutorisated) {
        super(firstName, lastName, dateOfBirth);
        this.isAutorisated = isAutorisated;
    }

    public boolean isAutorisated() {
        return isAutorisated;
    }

    public void setAutorisated(boolean autorisated) {
        isAutorisated = autorisated;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "isAutorisated=" + isAutorisated +
                '}';
    }
}
