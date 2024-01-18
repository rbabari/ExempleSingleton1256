public class Singleton implements MonInterface, MonInterface2{
    private static Singleton instance = null;
    private Singleton()
    {

    }
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
    @Override
    public void faireQQchode() {
    }

    @Override
    public void faireAutreChose() {

    }
}
