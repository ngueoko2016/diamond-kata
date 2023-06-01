package org.diamon;

import java.util.*;

public class Diamond {
    private String input;
    private List<String> output=new ArrayList<>();

    public Diamond() {
        this.input = input;
    }

    public void buildDiamondToPrint(){
        switch (input) {
            case "C" : { output.add("C   C");output.add(" B B"); output.add("  A"); break;}
            case "B" : { output.add("B B"); output.add(" A"); break;}
            case "A" : {output.add("A"); break;}
            default:  ;

        }
    }

    public void diamondPrint(){

        for(int i=output.size()-1;i>0;i--) {
            System.out.println(output.get(i));
        }

        for(int i=0;i<output.size();i++) {
            System.out.println(output.get(i));
        }
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public List<String> getOutput() {
        return output;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }
}
