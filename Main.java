public class Main{
    public static
    void main(String[] args){
        Card cards[];
        
        cards = Poker.getCards();

        // cards[0].n = 1;
        // cards[1].n = 2;
        // cards[2].n = 3;
        // cards[3].n = 4;
        // cards[4].n = 5;

        Card.printCards(cards);
        System.out.println(Poker.onepair(cards));
        System.out.println(Poker.twopair(cards));
        System.out.println(Poker.threeCards(cards));
        System.out.println(Poker.fullHouse(cards));
        System.out.println(Poker.straight(cards));
    }
}