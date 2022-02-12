import java.util.*;
class Employee
{
    String name;
    long id;
    String address;
    String mail;
    long mobno;
    void getEmployeeDetails(Scanner sc)
    {
        name=sc.nextLine();
        id=Long.parseLong(sc.nextLine());
        address=sc.nextLine();
        mail=sc.nextLine();
        mobno=Long.parseLong(sc.nextLine());
    }
}
class Programmer extends Employee
{
   double bp;
   void getBasicPay(Scanner sc)
   {
       bp=sc.nextDouble();
       sc.nextLine();
   }
   double gross,net;
   void printPaySlip()
   {
       gross=bp+(0.97*bp)+(0.10*bp);
       net=gross-(0.12*bp)-(0.001*bp);
       System.out.println("EMPLOYEE DETAILS");
       System.out.println("Name: "+name);
       System.out.println("Id: "+id);
       System.out.println("Address: "+address);
       System.out.println("Mail: "+mail);
       System.out.println("Mobile: "+mobno);
       System.out.println("PAY SLIP FOR PROGRAMMER");
       System.out.println("BP: Rs. "+bp);
       System.out.println("DA: Rs. "+String.format("%.1f",0.97*bp));
       System.out.println("HRA: Rs. "+String.format("%.1f",0.10*bp));
       System.out.println("PF: Rs. "+String.format("%.1f",0.12*bp));
       System.out.println("Staff Club Fund: Rs. "+String.format("%.1f",0.001*bp));
       System.out.println("Gross Salary: Rs. "+String.format("%.1f",gross));
       System.out.println("Net Salary: Rs. "+String.format("%.1f",net));
   }
}
class AssistantProfessor extends Employee
{
    double bp;
    void getBasicPay(Scanner sc)
    {
        bp=Double.parseDouble(sc.nextLine());
    }
    double gross,net;
    void printPaySlip()
    {
        gross=bp+(0.97*bp)+(0.10*bp);
        net=gross-(0.12*bp)-(0.001*bp);
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Address: "+address);
        System.out.println("Mail: "+mail);
        System.out.println("Mobile: "+mobno);
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
        System.out.println("BP: Rs. "+bp);
        System.out.println("DA: Rs. "+String.format("%.1f",0.97*bp));
        System.out.println("HRA: Rs. "+String.format("%.1f",0.10*bp));
        System.out.println("PF: Rs. "+String.format("%.1f",0.12*bp));
        System.out.println("Staff Club Fund: Rs. "+String.format("%.1f",0.001*bp));
        System.out.println("Gross Salary: Rs. "+String.format("%.1f",gross));
        System.out.println("Net Salary: Rs. "+String.format("%.1f",net));
    }
}
class AssociateProfessor extends Employee
{
    double bp;
    void getBasicPay(Scanner sc)
    {
        bp=sc.nextDouble();
        sc.nextLine();
    }
    double gross,net;
    void printPaySlip()
    {
        gross=bp+(0.97*bp)+(0.10*bp);
        net=gross-(0.12*bp)-(0.001*bp);
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Address: "+address);
        System.out.println("Mail: "+mail);
        System.out.println("Mobile: "+mobno);
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println("BP: Rs. "+bp);
        System.out.println("DA: Rs. "+String.format("%.1f",0.97*bp));
        System.out.println("HRA: Rs. "+String.format("%.1f",0.10*bp));
        System.out.println("PF: Rs. "+String.format("%.1f",0.12*bp));
        System.out.println("Staff Club Fund: Rs. "+String.format("%.1f",0.001*bp));
        System.out.println("Gross Salary: Rs. "+String.format("%.1f",gross));
        System.out.println("Net Salary: Rs. "+String.format("%.1f",net));
    }
}
class Professor extends Employee
{
    double bp;
    void getBasicPay(Scanner sc)
    {
        bp=sc.nextDouble();
        sc.nextLine();
    }
    double gross,net;
    void printPaySlip()
    {
        gross=bp+(0.97*bp)+(0.10*bp);
        net=gross-(0.12*bp)-(0.001*bp);
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Address: "+address);
        System.out.println("Mail: "+mail);
        System.out.println("Mobile: "+mobno);
        System.out.println("PAY SLIP FOR PROFESSOR");
        System.out.println("BP: Rs. "+bp);
        System.out.println("DA: Rs. "+String.format("%.1f",0.97*bp));
        System.out.println("HRA: Rs. "+String.format("%.1f",0.10*bp));
        System.out.println("PF: Rs. "+String.format("%.1f",0.12*bp));
        System.out.println("Staff Club Fund: Rs. "+String.format("%.1f",0.001*bp));
        System.out.println("Gross Salary: Rs. "+String.format("%.1f",gross));
        System.out.println("Net Salary: Rs. "+String.format("%.1f",net));
    }
}
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int ctr = 1; ctr <= N; ctr++) {
            int employeeType = Integer.parseInt(sc.nextLine());
            switch (employeeType) {
                case 1:
                    Programmer programmer = new Programmer();
                    if (!(programmer instanceof Employee)) {
                        System.out.println("Employee Not Inherited");
                    }
                    programmer.getEmployeeDetails(sc);
                    programmer.getBasicPay(sc);
                    programmer.printPaySlip();
                    break;

                case 2:
                    AssistantProfessor assistantProfessor = new AssistantProfessor();
                    if (!(assistantProfessor instanceof Employee)) {
                        System.out.println("Employee Not Inherited");
                    }
                    assistantProfessor.getEmployeeDetails(sc);
                    assistantProfessor.getBasicPay(sc);
                    assistantProfessor.printPaySlip();
                    break;
                case 3:
                    AssociateProfessor associateProfessor = new AssociateProfessor();
                    if (!(associateProfessor instanceof Employee)) {
                        System.out.println("Employee Not Inherited");
                    }
                    associateProfessor.getEmployeeDetails(sc);
                    associateProfessor.getBasicPay(sc);
                    associateProfessor.printPaySlip();
                    break;
                case 4:
                    Professor professor = new Professor();
                    if (!(professor instanceof Employee)) {
                        System.out.println("Employee Not Inherited");
                    }
                    professor.getEmployeeDetails(sc);
                    professor.getBasicPay(sc);
                    professor.printPaySlip();
                    break;
            }
        }
    }
}
