package com.ccee;

class Main {
    static int n1=100;
    static int n2=200;
    static{
        n1+=1;
        n2+=1;
        System.out.println("s1");
        }
        
    public static void main(String[] args) {
        n1+=5;
        n2+=10;
        System.out.println(n1+n2);
    }
    static{
        n1+=200;
        n1+=300;
        System.out.println("s2");
    }
}
