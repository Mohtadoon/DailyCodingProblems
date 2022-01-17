package dcp;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class maxElementInStack {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> tempStack = new Stack<>();
    static int option;
    public static void main(String[] args) {
        System.out.println("enter \n 1 to ADD to add \n 2 to delete \n 3 to show maximum element in stack\n 4 to exit");

        while (option != 4) {
            Scanner sc = new Scanner(System.in);
            try{
                System.out.println("Enter the option");
                option = sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("enter option in Integer Only !!!");
            }
            if (option != 1 && option != 2 && option != 3 && option !=4)
                System.out.println("enter a valid option");

            switch (option) {
                case 1:
                {
                    System.out.println("enter Element");
                    try{
                        int element = sc.nextInt();
                        stack.push(element);
                        if (tempStack.isEmpty())
                            tempStack.push(element);

                        else {
                            if (tempStack.peek() < element)
                                tempStack.push(element);
                            else
                                tempStack.push(tempStack.peek());
                        }

                        System.out.println(element+" added to stack");
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Enter integers Only");
                    }
                    break;
                }

                case 2: {
                    if(stack.isEmpty()) {
                        System.out.println("No Elements left");
                        break;
                    }
                    tempStack.pop();
                    System.out.println(stack.pop()+"  deleted");
                    break;

                }


                case 3: {
                    if(tempStack.isEmpty()) {
                        System.out.println("No Elements left");
                        break;
                    }
                    System.out.println("Current Maximum element is: " + tempStack.peek());

                    break;

                }

            }
        }
    }
}


