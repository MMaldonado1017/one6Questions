public class methods {
    //Q1
    public static int getLastIndex(String[]names){
        return names.length-1;
    }
    //Q2
    public static int getSecondToLastIndex(String[]names){
        return names.length-2;
    }
    //Q3
    public static String getFirstElement(String[]names){
        return names[0];
    }
    //Q4
    public static String getLastElement(String[]names){
        return names[names.length-1];
    }
    //Q5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length-2];
    }
    //Q6
    public static int getSum(int[] ints) {
        int sum = 0;
        for(int m = 0; m < ints.length; m++) {
            sum = sum + ints[m];
        }
        return sum;
    }
    //Q7
    public static int getAverages(int[]ints){
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        double averages  = (double) sum / ints.length;
        return (int) averages;

    }








    public static void main(String[] args) {
        String[] names= {"Moe","Money","Dame","Dolla"};
        System.out.println(getLastIndex(names)) ;
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println( getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        int[] ints= {10,17,11,9};
        System.out.println("The sum of the array is " + getSum(ints));
        System.out.println("The average of the array is " + getAverages(ints));


    }

}










