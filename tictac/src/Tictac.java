import game.*;
import ai.*;
import player.*;
import gui.*;
import java.util.Random;
import java.util.Scanner;
public class Tictac {
     public static void main(String[] args) {
          //test();
          Gui g=new Gui();
     }
     public static void test(){
          try{
          boolean b=true;
          Scanner sc=new Scanner(System.in);
          GameData g=new GameData();
          Ai a=new Ai(g,eboard._O);
          Player p=new Player("player",g,eboard._X);
          for(;g.check()==eboard._N;){
               if(b){
                    System.out.println(p.name+"'s move..");
                    p.move(sc.nextInt());
               }else{ 
                    System.out.println(a.name+"'s move..");
                    a.move();
               }System.out.println(g.display());
               b=!b;
          }
          System.out.println(g.getplayer(g.check())+" win..");
          }catch(NoMoveException e){System.out.println(e);}
          catch(Exception e1){System.out.println("error");}
     }
}
