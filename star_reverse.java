import java.util.Scanner;

class second_practice_star_reverse {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt(); 
    for(int i = 0; i<num; i++){
        for(int x = num-1; x>i; x--){
            System.out.print(" ");
        }
        for(int j = 0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    scanner.close();
    }
}
