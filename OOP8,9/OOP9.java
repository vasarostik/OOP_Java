

import java.util.Scanner;
import java.util.*;


interface Command {
    void execute();
}

class Hello implements Command {

    private String command;

    Hello(String command){
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println(command);
    }
}


class Word {

    String String() {
        Scanner inn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        return inn.nextLine();
    }


}

class Info{
    void out() {
        System.out.println("Choose the execution:");
        System.out.println("1 - Entering the string");
        System.out.println("2 - All data");
        System.out.println("3 - String editing");
        System.out.println("4 - Result");
        System.out.println("5 - Exit");
        System.out.println();
    }
}

class Process{
    Word in = new Word();
     ArrayList<Character> array = new ArrayList<Character>();

    Process() {

    }

    void setDeb(boolean value) {
        boolean deb = value;
    }

    String setP(String value) {
        String p = value;
        return p;
    }

    void action(String p, boolean deb){

        System.out.println(p.length());


        for(int j=0;j<p.length();j++)
        {

            if(Character.isLetter(p.charAt(j))) {
                array.add(p.charAt(j));
                if(deb) {
                    System.out.println(p.charAt(j));
                    System.out.println(array);
                    System.out.println(array.size());


                }


            }
        }
        System.out.println(array);


    }



}




public class OOP9 {

    private static boolean deb=false;



    public static void main(String[] args) {


        String new1="0";
        boolean running = true;
        Process arr = new Process();

        Info info = new Info();
        info.out();

        for (String arg : args) {
            switch (arg) {
                case "help":
                    Hello com1 = new Hello("Rostyslav Vasylyk - aim is to delete all symbols, that are not letters. Number 6 in the list.");
                    com1.execute();
                    break;
                case "debug":
                    deb = true;
                    break;
                default:
                    Hello com5 = new Hello("Error");
                    com5.execute();
                    break;
            }
        }


            while (running) {
                Scanner in = new Scanner(System.in);
                System.out.print("Input the number: ");
                String expression = in.nextLine();

                switch (expression) {
                    case "1":

                        Word word = new Word();
                        new1 = word.String();

                        break;
                    case "2":
                        System.out.println("Data: " + new1);
                        break;
                    case "3":

                        System.out.println("Processing...\n");
                        arr.setP(new1);
                        arr.setDeb(deb);


                        break;
                    case "4":
                        arr.action(new1, deb);


                        break;
                    case "5":
                        System.out.println("Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                System.out.println();
            }

            ///lab 9
        System.out.println(arr.array);


        MyCollection<Character> col1 = new MyCollection<>();

        for (int i=0; i<arr.array.size();i++) {
            col1.add(i,arr.array.get(i));
        }

        System.out.println(col1.size());
        System.out.println(col1.get(0));

        System.out.println(Arrays.toString(new Character[]{col1.iterator().next()}));
        System.out.println(Arrays.toString(col1.toArray()));
        System.out.println(col1.iterator().hasNext());

        System.out.println(col1.size());













    }
    }

