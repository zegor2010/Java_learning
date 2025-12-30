package Projects.data;

public class List {
    private int[] list;
    private int size;

    public List(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public void add(int e){
        list[size] = e;
    }
    public void add(int e, int index){
        list[index] = e;
    }
    public void clear(){
        for(int i = 0; i < size; i++){
            list[i] = 0;
        }
    }
    public int get(int index){
        return list[index];
    }
    public int indexOf(Object o){
        for(int i = 0; i < size; i++){
            if(o.equals(list[i])){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        for(int i = 0; i < size; i++){
            if(list[i] == 0){
                return true;
            }
        }
        return false;
    }
    public int lastIndexOf(Object o){
        for(int i = size; i >= 0; i--){
            if(o.equals(list[i])){
                return i;
            }
        }
        return -1;
    }
    public boolean remove(Object o){
        for(int i = 0; i < size; i++){
            if(o.equals(list[i])){
                list[i] = 0;
                return true;
            }
        }
        return false;
    }
    public int size() {
        return size;
    }
    public int remove(int index){
        list[index] = 0;
        return list[index];
    }
    public int set(int index, int e){
        list[index] = e;
        return list[index];
    }
}
