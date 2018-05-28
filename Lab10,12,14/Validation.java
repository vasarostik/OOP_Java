package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validation {
    boolean checkDate(String Date){
        Pattern p = Pattern.compile("^[0-9]{4}-(((0[13578]|(10|12))-(0[1-9]|[1-2][0-9]|3[0-1]))|(02-(0[1-9]|[1-2][0-9]))|((0[469]|11)-(0[1-9]|[1-2][0-9]|30)))$");
        Matcher m = p.matcher(Date);
        return m.matches();
    }
    boolean checkName(String userName){
        Pattern p = Pattern.compile("^[A-Z][a-z]*$");
        Matcher m = p.matcher(userName);
        return m.matches();
    }


}
