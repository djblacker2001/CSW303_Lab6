import java.time.LocalDate;

public class MediumPriorityRequest extends RequestCreator {
    @Override
    public void processRequest() {
        setPriority("Medium");
        setStatus("Accepted");
        LocalDate expire = LocalDate.now().plusMonths(0);
        setExpireDate(expire);

        System.out.println("Request accepted, estimated completion date is " + expire);
    }   
}
