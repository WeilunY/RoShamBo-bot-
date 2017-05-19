public class RoShamBoPlayerVanessa extends RoShamBoPlayer
{
    
    public RoShamBoPlayerVanessa(String name)
    {
        super(name);
    }
    
    @Override
    public String makeMove()
    {
      String a = new String();
      String b = new String();
      String c = new String(); 
      if (getMyMoves().size() < 6)
      {
        return "paper";
      }
      if (getMyMoves().size() > 5)
      {
        a = getOpponentMoves().get(getOpponentMoves().size()-1);
        b = getOpponentMoves().get(getOpponentMoves().size()-2);
        c = getOpponentMoves().get(getOpponentMoves().size()-3);
        if (a == getMyMoves().get(getMyMoves().size()-2) && b == getMyMoves().get(getMyMoves().size()-3) && 
            c == getMyMoves().get(getMyMoves().size()-4) && getMyMoves().get(getMyMoves().size()-1) == "rock")
        {
            return "paper";
        }
        if (a == getMyMoves().get(getMyMoves().size()-2) && b == getMyMoves().get(getMyMoves().size()-3) && 
            c == getMyMoves().get(getMyMoves().size()-4) && getMyMoves().get(getMyMoves().size()-1) == "paper")
        {
            return "scissors";
        }
        if (a == getMyMoves().get(getMyMoves().size()-2) && b == getMyMoves().get(getMyMoves().size()-3) && 
            c == getMyMoves().get(getMyMoves().size()-4) && getMyMoves().get(getMyMoves().size()-1) == "scissors")
        {
            return "rock";
        }
        if (a == c && a == b && a == "rock")
          return "paper";
        if (a == c && a == b && a == "paper")
          return "scissors";
        if (a == c && a == b && a == "scissors")
          return "rock";
        if (a == "rock" && b == "scissors" && c == "paper")
          return "scissors";
        if (a == "rock" && b == "paper" && c == "scissors")
          return "rock";
        if (a == "paper" && b == "scissors" && c == "rock")
          return "paper";
        if (a == "paper" && b == "rock" && c == "scissors")
          return "rock";
        if (a == "scissors" && b == "rock" && c == "paper")
          return "scissors";
        if (a == "scissors" && b == "paper" && c == "rock")
          return "paper";
    
 
       }
       return getOpponentMoves().get(getOpponentMoves().size()-1);

        
    }
   } 
