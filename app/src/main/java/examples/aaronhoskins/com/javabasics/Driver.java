package examples.aaronhoskins.com.javabasics;

import java.util.Locale;

public class Driver {
    public static final String PRINT_TEMPLATE = "\n*************** %s Demo ***************";
    public static void main(String[] args) {
        //ControlStatements - if/else
        System.out.println(String.format(Locale.US, PRINT_TEMPLATE, "IF/Else"));
        ControlStatements.demoIfElseStatement(-1);
        ControlStatements.demoIfElseStatement(0);
        ControlStatements.demoIfElseStatement(1);
        ControlStatements.demoIfElseStatement(null);

        //ControlStatements - switch/case
        System.out.println(String.format(Locale.US, PRINT_TEMPLATE, "Switch/Case"));
        ControlStatements.demoSwitchCaseStatement("VALUE_ONE");
        ControlStatements.demoSwitchCaseStatement("VALUE_TWO");
        ControlStatements.demoSwitchCaseStatement("VALUE_THREE");
        ControlStatements.demoSwitchCaseStatement("VALUE_FOUR");

        //ControlStatements - for loop
        System.out.println(String.format(Locale.US, PRINT_TEMPLATE, "For Loop"));
        ControlStatements.demoForLoopStatement(10);

        //ControlStatements - while loop
        System.out.println(String.format(Locale.US, PRINT_TEMPLATE, "While Loop"));
        ControlStatements.demoWhileLoop(100);

        //ControlStatements - while loop
        System.out.println(String.format(Locale.US, PRINT_TEMPLATE, "Do While Loop"));
        ControlStatements.demoDoWhileLoop(100);

        //ControlStatements - for each loop
        System.out.println(String.format(Locale.US, PRINT_TEMPLATE, "For Each Loop"));
        ControlStatements.demoForEachLoop(Collections.demoArrayList());
    }
}
