package zad3;

import javax.jws.soap.SOAPBinding;

public class Zad3 {
    public static void main(String[] args) {

        for (int i=5; i<=50; i+=2){
            System.out.println(i);
        }

        for ( int i = 5; i<=50; i++){
            if (i%2 == 1)
                System.out.println(i);
        }

        for ( int i = 5; i<=50; i++){
            if (i%2==0)
                continue;
            System.out.println(i);
        }
    }
}
