package com.company;

import java.io.*;
import java.util.ArrayList;

public class Bank {

    private ArrayList<Prisoned> prisoned; //?????????, ???? ????????? prizoned

    private Bank() {
        prisoned = new ArrayList<>();
    }

    private void addNewPrizoner(Prisoned cl) {
        this.prisoned.add(cl);
    }

    private void showInformation(int c) {
         int iterator = 0;
        for (Prisoned cl : prisoned) {

            if(c==prisoned.get(iterator).getId()){
                System.out.println("Name:  \t\t\t\t\t" + prisoned.get(iterator).getName()+ "\n"+
                        "Surname:  \t\t\t\t" + prisoned.get(iterator).getSurname()+ "\n" +
                        "Fathername:  \t\t\t" + prisoned.get(iterator).getFathername() + "\n" +
                        "Date of birth:  \t\t" + prisoned.get(iterator).getDateOfBirth()+ "\n" +
                        "Date of prisoning:  \t" + prisoned.get(iterator).getDateOfPrisoning()+ "\n" +
                        "Last prisoning date:  \t" + prisoned.get(iterator).getDateLastPrisoning()+ "\n" +
                        "Date of Dismiss:  \t\t" + prisoned.get(iterator).getDateDismiss()+"\n");
            }

         iterator++;
        }


    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int iter;
        boolean bool = true;

        Bank bank = new Bank();
        Word word = new Word();



        Prisoned cl1 = new Prisoned(1,"Mark", "Twen", "Olegovych", "22.09.1977", "21.05.1980", "22.11.1999", "22.06.2017");
        Prisoned cl2 = new Prisoned(2,"Nina", "Dark", "Olegivma", "22.09.1973", "23.12.1990, 21.11.1993, 01.01.2000", "22.11.1999", "22.06.2017");
        Prisoned cl3 = new Prisoned(3,"Taras", "Falcy", "Olegovych", "22.09.1977", "23.12.1987, 22.11.1999", "22.11.1999", "22.06.2017");


        bank.addNewPrizoner(cl1);
        bank.addNewPrizoner(cl2);
        bank.addNewPrizoner(cl3);






        while(bool) {
            System.out.println("Check prisoner by ID   (Press '0' for EXIT):");

            iter = word.Fill_int();

            switch (iter) {
                case (1):
                    bank.showInformation(iter);

                    break;
                case (2):
                    bank.showInformation(iter);

                    break;
                case (3):
                    bank.showInformation(iter);

                    break;
                case 0:
                    bool = false;
                    System.out.println("Goodbye!");
                    break;
                    default: System.out.println("Here isn`t any prisoned with "+ iter +" ID\n\n");
            }

        }

        //lab 11, adding MyCollection
        MyCollection<Prisoned> prisoners=new MyCollection<>();
        prisoners.add(cl1);
        prisoners.add(cl2);
        prisoners.add(cl3);
        System.out.println(prisoners.get(1).getSurname());
        System.out.println(prisoners.size());

    //Externalserial
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("File.out"));
        o.writeObject(cl1);
        o.writeObject(cl2);
        o.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("File.out"));
        Prisoned pr;
        pr =(Prisoned) in.readObject();
        System.out.println("Serialization: "+pr.getName() + " " +pr.getFathername() +" "+ pr.getDateDismiss());



    }

}




