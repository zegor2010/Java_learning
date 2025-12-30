package Projects;

public class MyString {
    public char[] chars;

    public MyString(char[] chars) {
        this.chars = chars;
    }
    public char CharAt(int index){
        return chars[index];
    }
    public int length(){
        return chars.length;
    }

}
