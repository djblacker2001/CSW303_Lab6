import java.time.*;

public class LowPriorityRequest extends RequestCreator {
    @Override
    public void processRequest() {
        setPriority("Ignore");
        setStatus("Done");
        setExpireDate(LocalDate.now());
        System.out.println("Request denied.");
    }
}
