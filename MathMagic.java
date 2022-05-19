/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathmagic;

/**
 *
 * @author John Hamwi
 */
public class MathMagic {

    // TODO code application logic here
    public static void main(String[] args) {
        // My number is the original number
        int myNumber = 7;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);

    }

}


