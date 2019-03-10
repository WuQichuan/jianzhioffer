package code_01_singleton;

public class Singleton1 {
    private static Singleton1 innstance = null;
    public Singleton1 getInstance(){
        if(innstance == null){
            synchronized (this){
                if(innstance == null){
                    innstance = new Singleton1();
                }
            }
        }
        return innstance;
    }
}
