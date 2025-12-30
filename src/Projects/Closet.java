package Projects;

public class Closet {

    String name;
    int items;
    String brand;
    boolean isOpen;

    public Closet() {
    }

    public Closet(String newName) {
        name = newName;
    }

    public Closet(String newName, String newBrand) {
        name = newName;
        brand = newBrand;
    }

    public void isOpen(){
        if(!isOpen){
            isOpen = true;
        }
    }
    public void setItems(int items){}
    public void addItem(){
        if(isOpen){
            items++;
    }
    }
    public void removeItem(){
        if(!isOpen){
            items--;
        }
    }
}
