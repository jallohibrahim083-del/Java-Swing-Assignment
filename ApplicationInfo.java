public class ApplicationInfo {

    protected String welcomeMessage;

    public ApplicationInfo(String name) {
        welcomeMessage =
                "Welcome to Java Swing First Individual Assignment by " + name;
    }

    public static void main(String[] args) {
        ApplicationInfo info = new ApplicationInfo("Ibrahim Sorie Jalloh");
        System.out.println(info.welcomeMessage);
    }
}