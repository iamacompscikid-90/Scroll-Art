import java.util.Random;

public class asciiartv2 {
   static final int WIDTH = getTerminalWidth() - 1;
   static final Random rand = new Random();
   // NO OVERLAPS
   // 1. Skip every w (width) characters instead of every column to reduce
   // horizontal overlap
   // 2. How do you reduce overlap vertically? Remember previous row at the
   // specific width


   public static void main(String[] args) throws InterruptedException {
       long startTime = System.currentTimeMillis();
       int iterations = 0;
       char[][] nextRows = new char[25][WIDTH]; // store upcoming rows
       for (int i = 0; i < nextRows.length; i++) {
           nextRows[i] = emptyRow();
       }
       char[] prevRow = nextRows[0];


       while (true) {
           // At each lane now on the top row, 7% chance to add a new image
           for (int x = 0; x < WIDTH - 25; x += 25) {
               if (isBlank(prevRow, x) && rand.nextDouble() < 0.07) {
                   loadNextRowsWithImage(nextRows, x);
               }
           }
           // Print and remove the top row
           System.out.println(new String(nextRows[0]));
           prevRow = nextRows[0]; // update prev row
           // Shift all rows up
           shiftRowsUp(nextRows);
           Thread.sleep(40); // Delay in ms
           long time = System.currentTimeMillis() - startTime;
           iterations++;


           // System.err.println("average time per frame: " + (time / iterations) + " ms");
       }
   }


   // #2: checking if row is blank
   static boolean isBlank(char[] row, int x) {
       for (int i = x; i < x + 25; i++) {
           if (row[i] != ' ') {
               return false;
           }
       }
       return true;
   }


   private static void loadNextRowsWithImage(char[][] nextRows, int x) {
       // triple array version to better manage all images, it's getting a little bit out of hand!! and it is not like they are all the same size anyway.
       char[][][] images = {getWoodstock(), getMiffy(), getSnoopy(), getFish()};
       char[][] img = images[rand.nextInt(images.length)];
       for (int iy = 0; iy < img.length; iy++) { // height
           for (int ix = 0; ix < img[iy].length; ix++) { // width
               nextRows[iy][x + ix] = img[iy][ix];
           }
       }
   }


   static void shiftRowsUp(char[][] nextRows) {
       for (int i = 1; i < nextRows.length; i++) {
           nextRows[i - 1] = nextRows[i];
       }
       nextRows[nextRows.length - 1] = emptyRow();
   }


   static char[] emptyRow() {
       char[] row = new char[WIDTH];
       for (int i = 0; i < WIDTH; i++) {
           row[i] = ' ';
       }
       return row;
   }

    static char[][] getWoodstock() {
        char[][] arr = new char[10][10];

        for (int y = 0; y < arr[0].length; y++) {
            for (int x = 0; x < arr.length; x++) {
                arr[x][y] = ' ';
            }
        }

        arr[2][2] = '_';
        arr[2][3] = '(';
        arr[2][4] = '\\';
        arr[2][5] = '(';
        arr[2][6] = '_';
        arr[3][2] = '<';
        arr[3][5] = '\'';
        arr[3][6] = '_';
        arr[3][7] = ')';
        arr[4][3] = ')';
        arr[4][5] = '(';
        arr[5][2] = '<';
        arr[5][3] = '/';
        arr[5][6] = ')';
        arr[6][4] = '√';
        arr[6][5] = '√';
        arr[7][7] = 'S';
        arr[7][8] = 'C';



        return arr;
    }
    static char[][] getSnoopy() {
        char[][] arr = new char[17][17];

        for(int y = 0; y < arr[0].length; y++) {
            for(int x = 0; x < arr.length; x++) {
                arr[x][y] = ' ';
            }
        }
            arr[1][4] = '_';
            arr[1][5] = '_';
            arr[1][6] = '_';
            arr[1][7] = '_';
            arr[1][8] = '_';
            arr[2][3] = '/';
            arr[2][4] = '\\';
            arr[2][7] = '@';
            arr[2][8] = '@';
            arr[2][9] = '\\';
            arr[2][10] = '_';
            arr[2][11] = '_';
            arr[2][12] = '_';
            arr[3][2] = '/';
            arr[3][3] = '#';
            arr[3][4] = '#';
            arr[3][5] = '\\';
            arr[3][12] = '•';
            arr[3][13] = '\\';
            arr[4][2] = '|';
            arr[4][3] = '#';
            arr[4][4] = '#';
            arr[4][5] = '|';
            arr[4][10] = '_';
            arr[4][11] = '_';
            arr[4][12] = '_';
            arr[4][13] = '|';
            arr[5][2] = '\\';
            arr[5][3] = '#';
            arr[5][4] = '#';
            arr[5][5] = '/';
            arr[5][6] = '\\';
            arr[5][7] = '_';
            arr[5][8] = '_';
            arr[5][9] = '_';
            arr[5][10] = '_';
            arr[5][11] = '_';
            arr[5][12] = '_';
            arr[5][13] = '/';
            arr[6][5] = '|';
            arr[6][8] = '|';
            arr[7][1] = '\\';
            arr[7][2] = '\\';
            arr[7][3] = '\\';
            arr[7][5] = '|';
            arr[7][6] = '|';
            arr[7][7] = '|';
            arr[7][9] = '\\';
            arr[8][3] = '\\';
            arr[8][4] = '\\';
            arr[8][5] = '|';
            arr[8][6] = 'π';
            arr[8][7] = 'π';
            arr[8][9] = '|';
            arr[9][5] = '\\';
            arr[9][6] = '_';
            arr[9][7] = '_';
            arr[9][8] = '_';
            arr[9][9] = '/';
            arr[10][6] = '|';
            arr[10][7] = '|';
            arr[12][12] = 'S';
            arr[13][12] = 'C';




        return arr;
    }

