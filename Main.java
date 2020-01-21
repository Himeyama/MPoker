public class Main{
    public static
    void main(String[] args){
        Card cards[];
        
        cards = Poker.getCards();
        
        Card.printCards(cards);
        System.out.println(Poker.twopair(cards));
    }
}