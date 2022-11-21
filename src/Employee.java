import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int ex;
        ArrayList<Object> arr = new ArrayList<Object>();
        do {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter 1.Add an employee\n 2.View an employee\n 3.Seach an employee\n 4.Delete an employee\n 5.Exit\n");
            int operation=sc.nextInt();
            switch (operation)
            {
                case 1:
                    ;
                    System.out.println("Enter Employee Code");
                    int ec = sc.nextInt();
                    arr.add(ec);


                    System.out.println("Enter Employee Name");
                    String en = sc.next();
                    arr.add(en);



                    System.out.println("Designation");
                    String ed = sc.next();
                    arr.add(ed);



                    System.out.println("Salary");
                    Double es = sc.nextDouble();
                    arr.add(es);



                    System.out.println("Company Name");
                    String cn = sc.next();
                    arr.add(cn);



                    System.out.println("Phone Number");
                    int ph = sc.nextInt();
                    arr.add(ph);




                    System.out.println("Email address");
                    String em = sc.next();
                    arr.add(em);

                    for (int i=0;i<arr.size();i++)
                    {
                        System.out.println(arr.get(i));
                    }
                    System.out.println();
                    break;






            }


            System.out.println("do you want to continue ?1.yes 2.no");
            ex=sc.nextInt();


        }while (ex==1);

    }
}
