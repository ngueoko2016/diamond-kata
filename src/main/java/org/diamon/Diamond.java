package org.diamon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Diamond {
    private int inputAlphabeticOrder;
    private Character input;
    private List<String> output=new ArrayList<>();

    public Diamond() {
        this.input = input;
    }

    public void buildDiamondToPrint(){

        for(int i=(int)input;i>=((int)'A');i--) {
            output.add(buildDiamondLine(input,i));
        }
        //System.out.println(" TABLE =" + output);
    }

    public String buildDiamondLine(char input,int i){
        String line;
        int inerSpace;
        int outerSpace;
            inerSpace=((int)input - i );
            outerSpace=(i - (int)'A')*2-1;
        return        (outerSpace<=0)?
                " ".repeat(inerSpace)+Character.valueOf((char)i)
            :
               " ".repeat(inerSpace)+Character.valueOf((char)i)+" ".repeat(outerSpace)+Character.valueOf((char)i);
        }

    public void diamondPrint(){
        Collections.reverse(output);
        output.stream().collect(Collectors.toList()).forEach( System.out::println);

        Collections.reverse(output);
        output.stream().skip(1).forEach( System.out::println);

    }


    public Character getInput() {
        return input;
    }

    public void setInput(Character input) {
        this.input = input;
    }

    public List<String> getOutput() {
        return output;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }

    public int getInputAlphabeticOrder() {
        return inputAlphabeticOrder;
    }

    public void setInputAlphabeticOrder(int inputAlphabeticOrder) {
        this.inputAlphabeticOrder = inputAlphabeticOrder;
    }
}
