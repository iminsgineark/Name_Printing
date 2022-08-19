
package com.JAVA_DSA;

class NamePattern
{
    static int height = 5;
    static int width = (2 * height) - 1;

    static int abs(int d)
    {
        return d < 0 ? -1 * d : d;
    }

    static boolean printA()
    {
        int n = width / 2, i, j;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j <= width; j++)
            {
                if (j == n || j == (width - n)
                        || (i == height / 2 && j > n
                        && j < (width - n)))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            n--;
        }
        return false;
    }

    static boolean printI()
    {
        int i, j;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j < height; j++)
            {
                if (i == 0 || i == height - 1)
                    System.out.printf("*");
                else if (j == height / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        return false;
    }

    static boolean printK()
    {
        int i, j, half = height / 2, dummy = half;
        for (i = 0; i < height; i++)
        {
            System.out.printf("*");
            for (j = 0; j <= half; j++)
            {
                if (j == abs(dummy))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            dummy--;
        }
        return false;
    }



    static boolean printR()
    {
        int i, j, half = (height / 2);
        for (i = 0; i < height; i++)
        {
            System.out.printf("*");
            for (j = 0; j < width; j++)
            {
                if ((i == 0 || i == half)
                        && j < (width - 2))
                    System.out.printf("*");
                else if (j == (width - 2)
                        && !(i == 0 || i == half))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        return false;
    }

    static boolean printS()
    {
        int i, j;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j < height; j++)
            {
                if ((i == 0 || i == height / 2
                        || i == height - 1))
                    System.out.printf("*");
                else if (i < height / 2
                        && j == 0)
                    System.out.printf("*");
                else if (i > height / 2
                        && j == height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        return false;
    }

    static boolean printT()
    {
        int i, j;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j < height; j++)
            {
                if (i == 0)
                    System.out.printf("*");
                else if (j == height / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        return false;
    }

    static boolean printU()
    {
        int i, j;
        for (i = 0; i < height; i++)
        {
            if (i != 0 && i != height - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
            for (j = 0; j < height; j++)
            {
                if (((i == height - 1)
                        && j >= 0
                        && j < height - 1))
                    System.out.printf("*");
                else if (j == height - 1 && i != 0
                        && i != height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        return false;
    }


    static void printPattern(char character) {
        switch (character) {
            case 'A':
                printA();
                break;
            case 'I':
                printI();
                break;
            case 'K':
                printK();
                break;
            case 'R':
                printR();
                break;
            case 'S':
                printS();
                break;
            case 'T':
                printT();
                break;
            case 'U':
                printU();
                break;

        }
    }
    public static void main(String[] args)
    {
        char U = 'U';
        printPattern(U);
        char T = 'T';
        printPattern(T);
        char K = 'K';
        printPattern(K);
        char R = 'R';
        printPattern(R);
        char I = 'I';
        printPattern(I);
        char S = 'S';
        printPattern(S);
        char T1 = 'T';
        printPattern(T1);
        System.out.println("\n");
        char A = 'A';
        printPattern(A);
        char R1 = 'R';
        printPattern(R1);
        char K1 = 'K';
        printPattern(K1);
    }
}
