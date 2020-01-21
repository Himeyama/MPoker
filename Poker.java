public class Poker{
    public static
    boolean twopair(Card card[]){
        int[] n = new int[13];
        for(int i = 0; i < card.length; i++)
            n[card[i].n] += 1;
        for(int i = 0; i < 13; i++)
            if(n[i] >= 2)
                return true;
        return false;
    }

    public static
    Card[] getCards(){
        int num = 5;
        Card cards[];
        cards = Card.getCards(num);
        return cards;
    }
}