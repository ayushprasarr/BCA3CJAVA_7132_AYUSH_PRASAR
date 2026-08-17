/* WRITE A JAVA PROGRAM FOR 2D ARRAY. */

class U1P11_2
{
    public static void main(String args[])
    {
        int arr[][] =
        {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("ARRAY ELEMENTS:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}