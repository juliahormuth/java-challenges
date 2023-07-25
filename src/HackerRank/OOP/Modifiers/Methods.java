package HackerRank.OOP.Modifiers;

public class Methods {
    public String publicMethod () {
        return "This method can be called in the whole project";
    }

    private String privateMethod () {
        return "This method can be called just into its class";
    }

    String defaultMethod () {
        return "This method can be called just in the same package";
    }

    protected String protectedtMethod () {
        return "This method can be called just in the same package and for children classes";
    }
}
