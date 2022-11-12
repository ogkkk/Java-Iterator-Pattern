package kz.narxoz.patterns.iterator.threeiterators;

class SumOfArray {
    static int arr[] = { 69, -45, 24, 103 };

    static int sum()
    {
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                + sum());
    }
}