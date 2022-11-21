import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int ex;
        do {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter 1.Add an employee\n 2.View an employee\n 3.Seach an employee\n 4.Delete an employee\n 5.Exit\n");
            int operation=sc.nextInt();
            switch (operation)
            {

            }


            System.out.println("do you want to continue ?1.yes 2.no");
            ex=sc.nextInt();


        }while (ex==1);

    }
}
