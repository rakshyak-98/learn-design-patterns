package singleton;

public class Singleton {
   private static Singleton uniqSingleton = null;
   private Singleton(){} 

   public static Singleton getInstance() {
    if(uniqSingleton == null) {
        return new Singleton();
    }
    return Singleton.uniqSingleton;
   }
}
