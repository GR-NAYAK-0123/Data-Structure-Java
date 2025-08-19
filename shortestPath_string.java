import java.util.Scanner;

public class shortestPath_string {
    public static float shortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'n'){
                y++;
            }
            else if(str.charAt(i) == 'w'){
                x++;
            }
            else if(str.charAt(i) == 's'){
                y--;
            }
            else if(str.charAt(i) == 'e'){
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "wneenese";
            System.out.println("The shortest path is " + shortestPath(str));
            sc.close();
        }
    }
}
