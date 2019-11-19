
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;


public class TestOkOrNot implements TestWatcher {
    @Override

    public void testSuccessful(ExtensionContext context) {
        System.out.println("All test passed");
        System.out.println(context.getParent().get().getDisplayName());
    }

    @Override

    public void testFailed(ExtensionContext context, Throwable cause) {
        System.out.println("Dumb ass!!!");
        System.out.println("\""+context.getParent().get().getDisplayName()+"\" Failed since you write bad code!!");
    }

}
