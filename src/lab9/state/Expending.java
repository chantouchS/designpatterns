package lab9.state;

public class Expending implements State {
    TicketMachine vendingMachine;

    public Expending(TicketMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int moneyInsert) {
        int money = vendingMachine.getMoneyInsert() + moneyInsert;
        if(money >= vendingMachine.getPriceStation()){
            money -= vendingMachine.getPriceStation();
            if(money > vendingMachine.getPriceStation()){
                System.out.println("Balance: " + money);
            }
            else{
                System.out.println("Thank you, please get your ticket");
            }
            vendingMachine.setMoneyInsert(0);
            vendingMachine.setPriceStation(0);
            vendingMachine.setCurState(vendingMachine.getComplete());
        }
    }

    @Override
    public void chooseDestination(String station) {
        System.out.println("Invalid State");
    }

    @Override
    public void getTicket() {
        System.out.println("Invalid State");
    }
}
