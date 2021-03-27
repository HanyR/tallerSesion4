package factoryDevice;

public class FactoryDevices {
    public static final String ANDROID="android";
    public static final String IOS="ios";
    public static final String WINDOWSPHONE="windowsphone";
    public static final String CLOUD_DEVICE = "cloud";

    public static IDevice make(String type){
        IDevice device;

        switch (type){
            case "android":
                device = new Android();
                break;

            case "ios":
                device = new IOS();
                break;
            case "windowsphone":
                device= new WindowsPhone();
                break;
            case CLOUD_DEVICE:
                device= new CloudDevice();
                break;
            default:
                device= new Android();
                break;
        }
        return device;

    }

}
