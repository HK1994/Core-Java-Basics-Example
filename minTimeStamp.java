package hemant.code.problems;

import java.util.Arrays;
import java.util.Scanner;

public class minTimeStamp {
    public static void main(String[] args) {
        int h1;
        int h2;
        int s1;
        int s2;
        int m1;
        int m2;
           Scanner sc = new Scanner(System.in);
            int[] numbers = new int[6];
            for(int i=0;i<numbers.length;i++)
            {
                numbers[i]=sc.nextInt();
            }
        Arrays.sort(numbers);
            if(numbers[0]==0&&numbers[1]==0&&numbers[2]==0&&numbers[3]==0)
            {
                s2 = numbers[5];
                s1 = numbers[4];
                h2 = numbers[1];
                m1 = numbers[2];
                m2 = numbers[3];
                h1 = numbers[0];

                System.out.println("minimum date is " + h1 + h2 + ":" + m1 + m2 + ":" + s1 + s2 );
            }
            else if(!(numbers[1]==0&&numbers[2]==0&&numbers[3]==0&&numbers[0]==0)) {
                s2 = numbers[5];
                m2 = numbers[4];

                if (numbers[3] < 6 && numbers[2] < 6) {
                    m1 = numbers[2];
                    s1 = numbers[3];
                    if ((numbers[0] == 2 && numbers[1] < 4) || (numbers[0] == 1 || numbers[0] == 0)) {
                        h2 = numbers[1];
                        h1 = numbers[0];

                        System.out.println("minimum date is " + h1 + h2 + ":" + m1 + m2 + ":" + s1 + s2);
                    }


                }
            }

            else
            {
                System.out.println("Date not possible");
            }




    }
}
