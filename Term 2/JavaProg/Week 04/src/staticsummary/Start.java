package staticsummary;

public class Start {
    public static void main(String[] args)
    {

        SomeObject.infoSharedByAllObjects = 1000;
        SomeObject.method2();

        SomeObject object = new SomeObject();
        object.importantInfoForEachObject = 42;
        // System.out.println(object);
        // System.out.println(object.importantInfoForEachObject);

        SomeObject object2 = new SomeObject();
        object2.importantInfoForEachObject = 99;

        // object.method1();
        // object2.method1();

        // System.out.println(SomeObject.infoSharedByAllObjects);

    }
}