   // Ella's Miffy
    static char[][] getMiffy() {
        char[][]img = new char [22][23];
        for(int y= 0; y < 22; y++ ) {
            for(int x = 0;x < 23;x++) {
                img[y][x]=' ';
            }
        }

        // ears
        img[1][7] = '_';
        img[2][6] = '/';
        img[2][8] = '\\';
        img[3][5] = '(';
        img[3][9] = ')';
        img[4][5] = '|';
        img[4][9] = '|';
        img[5][5] = '|';
        img[5][9] = '|';

        img[1][16] = '_';
        img[2][15] = '/';
        img[2][17] = '\\';
        img[3][14] = '(';
        img[3][18] = ')';
        img[4][14] = '|';
        img[4][18] = '|';
        img[5][14] = '|';
        img[5][18] = '|';

        img[5][10] = '_';
        img[5][11] = '_';
        img[5][12] = '_';
        img[5][13] = '_';

        // head

        img[6][4] = '/';
        img[7][3] = '/';
        img[8][2] = '/';
        img[6][19] = '\\';
        img[7][20] = '\\';
        img[8][21] = '\\';

        img[9][2] = '|';
        img[9][21] = '|';

        img[10][3] = '\\';
        img[11][4] = '\\';
        img[10][20] = '/';
        img[11][19] = '/';

        for(int i = 5; i <= 18; i++){
            img[11][i] = '_';
        }

        // arms and body

        img[12][5] = '/';
        img[13][4] = '/';
        img[14][3] = '/';
        img[15][2] = '/';
        img[16][2] = '\\';
        img[17][3] = '\\';

        img[12][18] = '\\';
        img[13][19] = '\\';
        img[14][20] = '\\';
        img[15][21] = '\\';
        img[16][21] = '/';
        img[17][20] = '/';

        img[16][4] = '|';
        img[17][4] = '|';
        img[18][4] = '|';
        img[16][19] = '|';
        img[17][19] = '|';
        img[18][19] = '|';

        for(int i = 5; i <= 18; i++){
            img[18][i] = '_';
        }

        // feet

        img[19][8] = '/';
        img[19][12] = '|';
        img[19][16] = '\\';

        img[19][9] = '_';
        img[19][10] = '_';
        img[19][11] = '_';
        img[19][13] = '_';
        img[19][14] = '_';
        img[19][15] = '_';

        // face

        img[8][7] = '@';
        img[8][16] = '@';
        img[9][11] = '\\';
        img[10][12] = '\\';
        img[9][12] = '/';
        img[10][11] = '/';

        // signature
        img[21][4] = 'E';
        img[21][5] = 'Y';
        return img;

        
    }

   //Samira Fraser's Fish
   static char[][] getFish() {
        char[][] img = new char[10][12];
        // fill with empty space
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 12; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        //small fish
        //top fin
        img[1][6] = '\\';
        img[2][3] = '\\';
        img[2][7] = '\\';
        img[3][8] = '\\';
        img[4][5] = '\\';
        img[4][9] = '\\';
        img[4][5] = '\\';
        img[4][8] = '/';
        img[5][6] = '>';
        img[5][7] = '=';
        img[5][10] = 'o';
        img[5][11] = '>';
        img[6][5] = '/';
        img[6][8] = '\\';
        img[6][9] = '/';
        img[7][4] = '/';
        img[7][8] = '/';
        img[8][3] = '/';
        img[8][7] = '/';
        

        


       

        return img;
    }



   public static int getTerminalWidth() {
       String os = System.getProperty("os.name").toLowerCase();


       if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
           return getUnixTerminalWidth();
       } else {
           return 80; // fallback for unknown OS
       }
   }


   private static int getUnixTerminalWidth() {
       try {
           // Try to get terminal size from environment variables first
           String columns = System.getenv("COLUMNS");
           if (columns != null && !columns.isEmpty()) {
               return Integer.parseInt(columns);
           }


           // Fallback to stty command
           ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "stty size </dev/tty");
           pb.redirectErrorStream(true);
           Process process = pb.start();
           java.io.BufferedReader reader = new java.io.BufferedReader(
                   new java.io.InputStreamReader(process.getInputStream()));
           String output = reader.readLine();
           if (output != null && !output.isEmpty()) {
               String[] parts = output.trim().split(" ");
               return Integer.parseInt(parts[1]); // columns
           }
       } catch (Exception ignored) {
           // Silently ignore errors and fall back to default
       }
       return 80; // fallback
   }


}

