import java.util.Scanner;
public class Fascinating{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i <= n; i++){
            if(fasc(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean fasc(int i){
        int i2 = i*2;
        int i3 = i*3;
        String s = Integer.toString(i) + Integer.toString(i2)  + Integer.toString(i3);
        for(int c = 1; c <= 9; c++){
            String k1 = Integer.toString(c);
            char k = Character.parseCharacter(k1);
        }
    }
}