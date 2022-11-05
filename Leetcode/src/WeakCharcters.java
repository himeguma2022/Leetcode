public class WeakCharcters {
    private int[][] input;
    private int output;

    public static void main(String[] args) {
        int[][] demo1 = { { 5, 5 }, { 6, 3 }, { 3, 6 } };
        System.out.println("Passed: " + test(demo1, 0));
        int[][] demo2 = { { 2, 2 }, { 3, 3 } };
        System.out.println("Passed: " + test(demo2, 1));
        int[][] demo3 = { { 1, 5 }, { 10, 4 }, { 4, 3 } };
        System.out.println("Passed: " + test(demo3, 1));
        int[][] demo4 = { { 7, 7 }, { 1, 2 }, { 9, 7 }, { 7, 3 }, { 3, 10 }, { 9, 8 }, { 8, 10 }, { 4, 3 }, { 1, 5 },
                { 1, 5 } };
        System.out.println("Passed: " + test(demo4, 6));
        int[][] demo5 = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };
        System.out.println("Passed: " + test(demo5, 1));
        int[][] demo6 = { { 29, 26 }, { 92, 1 }, { 81, 64 }, { 41, 54 }, { 56, 74 }, { 76, 39 }, { 16, 69 }, { 78, 84 },
                { 65, 39 }, { 7, 2 }, { 62, 96 }, { 16, 22 }, { 47, 34 }, { 16, 22 }, { 66, 26 }, { 93, 49 },
                { 55, 16 }, { 41, 21 }, { 11, 73 }, { 17, 1 }, { 63, 81 }, { 90, 37 }, { 83, 50 }, { 7, 97 },
                { 86, 14 }, { 68, 67 }, { 65, 63 }, { 35, 32 }, { 100, 1 }, { 23, 4 }, { 17, 6 }, { 74, 52 },
                { 98, 90 }, { 4, 15 }, { 31, 36 }, { 69, 53 }, { 17, 33 }, { 80, 56 }, { 8, 100 }, { 94, 85 },
                { 89, 76 }, { 14, 76 }, { 31, 85 }, { 89, 54 }, { 73, 69 }, { 55, 7 }, { 73, 13 }, { 31, 100 },
                { 29, 55 }, { 82, 6 }, { 12, 66 }, { 17, 72 }, { 45, 50 }, { 99, 73 }, { 41, 10 }, { 89, 16 },
                { 69, 35 }, { 72, 34 }, { 85, 49 }, { 12, 5 }, { 61, 42 }, { 32, 28 }, { 10, 55 }, { 61, 19 },
                { 17, 4 }, { 48, 59 }, { 15, 44 }, { 7, 48 }, { 1, 92 }, { 68, 12 }, { 23, 6 }, { 5, 92 }, { 70, 49 },
                { 59, 3 }, { 9, 62 }, { 50, 6 }, { 75, 39 }, { 7, 79 }, { 35, 80 }, { 94, 41 }, { 25, 43 }, { 44, 16 },
                { 3, 68 }, { 87, 62 }, { 70, 62 }, { 68, 49 }, { 8, 46 }, { 16, 7 }, { 16, 60 }, { 42, 48 } };
        System.out.println("Passed: " + test(demo6, 84));
    }

    private static boolean test(int[][] demo, int i) {
        WeakCharcters testSubject = new WeakCharcters(demo);
        return testSubject.output == i;
    }

    public WeakCharcters(int[][] properties) {
        input = properties;
        output = numberOfWeakCharacters(input);
    }

    public int numberOfWeakCharacters(int[][] properties) {
        int out = 0;
        int maxAttack = 0;
        int weakDefense = 0;
        int maxDefense = 0;
        int weakAttack = 0;
        for (int i = 0; i < properties.length; ++i) {
            if (properties[i][0] > maxAttack) {
                maxAttack = properties[i][0];
                weakDefense = properties[i][1];
            }
            if (properties[i][1] > weakDefense && properties[i][0] == maxAttack) {
                weakDefense = properties[i][1];
            }
            if (properties[i][1] > maxDefense) {
                maxDefense = properties[i][1];
                weakAttack = properties[i][0];
            }
            if (properties[i][0] > weakAttack && properties[i][1] == maxDefense) {
                weakAttack = properties[i][0];
            }
        }
        for (int i = 0; i < properties.length; ++i) {
            if ((properties[i][0] < maxAttack && properties[i][1] <= weakDefense)
                    && (properties[i][1] < maxDefense && properties[i][0] < weakAttack)) {
                ++out;
            } else if (properties[i][0] < maxAttack && properties[i][1] < weakDefense) {
                ++out;
            } else if (properties[i][1] < maxDefense && properties[i][0] < weakAttack) {
                ++out;
            }
        }
        return out;
    }
}