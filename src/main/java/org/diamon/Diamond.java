package org.diamon;

import java.util.*;

public class Diamond {
    private int inputAlphabeticOrder;
    private Character input;
    private List<String> output=new ArrayList<>();

    public Diamond() {
        this.input = input;
    }

    public void buildDiamondToPrint(){
        String line;
        int currentCharOrder;
        char  currentChar;
        inputAlphabeticOrder=((int)input-(int)'A');

        System.out.println(" inputAlphabeticOrder =" + inputAlphabeticOrder);
        System.out.println(input+" =" + (int)input);

        for(int i=(int)input;i>=((int)'A');i--) {

            currentChar=(char)i;
            currentCharOrder = (i - (int) 'A');
            System.out.println(" currentCharOrder =" + currentCharOrder);

            line=spaceString(inputAlphabeticOrder-currentCharOrder)+currentChar;
          /*  if(currentCharOrder==4)line+=spaceString(currentCharOrder+4)+currentChar;
            if(currentCharOrder==3)line+=spaceString(currentCharOrder+3)+currentChar;*/
            if(currentCharOrder>=2)line+=spaceString(currentCharOrder*2)+currentChar;
            if(currentCharOrder==1)line+=spaceString(currentCharOrder)+currentChar;
            output.add(line);


            System.out.println(" LINE =" + line);

        }
        System.out.println(" TABLE =" + output);
       /* switch (input) {
            case 'C' : { output.add("C   C");output.add(" B B"); output.add("  A"); break;}
            case 'B' : { output.add("B B"); output.add(" A"); break;}
            case 'A' : {output.add("A"); break;}
            default:  ;

        }*/
        inputAlphabeticOrder+=1;
    }

    public void diamondPrint(){

        for(int i=output.size()-1;i>0;i--) {
            System.out.println(output.get(i));
        }

        for(int i=0;i<output.size();i++) {
            System.out.println(output.get(i));
        }
    }

    private String spaceString(int number){
        String formatLine="";
        for(int i=0;i<number;i++)formatLine+=" ";
        return formatLine;
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
