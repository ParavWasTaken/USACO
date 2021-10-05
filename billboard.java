import java.io.*;
import java.util.*;

public class billboard {
    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(new File("billboard.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("billboard.out"));

        int b1x1 = input.nextInt(), b1y1 = input.nextInt(), b1x2 = input.nextInt(), b1y2 = input.nextInt();
        int b2x1 = input.nextInt(), b2y1 = input.nextInt(), b2x2 = input.nextInt(), b2y2 = input.nextInt();
        int tx1 = input.nextInt(), ty1 = input.nextInt(), tx2 = input.nextInt(), ty2 = input.nextInt();

        int b1Area = (b1x2 - b1x1) * (b1y2 - b1y1);
        int b2Area = (b2x2 - b2x1) * (b2y2 - b2y1);

        int b1Xoverlap = Math.max(Math.min(b1x2, tx2) - Math.max(b1x1, tx1), 0);
        int b1Yoverlap = Math.max(Math.min(b1y2, ty2) - Math.max(b1y1, ty1), 0);
        int b1OverlapArea = b1Xoverlap * b1Yoverlap;

        int b2Xoverlap = Math.max(Math.min(b2x2, tx2) - Math.max(b2x1, tx1), 0);
        int b2Yoverlap = Math.max(Math.min(b2y2, ty2) - Math.max(b2y1, ty1), 0);
        int b2OverlapArea = b2Xoverlap * b2Yoverlap;

        int answer = (b1Area - b1OverlapArea) + (b2Area - b2OverlapArea);

        bw.write(Integer.toString(answer));
        bw.close();
    }
}
