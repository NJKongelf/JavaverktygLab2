import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Arrays;
import java.util.Optional;

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

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("Lazy pencilpusher!!!");
        //System.out.println("\""+context.getParent().get().getDisplayName()+"\" Skipped!!"+reason.get().toString());
    }
}
