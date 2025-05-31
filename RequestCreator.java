import java.time.*;

public abstract class RequestCreator {
    String priority;
    String status;
    LocalDate expireDate;

    public abstract void processRequest();

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
}