public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            

            char[][] woodstock = getWoodstock();

        for (int y = 0; y < woodstock[0].length; y++) {
            for (int x = 0; x < woodstock.length; x++) {
                System.out.print(woodstock[x][y]);
            }
            System.out.println();
        }

        char[][] snoopy = getSnoopy();

        for(int y = 0; y < snoopy[0].length; y++) {
            for(int x = 0; x < snoopy[0].length; x++) {
                System.out.print(snoopy[x][y]);
            }
            System.out.println();
        }
        Thread.sleep(20);
        }
        
    }

    static char[][] getWoodstock() {
        char[][] arr = new char[10][10];

        for (int y = 0; y < arr[0].length; y++) {
            for (int x = 0; x < arr.length; x++) {
                arr[x][y] = ' ';
            }
        }

        arr[2][2] = '_';
        arr[3][2] = '(';
        arr[4][2] = '\\';
        arr[5][2] = '(';
        arr[6][2] = '_';
        arr[2][3] = '<';
        arr[5][3] = '\'';
        arr[6][3] = '_';
        arr[7][3] = ')';
        arr[3][4] = ')';
        arr[5][4] = '(';
        arr[2][5] = '<';
        arr[3][5] = '/';
        arr[6][5] = ')';
        arr[4][6] = '√';
        arr[5][6] = '√';
        arr[7][7] = 'S';
        arr[8][7] = 'C';


        return arr;
    }
    static char[][] getSnoopy() {
        char[][] arr = new char[17][17];

        for(int y = 0; y < arr[0].length; y++) {
            for(int x = 0; x < arr.length; x++) {
                arr[x][y] = ' ';
            }
        }
        arr[4][1] = '_';
        arr[5][1] = '_';
        arr[6][1] = '_';
        arr[7][1] = '_';
        arr[8][1] = '_';
        arr[3][2] = '/';
        arr[4][2] = '\\';
        arr[7][2] = '@';
        arr[8][2] = '@';
        arr[9][2] = '\\';
        arr[10][2] = '_';
        arr[11][2] = '_';
        arr[12][2] = '_';
        arr[2][3] = '/';
        arr[3][3] = '#';
        arr[4][3] = '#';
        arr[5][3] = '\\';
        arr[12][3] = '•';
        arr[13][3] = '\\';
        arr[2][4] = '|';
        arr[3][4] = '#';
        arr[4][4] = '#';
        arr[5][4] = '|';
        arr[10][4] = '_';
        arr[11][4] = '_';
        arr[12][4] = '_';
        arr[13][4] = '|';
        arr[2][5] = '\\';
        arr[3][5] = '#';
        arr[4][5] = '#';
        arr[5][5] = '/';
        arr[6][5] = '\\';
        arr[7][5] = '_';
        arr[8][5] = '_';
        arr[9][5] = '_';
        arr[10][5] = '_';
        arr[11][5] = '_';
        arr[12][5] = '_';
        arr[13][5] = '/';
        arr[5][6] = '|';
        arr[8][6] = '|';
        arr[1][7] = '\\';
        arr[2][7] = '\\';
        arr[3][7] = '\\';
        arr[5][7] = '|';
        arr[6][7] = '|';
        arr[7][7] = '|';
        arr[9][7] = '\\';
        arr[3][8] = '\\';
        arr[4][8] = '\\';
        arr[5][8] = '|';
        arr[6][8] = 'π';
        arr[7][8] = 'π';
        arr[9][8] = '|';
        arr[5][9] = '\\';
        arr[6][9] = '_';
        arr[7][9] = '_';
        arr[8][9] = '_';
        arr[9][9] = '/';
        arr[6][10] = '|';
        arr[7][10] = '|';
        arr[12][12] = 'S';
        arr[13][12] = 'C';



        return arr;
    }
}


