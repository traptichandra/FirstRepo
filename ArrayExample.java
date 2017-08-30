package FirstPackage;

public class ArrayExample {
    public static void main(String[] args) {
        int[] someNum = {23, 45, 12, 15};
        int i;
        for (i = 0; i < 4; i++)
            System.out.println("The value of someNum is " + someNum[i]);
        for (i = 0; i < 4; i++)
            InsideMethod(someNum[i]);
        for (i = 0; i < 4; i++)
            System.out.println("At the end of main " + someNum[i]);
    }
        public static void InsideMethod(int temp) {
            System.out.println("Printing from the method " + temp);
            temp = 999;
        System.out.print("Printing from the method " + temp);
        }


}
