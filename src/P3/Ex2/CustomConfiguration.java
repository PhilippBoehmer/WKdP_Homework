package P3.Ex2;

import java.util.ArrayList;

public class CustomConfiguration extends Configuration {

    public CustomConfiguration(String appName, ArrayList<String> modules, String customSetting) {
        super(appName);
    }
/*
    public void changeAppName(String newName) {
        appName = newName;
    }

    public void changeModuleList(ArrayList<String> newModules) {
        modules.clear();
        modules.addAll(newModules);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Testing custom configuration");
    }
*/
}
