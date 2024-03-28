public class CustomerManager {
    //müşteri eklendiği anda ben log kayıtıda almak istediğimi düşünelim.
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        baseLogger.log("Loglandı");
    }
}
