import java.util.Scanner;

public class ArenaFindingRootsNS {

private void quadEqSol(int a, int b, int c) {
    double firstRoot, secondRoot;
    
    double det = b * b - 4 * a * c;

    if(det > 0) {
        firstRoot = (-b + Math.sqrt(det)) / (2 * a);
        secondRoot = (-b - Math.sqrt(det)) / (2 * a);
        System.out.println(firstRoot);
        System.out.println(secondRoot);

    }
    if(det == 0) {
        firstRoot = secondRoot = -b / (2 * a);
        System.out.println(firstRoot);
        System.out.println(secondRoot);
    }
    if(det < 0) {
        double real = -b / (2 * a);
        double img = Math.sqrt(-det) / (2 * a);
        System.out.println(real + "+i" + img);
        System.out.println(real + "-i" + img);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArenaFindingRootsNS obj = new ArenaFindingRootsNS();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        obj.quadEqSol(a, b, c);

        sc.close();
    }
}
