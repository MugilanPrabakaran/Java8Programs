package FiirstPackage;


public interface CustomFuncInterface {

    void m1();//Abstract Method

    void m5();

    default void m2(){
        System.out.println("Normal Method");
    }
    default void m3(){
        System.out.println("Normal default Method");
    }
    static void m4(){
        System.out.println("Normal Static Method");
    }

}
