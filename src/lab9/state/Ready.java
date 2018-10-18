package lab9.state;

import java.util.Map;
import java.util.TreeMap;

public class Ready implements State{
    Map<String,Integer> destinationPrice = new TreeMap<>();
    private int price;
    TicketMachine vendingMachine;

    public Ready(TicketMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationPrice.put("Siam",30);
        destinationPrice.put("Chitlom",40);
        destinationPrice.put("VictoryMonument",50);
    }

    @Override
    public void insertCoin(int moneyInsert) {
        System.out.println("Invalid State");
    }

    @Override
    public void chooseDestination(String station) {
        if(!destinationPrice.containsKey(station)){
            price = destinationPrice.get(station);
            System.out.println("Select Station: " + station + ", " +"cost: " + price);
            vendingMachine.setCurState(vendingMachine.getExpending());
        }
        else {
            System.out.println("Invalid Station");
        }
    }

    @Override
    public void getTicket() {
        System.out.println("Invalid State");
    }
}
