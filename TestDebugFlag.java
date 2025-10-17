public class TestDebugFlag
{

    public static void main(String args[])
    {
        //TODO: Print if Debug mode is turned on or off
        System.err.println("Debug is turned "Configs.DEBUG_MODE);
        TestDebugFlag t = TestDebugflag();
        int[] numbers = new int[4];
        for (int i=1; i<5; i++)
        {
            numbers[i] = i * 2;
            //TODO: Add debug print statement here that uses the Debug.dmode flag
        }
        printArray(numbers);
        // The expected outcome should look like 1 2 3 4
    }
    
    //You cannot change anything below this. How will you debug?
    public static void printArray(int[] numbers){
        for (int i=0; i<4; i++)
        {
            int element = numbers[i];
            System.out.print(element + " ");
        }
    }
}