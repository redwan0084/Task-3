package redowan;

public class Cricket extends Sports{
    String matchType;
    int over;

    Player player ;

    Cricket(String matchType,int over,Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player=player;
    }

    void display()
    {
        System.out.println("The Match Type is :"+matchType);
        System.out.println("The Over is :"+over);
        System.out.println("Name of the Player is :"+player.playerName);
        System.out.println("The Jersey Number  is :"+player.jerseyNumber);

    }
}
