public class Main {
    public static void main(String[] args) {
        RequestCreator low = new LowPriorityRequest();
        low.processRequest();

        RequestCreator medium = new MediumPriorityRequest();
        medium.processRequest();

        RequestCreator high = new HighPriorityRequest();
        high.processRequest();
    }
}
