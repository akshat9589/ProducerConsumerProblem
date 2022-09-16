package com.nexturn.akshat;

import java.util.Scanner;

class Producer extends Thread{
    private int n;
    public Producer(int num) {
        this.n =num;
    }

    public void run() {

        try {
            int rem, sum = 0, temp;
            temp = n;
            while (n > 0) {
                rem = n % 10;
                sum = (sum * 10) + rem;
                n = n / 10;
            }
            if (temp == sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check a number is palindrome or not");
        num=sc.nextInt();

        Producer p1=new Producer(num);
        Thread th=new Thread(p1);
        th.start();


    }
}

