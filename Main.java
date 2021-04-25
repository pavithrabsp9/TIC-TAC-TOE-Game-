/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main{
static String[] board;
static String turn;
static String Check_Winner()
{
for(int a=0;a<8;a++)
{
String line=null;
switch(a)
{
case 0:
line=board[0]+board[1]+board[2];
break;
case 1:
line=board[3]+board[4]+board[5];
break;
case 2:
line=board[6]+board[7]+board[8];
break;
case 3:
line=board[0]+board[3]+board[6];
break;
case 4:
line=board[1]+board[4]+board[7];
break;
case 5:
line=board[2]+board[5]+board[8];
break;
case 6:
line=board[0]+board[4]+board[8];
break;
case 7:
line=board[2]+board[4]+board[6];
break;
}
if(line.equals("XXX"))
{
return "X";
}
else if(line.equals("000"))
{
return "0";
}
}

System.out.println(turn+"'s turn:enter slot number "+turn);
return null;
}

static void printBoard()
{
System.out.println("|---|---|---|");
System.out.println("| "+ board[0] +" | "+ board[1] +" | "+ board[2] + " | ");
System.out.println("|---|---|---|");
System.out.println("| "+ board[3] +" | "+ board[4] +" | "+ board[5] +" | ");
System.out.println("|---|---|---|");
System.out.println("| "+ board[6] +" | "+ board[7] +" | "+ board[8] +" | ");
System.out.println("|---|---|---|");
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
board=new String[9];
turn="X";
String winner=null;

for(int a=0;a<9;a++){
board[a]=String.valueOf(a+1);
}
System.out.println("3*3 Tic Tac toe");
printBoard();

System.out.println("X will play forst.Enter slot numberto place X in: ");
while(winner==null)
{
int num;
try{
num=sc.nextInt();
if(!(num>0 && num<=9)) {
System.out.println("Invalid input: re-enter slot number");
continue;
}
}
catch(InputMismatchException e)
{
System.out.println("Invalid input: re-enter slot number");
continue;
}

if(board[num-1].equals(String.valueOf(num)))  {
board[num-1]=turn;

if(turn.equals("X")) {
turn="0";
}
else{
turn="X";
}
printBoard();
winner=Check_Winner();
}
else{
System.out.println("Slot already taken: re-enter slot number");
}
}

if(winner.equalsIgnoreCase("draw"))
{
System.out.println("It's a draw!");
}
else {
System.out.println("Congratulations! " +winner+ " 's have won!Thanks for playing.");
}
}
}






