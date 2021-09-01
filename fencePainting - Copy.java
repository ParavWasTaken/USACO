import java.io.*;
import java.util.Scanner;

public class fencePainting {

    public static void main(String[] args) throws IOException{

    Scanner input = new Scanner(new File("paint.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("paint.out"));

    int a = input.nextInt(), b = input.nextInt();
    int c = input.nextInt(), d = input.nextInt();

    int total = (b - a) + (d - c);

    int intersection = Math.max(Math.min(b, d) - Math.max(a, c), 0);

    int answer = total - intersection;

    bw.write(answer);
    bw.close();

    }

}
