class Card{
    int n;
    int s;

    public static
    Card getCard(int n, int s){
        Card c = new Card();
        c.n = n;
        c.s = s;
        return c;
    }

    public static
    Card[] getCards(int num){
        int n;
        int s;

        int[] ncards = new int[num];
        Card[] cards = new Card[num];

        for(int i = 0; i < num; i++){
            n = (int)(Math.random() * 13);
            s = (int)(Math.random() * 4);
            cards[i] = Card.getCard(n, s);
            ncards[i] = n * 4 + s;
        }

        for(int i = 0; i < num - 1; i++){
            for(int j = i + 1; j < num; j++){
                if(ncards[i] == ncards[j]){
                    return Card.getCards(num);
                }
            }
        }
        return cards;
    }

    public static
    void printCards(Card[] cards){
        for(int i = 0; i < cards.length; i++){
            String s = "";
            switch(cards[i].s){
                case 0:
                    s += "♣";
                    break;
                case 1:
                    s += "◆";
                    break;
                case 2:
                    s += "♥";
                    break;
                case 3:
                    s += "♠";
                    break;
            }
            System.out.printf("%s %d\n", s, cards[i].n + 1);
        }
    }
}