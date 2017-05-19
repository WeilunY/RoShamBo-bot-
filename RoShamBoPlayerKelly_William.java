 import java.util.List;

public class RoShamBoPlayerKelly_William extends RoShamBoPlayer
{
  // know the size of previous moves
    private List<String> me; 
    private List<String> other;
    private int size;
    String[] move = {"rock", "paper", "scissors"};
   
        
  public RoShamBoPlayerKelly_William (String name)
    {
        super(name);
    }
    
    @Override
  public String makeMove()
    {
       size = getMyMoves().size() - 1;
       me = getMyMoves();
       other = getOpponentMoves();
      
      //play random when size is smaller than 3
      if(size > 2 )
      {
        // No Pattern Scenario
        if(!pattern(other.get(size - 1), other.get(size), other.get(size-2)))
        {
          //draw with no pattern --> return random
          if(win(size) == 0)
          {
            int rnd = (int) (Math.random()*3);
            return move[rnd];
          }
        
       // win with no pattern --> return the move that beat myself
          if(win(size) == 1)
          {
            if(me.get(size).equals("rock"))
               return "paper";
            if(me.get(size).equals("paper"))
               return "scissors";
            else
               return "rock";
          }
        //lose with no pattern --> return others move
          else
          {
            return other.get(size-1);
          }
        }
        
        //Pattern Scenario
        else{
     
          if(other.get(size).equals("rock"))
              return "paper";
          
          if(other.get(size).equals("paper"))
              return "scissors";
          
          else
              return "rock";
          
             }
          
          } 
      
      // when size < 3 --> return random move
      else
      {
       int rnd = (int) (Math.random()*3);
       return move[rnd];
      }
     
     }    
    
    
  public int win(int num)
    {
      // 0 for tie, 1 for win, 2 for lose
      //tie:
      if(me.get(num).equals(other.get(num)))
        return 0;
      //win:
      else if(me.get(num).equals("rock") && other.get(num).equals("scissors")
           || me.get(num).equals("scissors") && other.get(num).equals("paper")
           || me.get(num).equals("paper") && other.get(num).equals("rock"))
        return 1;
      //lose:
      //if(other.get(num).equals("rock") && me.get(num).equals("scissors")
           //|| other.get(num).equals("scissors") && me.get(num).equals("paper")
           //|| other.get(num).equals("paper") && me.get(num).equals("rock"))
      else      
        return 2;
      
    }
  
  //checking the pattern
  public boolean pattern(String a, String b, String c)
  {
    return a.equals(b) && b.equals(c);
  }
      
}