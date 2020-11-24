class CreateInstance {

    public static SuperClass create() {

        return new SuperClass() {
            @Override
            public void method3() {
                System.out.println("method3");
            }

            @Override
            public void method2() {
                System.out.println("method2");
            }
        };
    }
}

// Don't change the code below

abstract class SuperClass {

    public static void method1() {
        System.out.println("");
    }

    public abstract void method2();

    public abstract void method3();
}