package org.diamon;

public class Diamond {
    public String input;
    public String output;

    public Diamond(String input) {
        this.input = input;
    }

    public void buildDiamondToPrint(){
        output=input;
        System.out.println(input);
    }
}
