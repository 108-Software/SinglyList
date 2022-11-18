import java.util.Scanner;

public class TestList {
    public static void main(String[] arg) {

        System.out.print(" 1. Добавить элемент в начало списка \n 2. Вывести список \n");
        System.out.print(" 3. Добавить элемент в конец списка \n 4. Удаление элемента из начала списка \n");
        System.out.print(" 5. Удаление элемента из конца списка \n 6. Удаление элемента по значению \n");
        System.out.print(" 7. Получение числа элементов в списке \n 8. Очистка списка \n");

        Scanner sc = new Scanner(System.in);

        int answer = 0;

        MyList SinglyList = new MyList();

        while (answer > 1 | answer < 10) {
            answer = sc.nextInt();
            if (answer==10 | answer>10 | answer == 0 | answer<0){break;}

            else {

                switch (answer) {

                    case 1:
                        System.out.print("Введите число которое хотите добавить: ");
                        int add = sc.nextInt();
                        SinglyList.ADDNode(add);
                        break;

                    case 2:
                        System.out.print("Значения списка: ");
                        SinglyList.print();
                        System.out.println();
                        break;

                    case 3:
                        System.out.print("Введите число которое хотите добавить: ");
                        int addl = sc.nextInt();
                        SinglyList.ADDLast(addl);
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
                        System.out.print("Всего элементов: ");
                        SinglyList.SUMMNode();
                        break;

                    case 8:
                        SinglyList.REMAll();
                        break;

                }

            }

        }

    }

}
