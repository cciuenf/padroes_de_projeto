public class Singleton
{
    private static Singleton instance;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}


class Peca 
{
    private static List<Peca> pecas;

    static 
    {
        pecas = new ArrayList<Peca>();
       // cria as 28 pecas  ...
    }

    private Peca() {}
 
    public static Peca proxima()
    {
        if (pecas.isEmpty())
            return null;
        Peca peca = pecas.get(random(pecas.size()));
        pecas.remove(peca);
        return peca;
    }
}
