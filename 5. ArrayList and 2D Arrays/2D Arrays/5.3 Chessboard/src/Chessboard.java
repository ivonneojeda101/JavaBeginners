
public class Chessboard {
    public static void main(String[] args) {
        char[][] chessboard = new char[8][8];
        char color1 = '□';
        char color2 = '■';
        char finalColor = color1;
        for (int ind1 = 0; ind1 < chessboard.length; ind1++) {
            if (finalColor == color1) {
                finalColor = color2;
            } else {
                finalColor = color1;
            }
            for (int ind2 = 0; ind2 < chessboard[ind1].length; ind2++) {
                if (finalColor == color1) {
                    finalColor = color2;
                } else {
                    finalColor = color1;
                }
                chessboard[ind1][ind2] = finalColor;
                if (ind2 == 0 && ind1 > 0) {
                    System.out.println("\r");
                }
                System.out.print(finalColor);
            }
        }
        System.out.println("\r");
    }
}