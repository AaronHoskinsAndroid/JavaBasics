package examples.aaronhoskins.com.javabasics;

import java.util.ArrayList;

public class ControlStatements {

    public static void demoIfElseStatement(Integer someValue) {
        if(someValue != null) {
            if (someValue < 0) {
                System.out.println("The number passed is Negative");
            } else if (someValue.equals(0)) {
                System.out.println("The number passed has Zero for its value");
            } else {
                System.out.println("The number passed is Positive");
            }
        } else {
            System.out.println("Object is NULL");
        }
    }

    public static void demoSwitchCaseStatement(String someString) {
        switch (someString) {
            case "VALUE_ONE":
                System.out.println("VALUE ONE PROCESSED");
                break;
            case "VALUE_TWO":
                System.out.println("VALUE TWO PROCESSED");
            case "VALUE_THREE":
                System.out.println("VALUE THREE PROCESSED");
                break;
                default:
                    System.out.println("VALUE NOT ACCOUNTED FOR");
        }
    }

    public static void demoForLoopStatement(int maxCount) {
        for (int loopControlVar = 0; loopControlVar < maxCount; loopControlVar++) {
            System.out.print(loopControlVar + "--");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void demoWhileLoop(int value) {
        int resultValue = 1;
        while(resultValue < value) {
            resultValue = resultValue + resultValue;
        }
        System.out.println("Result = " + resultValue);
    }

    public static void demoDoWhileLoop(int value) {
        int resultValue = 1;
        do {
            resultValue = resultValue + resultValue;
        }while(resultValue < value);

        System.out.println("Result = " + resultValue);
    }

    public static void demoForEachLoop(ArrayList<String> stringArrayList) {
        for(String currentString : stringArrayList) {
            System.out.println("Current String = " + currentString);
        }
    }
}
