package lab9.state;

public class TicketMachine {
    private State ready = new Ready(this);
    private State expending = new Expending(this);
    private State Complete = new Complete(this);
    protected State curState = ready;
    private int moneyInsert = 0;
    private int priceStation = 0;

    public void setCurState(State curState){
        this.curState = curState;
    }

    public State getReady() {
        return ready;
    }

    public State getComplete() {
        return Complete;
    }

    public State getExpending() {
        return expending;
    }

    public void setMoneyInsert(int moneyInsert) {
        this.moneyInsert = moneyInsert;
    }

    public void setPriceStation(int priceStation) {
        this.priceStation = priceStation;
    }

    public int getMoneyInsert() {
        return moneyInsert;
    }

    public int getPriceStation() {
        return priceStation;
    }

}
