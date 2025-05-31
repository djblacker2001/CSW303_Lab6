import java.time.*;

public class HighPriorityRequest extends RequestCreator {
    @Override
    public void processRequest() {
        setPriority("Emergency");
        setStatus("Accept");
        setExpireDate(LocalDate.now());
        System.out.println("Emergency request, our Administer will contact you immediately!");
    }
}
