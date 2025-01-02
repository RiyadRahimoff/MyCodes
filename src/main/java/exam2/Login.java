package exam2;

import exam2.Exceptions.AgeException;
import exam2.Exceptions.MailException;

public class Login {
    public static void main (String[] args) {
        try{
      enterAge(13);
      enterMail("riyadrehimov10mail.ru");
    }catch(MailException | AgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static void enterAge(int age){
      if(age<18 | age>100){
          throw new AgeException("Your age must be between >=18 and <100");
      }
      else {
          System.out.println("Age is correct");
      }
    }

    public static void enterMail(String mail){
        if(mail.contains("@")){
            System.out.println("Mail added!");
        }
        else{
            throw new MailException("Your mail must have @ sybmol");
        }
    }
}
