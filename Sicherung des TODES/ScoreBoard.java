import greenfoot.*;
public class ScoreBoard extends Actor
{
Ziffer[] Zif=new Ziffer[5];
int Score=0;
int Z1,Z2,Z3,Z4;
public void addedToWorld(World w)
{
Zif[1]=new Ziffer();
Zif[1].setImage("0.JPG");
w.addObject(Zif[1],280,550);
Zif[2]=new Ziffer();
Zif[2].setImage("0.JPG");
w.addObject(Zif[2],350,550);
Zif[3]=new Ziffer();
Zif[3].setImage("0.JPG");
w.addObject(Zif[3],420,550);
Zif[4]=new Ziffer();
Zif[4].setImage("0.JPG");
w.addObject(Zif[4],490,550);
} // addedToWorld
public void scoren(int p)
{
Score+=p;
if(Score<0)
    Score=0;
anzeigen();
} // scoren
private void anzeigen()
{
ZiffernBerechnen();
Zif[1].setImage(""+Z1+".JPG");
Zif[2].setImage(""+Z2+".JPG");
Zif[3].setImage(""+Z3+".JPG");
Zif[4].setImage(""+Z4+".JPG");
} // anzeigen
private void ZiffernBerechnen()
{
int s=Score;
Z4=s%10;
s=s/10;
Z3=s%10;
s=s/10;
Z2=s%10;
s=s/10;
Z1=s%10;   
} // ZiffernBerechnen
} // class ScoreBoard