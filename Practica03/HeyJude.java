import javax.lang.model.util.ElementScanner6;

public class HeyJude{
 static   String HEY = "Hey Jude ";
 static   String DON = "don't ";
 static   String MAK = "make it bad.";
 static   String BEA = "be afraid.";
 static   String LET = "let me down.";
 static   String TAK = "Take a sad song and make it better.";
 static   String YOW = "You were made to go out and get her.";
 static   String YOH = "You have found her, now go and get her.";
 static   String REM = "Remember to ";
 static   String LEH = "let her into you heart.";
 static   String LES = "let her into your skin.";
 static   String THE = "Then you ";
 static   String CAN = "can start ";
 static   String BEG = "begin ";
 static   String TOM = "to make it better ";
 static   String BET = "better ";
 static   String WA  = "waaaaa";
 static   String NA  = "na ";

    String AND = "And anytime you feel the pain, hey Jude, refrain,\n"
	                            + "Don’t carry the world upon your shoulders.\n"
                                    + "For well you know that it’s a fool who plays it cool\n"
	                            + "By making his world a little colder.";

    String SOL = "So let it out and let it in, hey Jude, begin,\n"
	                            + "You’re waiting for someone to perform with.\n"
	                            + "And don’t you know that it’s just you, hey jude, you’ll do,\n"
	                            + "The movement you need is on your shoulder.";

    public static void main(String[] args){
        int dont=1;
        int w=0;
        int b=0;
        int h=0;
        int j=0;
        for(int i=0; i<13; i++)
        {
            System.out.print("\n" + HEY);
            System.out.print("\n");
            System.out.print(DON);
            if(dont<4)
            {
                switch (dont)
                {
                case 1:
                System.out.print(MAK + TAK);
                System.out.print(TAK);
                dont=2;
                break;
                case 2:
                System.out.print(BEA + YOW);
                dont=3;
                break;
                case 3:
                System.out.print(LET + YOH);
                dont=1;
                break;
                }
            }
            System.out.print(REM);
            if(h==0)
            {
             System.out.print(LEH);
             h=1;
            }
            else
            {
                System.out.print(LES);
                h=0;
            }
            System.out.print(THE);
            if(j==0)
            {
             System.out.print(CAN);
             j=1;
            }
            else
            {
                System.out.print(BEG);
                j=0;
            }
            System.out.print(TOM);
            while(b<=5)
            {
            System.out.print(BET);
            b++;
            }
            b=0;
            System.out.print(WA);
            while(w<=5)
            {
                System.out.print(NA);
                w++;
            }
            w=0;
    }   
    }
}