/******************************************************************************
Still working on a solution
 
 ******************************************************************************/
import java.util.*;
public class RiverProblem {
  LinkedList<Item> left;
  LinkedList<Item> right;
  Item prev;
  final LinkedList<Item> goal = new LinkedList<Item>(Arrays.asList(Item.WOLF,Item.CHICKEN,Item.GRAIN));
  boolean leftSide;
   public enum Item {
 FARMER, WOLF, CHICKEN, GRAIN
 }
   public RiverProblem(LinkedList<Item> left, LinkedList<Item> right) {
     this.left=left;
     this.right= right;
   }
   
   public String toString(){
     String s = "";
     s = left.toString() + " | " + right.toString();
     return s;
   }
   
   public void setLeft(LinkedList<Item> newLeft){
     this.left = newLeft;
   }    
   public void setRight(LinkedList<Item> newRight){
     this.right = newRight;
   }
   
   public LinkedList<Item> getLeft(){
     return left;
   }
   
    public LinkedList<Item> getRight(){
     return right;
   }
   public boolean isValid(){
     
     LinkedList<Item> checking = new LinkedList<Item>();
     if (leftSide){
       checking = left;
     }  
     else {
       checking= right;
     }
    return (checking.contains(Item.WOLF) && checking.contains(Item.CHICKEN)) || 
      (checking.contains(Item.CHICKEN) && checking.contains(Item.GRAIN));
   }
   
 

   //FWCG
    public static void main(String[] args) {

      
      
      
        System.out.println(Item.FARMER);
        LinkedList<Item> right = new LinkedList<Item>();
         LinkedList<Item> left = new LinkedList<Item>();
         LinkedList<RiverProblem> solution = new LinkedList<RiverProblem>();    
        RiverProblem test = new RiverProblem(left, right);
        right.add(Item.FARMER);
        right.add(Item.WOLF);
              System.out.println(right);
        System.out.println(right.contains(Item.CHICKEN));
        
        left.add(Item.CHICKEN);
        System.out.println(test);
        
    }

}
