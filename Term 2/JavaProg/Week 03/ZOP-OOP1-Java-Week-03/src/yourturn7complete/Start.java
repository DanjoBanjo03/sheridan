package yourturn7complete;

public class Start {

   public static void main(String[] args)
   {
      Lion l1 = new Lion();
      Lion l2 = new Lion();
      l1.name = "Leo";
      l2.name = "Cowardly";
      l1.numLegs = 4;
      l2.makeNoise();
      l1.makeNoise();

      Student s1 = new Student();
      s1.name = "Bart";
      s1.gradePercent = 52;
      s1.studentNumber = 1;
      s1.study("Math");

      Student s2 = new Student();
      s2.name = "Lisa";
      s2.gradePercent = 92;
      s2.studentNumber = 2;
      s2.study("Conputer Science");

      Professor p1 = new Professor();
      p1.name = "Rich";
      p1.teach("Java");
   }
}
