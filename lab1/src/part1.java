public class part1 {
    public static void main(String[] args) {
//        Lab 1 part 1 - Array
//
//        Initiate two integer arrays, x, and y, each containing 5 numbers.
//                Create another array z of length 5, the elements of which are the max of the respective numbers of the two arrays x and y.
//                Organize a nice-looking output to the terminal that looks like the following:
//        Array x = { array x values here separated by coma }
//
//        Array y = { array y values here separated by coma }
//
//        Array z = x + y = { array z values here separated by coma }

        int[] x = {1, 2, 3, 4, 5};
        int[] y = {6,7,8,9,10};
        int[] z = new int[5];
        String xx = "";
        String yy = "";
        String zz = "";
        for (int i = 0; i < x.length; i++) {
            if (x[i] == x[4]){
                xx += x[i];
            }else {
                xx =xx + x[i] + ",";
            }
            z[i] = x[i] + y[i];
        }
        System.out.println("Array x = {"+ xx + "}");
        for (int i = 0; i < y.length; i++) {
            if (y[i] == y[4]){
                yy += y[i];
            }else {
                yy =yy + y[i] + ",";
            }
        }
        System.out.println("Array y = {"+ yy + "}");

        for (int i = 0; i < z.length; i++) {
            if (z[i] == z[4]){
                zz += y[i];
            }else {
                zz =zz + y[i] + ",";
            }
        }
        System.out.println("Array z = x + y = {"+ zz + "}");
    }
}
