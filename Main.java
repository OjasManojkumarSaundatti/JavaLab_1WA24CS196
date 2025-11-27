import CIE.Student;
import CIE.Internals;
import SEE.External;
import java.util.Scanner;
public class Main {
    public static void main (String args []) {
        int n,sem; String name,usn;
        System.out.println("Enter number of students:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        Student stds[]=new Student[n];
        Internals i[]=new Internals[n];
        External e[]=new External[n];
        for(int j=0;j<n;j++){
            System.out.print("Enter Details of Student "+(j+1)+":");
            System.out.print("Name:");
            sc.nextLine();
            name=sc.nextLine();
            System.out.println("USN:");
            usn=sc.nextLine();
            System.out.println("Enter Semester");
            sem=sc.nextInt(); stds[j]=new Student(usn,name,sem);
            i[j]=new Internals();
            System.out.println("Enter internal marks");
            i[j].setImarks();
            e[j]=new External();
            System.out.println("Enter external marks");
            e[j].setEmarks();
        }

        for(int j=0;j<n;j++){
            System.out.println("");
            System.out.println("Student "+(j+1)+" Details:");
            stds[j].display();
            System.out.println("Internal Marks:");
            i[j].displayImarks();
            System.out.println("External Marks:");
            e[j].displayEmarks();
            System.out.println("Total Marks :");
            for(int k=0;k<5;k++){
                System.out.println("Subject"+ (k+1)+ ": "+(i[j].imarks[k]+e[j].emarks[k]));
            }
        }
    }
}