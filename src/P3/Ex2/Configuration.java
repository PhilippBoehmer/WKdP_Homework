package P3.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
    final String appName;
    final ArrayList<String> modules;

    public Configuration(String appName) {
        this.appName = appName;
        this.modules = new ArrayList<>();
    }
    final void describe(){
        System.out.println("App Name: " + appName);
        System.out.println("Modules: " + modules);
    }
}
