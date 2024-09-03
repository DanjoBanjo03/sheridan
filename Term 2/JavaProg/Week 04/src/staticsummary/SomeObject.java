package staticsummary;

public class SomeObject {

    public int importantInfoForEachObject; //set to 42
    public static int infoSharedByAllObjects;

    public void method1()
    {
        System.out.println(importantInfoForEachObject);
        System.out.println(infoSharedByAllObjects);
    }

    public static void method2()
    {
        System.out.println("YaY! I'm in the static method");
        System.out.println(infoSharedByAllObjects);
        System.out.println(importantInfoForEachObject);
    }

}
