import java.util.Scanner;

public class testany {
    static int fornt=-1;
    static int rear=-1;
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        boolean start=true;
        int[] arry=new int[5];

        while (start)
        {
            System.out.println("enter 1 for insert element in queue");
            System.out.println();
            System.out.println("enter 2 for delet element form queue");
            System.out.println();
            System.out.println("enter 3 for desplay queue");
            System.out.println();
            System.out.println("enter 4 for quite");
            int temp=sc.nextInt();

            if(temp==1) {
                condition1(arry);
                System.out.println("**** your number is add sussecfully in queue ****");
            }

            else if(temp==2)
                System.out.println("------  this number is delet form queue -----" +delet(arry)+"-----");


            else if(temp==3)
                display(arry);


            else
                start=false;

        }

    }
    public static void condition1(int[] arr)
    {
        System.out.println("-----enter your element which you want to insert in queue-----");
        System.out.println();
        int tempnumber=sc.nextInt();
        insert(arr,arr.length,tempnumber);
    }
    public static void insert(int[] arr,int lenght,int number)
    {

        if(fornt>-1 && rear>=lenght-1)
        {
            rear=-1;
        }
        if(rear==fornt-1)
        {
            System.out.println("u can't add more ");
        }
        else if(rear>lenght-1)
        {
            System.out.println("u can't more add");

        }
        else
        {
            rear++;
            arr[rear]=number;
            if(fornt==-1)
            {
                fornt++;
            }
        }
    }
    public static int delet(int[] arr)
    {

        if(fornt<0)
        {
            System.out.println("queue is empyttttttttttttttt");
            return 0;
        }