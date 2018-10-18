package lab9.state;

public interface State {
    void insertCoin(int moneyInsert);
    void chooseDestination(String station);
    void getTicket();
}
