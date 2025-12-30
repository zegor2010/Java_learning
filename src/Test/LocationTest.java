package Test;

import Projects.Location;

public class LocationTest {
    public static void main(String[] args) {
        Location location = new Location(3,2,7);
        double[][] a = new double[location.row][location.column];
        for(int i = 0; i < location.row; i++){
            for(int j = 0; j < location.column; j++){
                a[i][j] = Math.random();
            }
        }
        Location.locateLargest(a);
    }
}
