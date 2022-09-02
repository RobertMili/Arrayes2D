public class SevenSecond {
    public static void main(String[] args) {

        int[][] eightFoure = new int[8][4];
        int[][] eightFoureSecond = new int[8][4];
        int[][] fourFour = new int[4][4];
        int[][] sixFour = new int[6][4];
        int[][] sevenFoure = new int[7][4];
        int[][] sixteenFour = new int[4][16];

        System.out.println("\ta");
        for (int i = 0; i < eightFoure[i].length; i++) {
            for (int j = 0; j < eightFoure.length; j++) {
                if (i == j)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\tb");
        for (int i = 0; i < eightFoureSecond[i].length; i++) {
            for (int j = 0; j < eightFoureSecond.length; j++) {

                if (i == j || i == (j % 4))
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\tc");
        for (int i = 0; i < eightFoureSecond[i].length; i++) {
            for (int j = 0; j < eightFoureSecond.length; j++) {

                if (i == j || i == (j - 1))
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\td");
        for (int i = 0; i < eightFoureSecond[i].length; i++) {
            for (int j = 0; j < eightFoureSecond.length; j++) {

                if (i == 2 || j == 4 || j == 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\te");
        for (int i = 0; i < eightFoureSecond[i].length; i++) {
            for (int j = 0; j < eightFoureSecond.length; j++) {

                if (i == 0 && j == 0 || i == 0 && j == 4 ||
                        i == 1 && j == 1 || i == 1 && j == 3 ||
                        i == 2 && j == 2 || i == 3 && j == 1 ||
                        i == 3 && j == 3)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\tf");
        for (int i = 0; i < fourFour.length; i++) {
            for (int j = 0; j < fourFour.length; j++) {

                if (i == 0 && j == 0 || i == 0 && j == 2 ||
                        i == 1 && j == 1 || i == 1 && j == 3 ||
                        i == 2 && j == 0 || i == 2 && j == 2 ||
                        i == 3 && j == 1 || i == 3 && j == 3)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\tg");
        for (int i = 0; i < sixFour[i].length; i++) {
            for (int j = 0; j < sixFour.length; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 2 ||
                        i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j == 2 ||
                        i == 2 && j == 0 || i == 2 && j == 1 || i == 2 && j == 2)
                    System.out.print("#");

                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\th");
        for (int i = 0; i < sevenFoure[i].length; i++) {
            for (int j = 0; j < sevenFoure.length; j++) {
                if (i == 0 && j == 2 || i == 0 && j == 5 || i == 0 && j == 6 ||
                        i == 1 && j == 3 || i == 1 && j == 5 || i == 1 && j == 6 ||
                        i == 2 && j == 4 ||
                        i == 3 && j == 5)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\ti");
        for (int i = 0; i < eightFoure.length - 4; i++) {
            for (int j = 0; j < eightFoure.length - 3; j++) {
                if (i == 0 && j == 2 ||
                        i == 2 && j == 2 ||
                        i == 3 && j == 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\tj");
        for (int i = 0; i < eightFoure.length - 4; i++) {
            for (int j = 0; j < eightFoure.length - 3; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 4 ||
                        i == 1 && j == 1 || i == 1 && j == 3 ||
                        i == 3 && j == 1 || i == 3 && j == 3 ||
                        i == 4 && j == 0 || i == 4 && j == 4)
                    System.out.print("#");
                else if (i == 2 && j == 2) {
                    System.out.print("0");

                } else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println("\tk");
        for (int i = 0; i < sixteenFour.length; i++) {
            for (int j = 0; j < sixteenFour[i].length; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 4 || i == 0 && j == 5 || i == 0 && j == 8 || i == 0 && j == 9 || i == 0 && j == 12 || i == 0 && j == 13 ||
                        i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j == 4 || i == 1 && j == 5 || i == 1 && j == 8 || i == 1 && j == 9 || i == 1 && j == 12 || i == 1 && j == 13 ||
                        i == 3)
                    System.out.print("#");
                else if (i == 2 && j == 0 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 2 && j == 5) {
                    System.out.print("W");
                } else if (i == 2 && j == 6 || i == 2 && j == 7 || i == 2 && j == 8 || i == 2 && j == 9 || i == 2 && j == 10 ||
                        i == 2 && j == 11 || i == 2 && j == 12 || i == 2 && j == 13 || i == 2 && j == 14 || i == 0 && j == 15) {
                    System.out.print("~");
                } else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }
}

