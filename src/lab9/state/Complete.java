package lab9.state;

public class Complete implements State{
    TicketMachine vendingMachine;

    public Complete(TicketMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int moneyInsert) {
        System.out.println("Invalid State");
    }

    @Override
    public void chooseDestination(String station) {
        System.out.println("Invalid State");
    }

    @Override
    public void getTicket() {
        System.out.println("This is your ticket ^_^");
        vendingMachine.setCurState(vendingMachine.getReady());
    }
}
