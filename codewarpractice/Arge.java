package codewarpractice;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {

        //int numP0 = p0;

        //int numAug = aug;
        //int numP = p;
        double per = percent * 0.01;

        int count = 1;
        double sum = p0 + (p0 * per) + aug;
        while (sum < p) {
            p0 = (int) sum;
            sum = p0 + (p0 * per) + aug;
            count++;
        }

        return count;


        // your code
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }
}
