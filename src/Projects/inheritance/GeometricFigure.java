package Projects.inheritance;

import java.time.LocalDateTime;

public class GeometricFigure {
    String color;
    boolean filled;
    LocalDateTime dateTime;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public GeometricFigure() {}
    public GeometricFigure(String color, boolean filled, LocalDateTime dateTime) {
        this.color = color;
        this.filled = filled;
        this.dateTime = dateTime;
    }

    public int test(){
        return 10;
    }
}
