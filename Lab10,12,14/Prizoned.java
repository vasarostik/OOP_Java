package com.company;


import java.io.Serializable;

class Prisoned implements Serializable {
    private int id;
    private String Name;
    private String Surname;
    private String Fathername;
    private String DateOfBirth;
    private String DateOfPrisoning;
    private String DateLastPrisoning;
    private String DateDismiss;
    byte version = 100;
    public byte count = 0;

    Prisoned(int id,
             String name,
             String surname,
             String Fathername,
             String DateOfBirth,
             String DateOfPrisoning,
             String DateLastPrisoning,
             String DateDismiss){

        this.id=id;
        this.Name=name;
        this.Surname=surname;
        this.Fathername=Fathername;
        this.DateOfBirth=DateOfBirth;
        this.DateOfPrisoning=DateOfPrisoning;
        this.DateLastPrisoning=DateLastPrisoning;
        this.DateDismiss=DateDismiss;

    }

    String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }

    String getDateDismiss() {
        return DateDismiss;
    }

    String getDateLastPrisoning() {
        return DateLastPrisoning;
    }

    String getDateOfBirth() {
        return DateOfBirth;
    }

    String getDateOfPrisoning() {
        return DateOfPrisoning;
    }

    String getFathername() {
        return Fathername;
    }

    String getSurname() {
        return Surname;
    }

    int getId() {
        return id;
    }

}
