import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int vitorias = 0;
        sc.nextLine();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < a; i++) {
            if(!list.get(i).contains("CD")){
                vitorias++;
            }
        }

        System.out.println(vitorias);
    }
}
