package examples.aaronhoskins.com.javabasics.DesignPatterns;

public class Singleton {
    private static Singleton singletonInstance;
    private String id;
    private String value;

    /**
     *
     * @param id ID of the calling class
     * @return the instance of the singleton class
     */
    public static synchronized Singleton getInstance(String id) {
        if(singletonInstance == null) {
            singletonInstance = new Singleton(id);
        }
        return singletonInstance;
    }

    private Singleton(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }
}
