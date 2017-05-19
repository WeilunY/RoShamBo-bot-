

import java.util.*;

class RoShamBoPlayerJoshua extends RoShamBoPlayer
{
    public RoShamBoPlayerJoshua(String name)
    {
        super(name);
    }
    
    @Override
    public String makeMove()
    {
      
        int win = 0; int lose = 0; int tie = 0;      
        int rocks = 0, scissors = 0, paper = 0;
        int size = getOpponentMoves().size();
        
        List<String> moves = getOpponentMoves();
        List<String> myMoves = getMyMoves();
        for (int i = 0; i < size; i++)
        {
          if(moves.get(i).equals(myMoves.get(i)))
            tie++;
          else if (moves.get(i).equals("rock") && myMoves.get(i).equals("scissors"))
            lose++;
          else if (moves.get(i).equals("paper") && myMoves.get(i).equals("rock"))
            lose++;
          else if (moves.get(i).equals("scissors") && myMoves.get(i).equals("paper"))
            lose++;
          else
            win++;
        }
        
       if (lose > 990) 
          return getOpponentMoves().get(size-25);
       else if (tie > 990)
          return getOpponentMoves().get(size-26);
//        
     
        
        for (String move : moves)
        {   
            if (move.equals("rock")) 
               rocks++;
            else if (move.equals("scissors"))
               scissors++;
            else
                paper++;
        }
        if (rocks > 0 && scissors > 0 && paper > 0) {
          if (rocks / scissors > 3 && rocks / paper > 3){
            myMoves.add("paper");
            return "paper";
          }
          else if (scissors / paper > 3 && scissors / rocks > 3){
            myMoves.add("rock");
            return "rock";
          }
          else if (paper / scissors > 3 && paper / rocks > 3){
            myMoves.add("scissors");
            return "scissors";
          }
        }
        
         if (rocks > 0 && scissors > 0) {
           if (rocks / scissors > 3){
             myMoves.add("paper");
             return "paper";
           }
           else if (scissors / rocks > 3){
             myMoves.add("rock");
             return "rock";
           }
        }
         
        if (paper > 0 && scissors > 0) {
          if (paper / scissors > 3)
            return "paper";
          else if (scissors / paper > 3)
            return "rock";
        }
        
        if (rocks > 0 && paper > 0) {
          if (paper / rocks > 3) {
            myMoves.add("paper");
            return "paper";
          }
          else if (rocks / paper > 3) {
            myMoves.add("rock");
            return "rock";
          }
        }
        
        if (rocks >= scissors && rocks >= paper){
          myMoves.add("paper");  
          return "paper";
        }
        else if (scissors >= paper && scissors >= rocks) {
          myMoves.add("rock");  
          return "rock";
        }
        else{
          myMoves.add("scissors");
          return "scissors";
        }
//        if (size > 0)
//          return getOpponentMoves().get(size-1);
//        else
//          return "paper";
        }
}


    
    
         
    
    
    
    