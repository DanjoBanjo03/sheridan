package exceptionchains;

public class ExceptionChains {

   public void method1(int arg1)
   {
      this.method2(arg1 + 1);
   }

   public void method2(int arg1)
   {
      this.method3(arg1 + 1);
   }

   public void method3(int arg1)
   {
      this.method4(arg1 + 1);
   }

   public void method4(int arg1)
   {
      this.method5(arg1 + 1);
   }

   public void method5(int arg1)
   {
      System.out.println(arg1);
      //        Exception error = new Exception("Yikes, you made a mistako " + arg1);
      //        throw error;
      //what would happen if we uncomment the code above?
   }

}
