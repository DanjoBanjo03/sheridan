package trycatch;

public class Start {

    public static void main(String[] args)
    {
        LearnExceptions obj1 = new LearnExceptions();
        String record = obj1.riskyMethodCallingADatabase(); //hmmm..what if this method throws an Exception?  We need to protect this call!

        System.out.println(record);

        //make sure you understand the flow of control within the try, the catch, and after the catch runs
    }
}
