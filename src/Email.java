import java.util.Scanner;

public class Email {
    private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int mailCapasity = 500;
   private int passwordLength = 10;
   private  String alternateEmail;
   private String companysuffix = "company.com";

   public Email(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       this.department = setDepartment();
       System.out.println("Email created " + this.firstName +" "+  this.lastName);
       System.out.println("Department is " +this.department);
       //call a method asking for the Department - return the department
   this.password = randomPassword(passwordLength);
       System.out.println("Your password is  " +this.password );
       email =firstName.toLowerCase() +"." + lastName.toLowerCase() + "@" + department +"." +  companysuffix;
       System.out.println("Your email is " + email);

   }
   private String setDepartment(){
       System.out.println("Department codes:\n1 for Sales\n2 for Development\n3 for Accounting \n0 for none \n Enter code: " );
       Scanner scanner = new Scanner(System.in);
       int departmentChoice = scanner.nextInt();
       if(departmentChoice ==1)return "sales";
       else if(departmentChoice==2) return "dev";
       else if(departmentChoice ==3) return "acct";
       else return "";
   }
   private String randomPassword(int length){
       String passwordSet = "ABCDEFJHIJKLMNOPQRSTUVWXYZ123456789$#;";
       char[] password = new char[length];
       for(int i=0;i<length;i++){
          int ran  =  (int) (Math.random()* passwordSet.length());
          password[i] = passwordSet.charAt(ran);
       }
       return new String (password);

   }

}
