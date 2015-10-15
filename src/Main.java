import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dariya on 15.10.2015.
 * �������� ����� �� 0 �� 100. � ��� ���� ���� ������� �� ����������.
 * ��� ������ ������� ����� ���������� ��������� - "����" ��� "�����". ���� ��������, ���������� � ���� �������, �� ��������. ���� ���, ������� ��������� � ����� ���������� � ��������� ��� �����
 * ��� ��������� ���������� ����� � ������ � ������� ����������� ���:
 * Random r = new Random();
 * int secret = r.nextInt(100) + 1;
 * int i = System.in.read();
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int secret = r.nextInt(100) + 1;
        System.out.println("Secret:" + secret);
        System.out.println("Try to guess the number from 0 to 100");
        int i = 0;
        int number;
        do {
            number = sc.nextInt();
            if (number == secret) {
                i++;
                System.out.println("Winner!");
            } else {
                if (number < secret) {
                    i++;
                    System.out.println("The number is bigger");
                } else {
                    i++;
                    System.out.println("The number is smaller");
                }
            }
        } while (number == secret || i < 7);
        System.out.println("The end of the game");
    }
}
/*for (int i = 0; i < 7; i++) {
        int number = sc.nextInt();
        if (number < secret) {
        System.out.println("The number is bigger");
        } else {
        System.out.println("The number is smaller");

        } if(number==secret){
        System.out.println("Winner!");
        }
        }*/