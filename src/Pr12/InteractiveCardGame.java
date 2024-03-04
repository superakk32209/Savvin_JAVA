import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InteractiveCardGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите карты первого игрока:");
        String player1Cards = scanner.nextLine();

        System.out.println("Введите карты второго игрока:");
        String player2Cards = scanner.nextLine();

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        // Инициализация очередей карт игроков
        for (int i = 0; i < 5; i++) {
            queue1.add(Integer.parseInt(String.valueOf(player1Cards.charAt(i))));
            queue2.add(Integer.parseInt(String.valueOf(player2Cards.charAt(i))));
        }

        int moves = 0;

        while (moves < 10_000_000) {
            if (queue1.isEmpty()) {
                System.out.println("second " + moves);
                break;
            } else if (queue2.isEmpty()) {
                System.out.println("first " + moves);
                break;
            }

            int card1 = queue1.poll();
            int card2 = queue2.poll();

            if (card1 == 0 && card2 == 9) {
                queue1.add(card2);
                queue1.add(card1);
            } else if (card2 == 0 && card1 == 9) {
                queue2.add(card1);
                queue2.add(card2);
            } else if (card1 > card2) {
                queue1.add(card1);
                queue1.add(card2);
            } else if (card2 > card1) {
                queue2.add(card2);
                queue2.add(card1);
            }

            moves++;
        }

        if (moves == 10_000_000) {
            System.out.println("botva");
        }
    }
}
