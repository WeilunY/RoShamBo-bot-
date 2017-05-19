import java.util.*;

public class RoShamBoPlayerJessica extends RoShamBoPlayer
{

    public RoShamBoPlayerJessica(String name)
    {
        super(name);
    }

    public String makeMove()
    {
        int rocks = 0, scissors = 0, paper = 0;

        List<String> moves = getOpponentMoves();
        for (String move : moves)
        { 
            if (move.equals("rock")) 
                rocks++;
            else if (move.equals("scissors"))
                scissors++;
            else
                paper++;
        }
        int diff= Math.max(Math.abs(rocks-paper), Math.max(Math.abs(paper-scissors), Math.abs(scissors-rocks)));
        if (diff>3)
        {
            if (rocks >= scissors && rocks >= paper)
                return "paper";
            else if (scissors >= paper && scissors >= rocks)
                return "rock"; 
            else return "scissors";

        }
        else
        {
            int size = getOpponentMoves().size();
            if (size == 0)
                return "rock";
            else if (getOpponentMoves().get(size-1) == "rock")
                return "paper";
            else if (getOpponentMoves().get(size-1) == "paper")
                return "scissors";
            else return "rock";
        }
    }

    
}