package com.company;

import java.io.*;
import java.util.*;

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
        int iter, id =1;
        String name,surname,fathername,birthday,datasofpr,lastpr,dismiss;
        boolean bool = true;
        Word word = new Word();
        Bank bank = new Bank();
        Validation validation = new Validation();

/*
        //Serialization in
        FileOutputStream fos = new FileOutputStream("temp.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos); //end

        //Serialization out
        FileInputStream fis = new FileInputStream("temp.ser");
        ObjectInputStream oin = new ObjectInputStream(fis);//end
*/
        //Prisoned cl1 = new Prisoned(1,"Mark", "Twen", "Olegovych", "22.09.1977", "21.05.1980", "22.11.1999", "22.06.2017");
        //Prisoned cl2 = new Prisoned(2,"Nina", "Dark", "Olegivma", "22.09.1973", "23.12.1990, 21.11.1993, 01.01.2000", "22.11.1999", "22.06.2017");
        //Prisoned cl3 = new Prisoned(3,"Taras", "Falcy", "Olegovych", "22.09.1977", "23.12.1987, 22.11.1999", "22.11.1999", "22.06.2017");


       // bank.addNewPrizoner(cl1);
      //  bank.addNewPrizoner(cl2);
       // bank.addNewPrizoner(cl3);



        /*oos.writeObject(cl3);
        oos.flush();
        oos.close();
        fos.close();
        Prisoned c13 = (Prisoned) oin.readObject();
        System.out.println(c13.getSurname());
        oin.close();
        fis.close();*/



     while (bool) {
         System.out.println("Press '1' to add Prisoner");
         System.out.println("Press '2' to search Prisoner");
         System.out.println("Press '0' to EXIT");
         int r = word.Fill_int();
         switch (r) {
             case  0:
                 bool = false;
                 System.out.println("Goodbye!");
                 break;
             case 1:
                 System.out.println("Enter prisoner data: ");
                 System.out.println("Name: ");

                 name = word.Fill_String();
                 while (!validation.checkName(name)) {
                     System.out.println("Error, please enter name as in example 'Rostik'!\nName: ");
                     name = word.Fill_String();
                 }

                 System.out.println("Surname: ");
                 surname = word.Fill_String();
                 while (!validation.checkName(surname)) {
                     System.out.println("Error, please enter surname as in example 'Vasylyk'!\nSurname: ");
                     surname = word.Fill_String();
                 }

                 System.out.println("Fathername: ");
                 fathername = word.Fill_String();
                 while (!validation.checkName(fathername)) {
                     System.out.println("Error, please enter fathername as in example 'Ihorovych'!\nFathername: ");
                     fathername = word.Fill_String();
                 }

                 System.out.println("Date Birthday (yyyy-mm-dd): ");
                 birthday = word.Fill_String();
                 while (!validation.checkDate(birthday)) {
                     System.out.println("Error, please enter b-day date in yyyy-mm-dd!\nDate Birthday: ");
                     birthday = word.Fill_String();
                 }

                 System.out.println("Date of prisoning (yyyy-mm-dd): ");
                 datasofpr = word.Fill_String();
                 while (!validation.checkDate(datasofpr)) {
                     System.out.println("Error, please enter data of prisoning in yyyy-mm-dd!\nDate of prisoning: ");
                     datasofpr = word.Fill_String();
                 }

                 System.out.println("Last prisoning date (yyyy-mm-dd): ");
                 lastpr = word.Fill_String();
                 while (!validation.checkDate(lastpr)) {
                     System.out.println("Error, please enter last prisoning date in yyyy-mm-dd!\nLast prisoning date: ");
                     lastpr = word.Fill_String();
                 }

                 System.out.println("Date of dismiss (yyyy-mm-dd): ");
                 dismiss = word.Fill_String();
                 while (!validation.checkDate(dismiss)) {
                     System.out.println("Error, please enter dissmis date in yyyy-mm-dd!\nDate of dissmis: ");
                     dismiss = word.Fill_String();
                 }

                 Prisoned prisoned = new Prisoned(id, name, surname,fathername,birthday, datasofpr, lastpr, dismiss);
                 bank.addNewPrizoner(prisoned);
                 id++;

                 System.out.println("\nPrisoner added to the police database successfully!\n");

                 break;
             case 2:
                 while (bool) {
                     System.out.println("Check prisoner by ID   (Press '0' for EXIT):");

                     iter = word.Fill_int();
                     bank.showInformation(iter);

                     switch (iter) {
                         case (0):
                             bank.showInformation(iter);
                             bool = false;
                             System.out.println("Goodbye!");
                             break;


                         default:
                             System.out.println("Here isn`t any prisoned with " + iter + " ID\n\n");


                 }
                 break;

         }
     }

        //System.out.println(bank.prisoned.get(0).getName());





    }

}}



