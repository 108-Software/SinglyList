import java.util.Scanner;


public class TestList {
    public static void main(String[] arg) {

        System.out.print(" 1. Добавить элемент \n 2. Вывести список \n");
        System.out.print(" 3. Добавить элеммент в начало списка \n 4. Добавить элемент в конец списка \n");
        System.out.print(" 5. Удаление элемента из начала списка \n 6. Удаление элемента из конца списка \n");
        System.out.print(" 7. Удаление элемента по значению \n 8. Получение числа элементов в списке \n");
        System.out.print(" 9. Очистка списка \n");

        Scanner sc = new Scanner(System.in);

        int answer = 0;

        while (answer > 1 | answer < 10) {
            answer = sc.nextInt();
            if (answer==10 | answer>10 | answer == 0 | answer<0){break;}

            else {
                MyList SinglyList = new MyList();

                switch (answer) {

                    case 1:
                        System.out.print("Введите число которое хотите добавить: ");
                        int add = sc.nextInt();
                        SinglyList.ADDNode(add);
                        break;

                    case 2:
                        System.out.print("Значения списка: ");
                        SinglyList.print();
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    case 6:
                        System.out.print("Введите значение которое хотите удалить: ");
                        int rem = sc.nextInt();
                        SinglyList.REMNode(rem);
                        break;

                    case 7:
                        break;

                    case 8:
                        break;

                    case 9:
                        break;


                }

            }

        }

    }

}
