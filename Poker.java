class Poker{
    public static
    boolean onepair(Card cards[]){
        int[] n = new int[13];
        for(int i = 0; i < cards.length; i++)
            n[cards[i].n] += 1;
        for(int i = 0; i < 13; i++)
            if(n[i] >= 2)
                return true;
        return false;
    }

    public static
    boolean twopair(Card cards[]){
        int[] n = new int[13];
        boolean flag = false;
        for(int i = 0; i < cards.length; i++)
            n[cards[i].n] += 1;
        for(int i = 0; i < 13; i++)
            if(n[i] >= 2){
                if(flag) return true;
                flag = true;
            }
        return false;
    }

    public static
    boolean threeCards(Card cards[]){
        int[] n = new int[13];
        for(int i = 0; i < cards.length; i++)
            n[cards[i].n] += 1;
        for(int i = 0; i < 13; i++)
            if(n[i] >= 3)
                return true;
        return false;
    }

    public static
    boolean fullHouse(Card cards[]){
        int[] n = new int[13];
        boolean flag1 = false;
        boolean flag2 = false;
        for(int i = 0; i < cards.length; i++)
            n[cards[i].n] += 1;
        for(int i = 0; i < 13; i++){
            if(n[i] == 2) flag1 = true;
            if(n[i] == 3) flag2 = true;
            if(flag1 && flag2) return true;
        }
        return false;
    }

    public static
    boolean straight(Card[] cards){
        int[] n = new int[13];
        int i, j;
        for(i = 0; i < cards.length; i++)
            n[cards[i].n] += 1;
        for(i = 0; i < 13; i++)
            if(n[i] == 1) break;
        if(n[i] == 1){
            for(j = 1; j < 5; j++)
                if(n[i + j] != 1) return false;
            return true;
        }
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