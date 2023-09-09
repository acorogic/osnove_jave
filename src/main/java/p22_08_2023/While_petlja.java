package p22_08_2023;

import java.util.Scanner;

public class While_petlja {
    public static void main(String[] args) {

//        //while (condition true or false) {}
//        int i=0;//iterator
//        while (i<5); {
//            System.out.println(i);
//        i++;
//        }
//        System.out.println(i);
        Scanner s= new Scanner(System.in)  ;
int broj= -1;

while (broj !=0) {
    System.out.println("unesite broj :" );
        broj = s.nextInt();
    System.out.println("Uneli ste broj" + broj); // ovde mozemo da racunamo sumu ili neku od drugih komandi
}

        System.out.println("kraj");
    }
}
