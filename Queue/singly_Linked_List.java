import java.util.Scanner;

public class singly_Linked_List
{
    static Node head = null;
    static Node tail = null;
    static Node display_purpose;
    static Node findval;
    static Node find,findp,newvalue,prev;
    static int size=0, count=0;
    static class Node

    {
        int val;
        Node next;

        Node(int a)
        {
            val = a;
            next = null;
        }

    }
    public void insertLast(int a)
    {
        Node node = new Node(a);
        size++;
        if(head==null)
        {
            head = node;
            tail = node;
        }

        else
        {
                tail.next = node;
                tail = node;
        }

    }

    public void insertFirst(int a)
    {
        Node node = new Node(a);
        size++;
        if(head==null)
        {
            head = node;
            tail = node;
        }

        else
        {
            node.next = head;
            head = node;
        }
    }

    public void delete(int a)
    {

        find = head;
//        System.out.println(find.next.next.val);

        //findp=tail;
//        findp = head;

        while(find.next!=null)
        {

            if(find.val==a)
            {
               System.out.println("\nSuccessfully deleted the number");
               count=1;
               prev.next = find.next;
                break;
            }
            else
            {
                prev = find;
               find = find.next;
//               System.out.println(find.next.val);
            }
            if(count==1)
            {
                break;
            }
        }
    }


    public void orderedLinkedList(int find,int replace)
    {
        findval = head;

        int count=0;

        while(findval.val!=find)
        {
            findval = findval.next;
            if(findval.val==tail.val)
            {
                if(findval.val != find)
                {
                    System.out.println("Sorry the element is not is in the linked list.");
                    count = 1;
                }
            }
        }

        if(count!=1)
        {

            Node node = new Node(replace);
            node.next = findval;

        }

    }

    public void display()
    {
        display_purpose = head;

        while(display_purpose!=tail)
        {
           System.out.print(display_purpose.val);
            display_purpose = display_purpose.next;
        }
        if(display_purpose==tail)
        {
           System.out.print(display_purpose.val);
           System.out.print(tail.val);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        singly_Linked_List list = new singly_Linked_List();

        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(10);

        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.display();
        list.delete(2);
        list.display();


//        list.orderedLinkedList(8);




//        System.out.println(size);


    }
}