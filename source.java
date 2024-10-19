import java.util.*;
class prog
{ String name,style,fav,weak,optional,challenge,afternoon,studytime; int type,board,stream,grade;
 prog()
 {
    name=" ";
    style=" ";
    fav=" ";
    weak=" ";
    optional=" ";
    type=0;
    board=0;
    stream=0;
    challenge=" ";
    afternoon=" ";
    studytime=" ";
    grade=0;
 }
 int getinfo()
 { Scanner ob = new Scanner(System.in);
   int n = ob.nextLine();
   name=n;
   int ch=ob.nextInt(); grade=ch;
   switch(grade)
   { 
             case 8: board=whichBoard();
             break; 
             case 9: //System.out.println("which board do you study in?");
             board=whichBoard();
             break;
             case 10:// System.out.println("which board do you study in? ");
             board=whichBoard();
             break; 
        }
     }
         int whichBoard(int n)
         { 
           //System.out.println("enter '1' for icse, enter '2' cbse");
            if(n==1)
            { //System.out.println("what are your favourite subjects?");
              fav=icseFav();
              //System.out.println("what are your weak subjects?");
              weak=icseWeak();
            }
            else
           { //System.out.println("what are your favourite subjects?");
            fav=cbseFav();
            //System.out.println("what are your weak subjects?");
            weak=cbseWeak();
           }
         }  
         String icseFav()
         { Scanner ob = new Scanner(System.in);
           String n=ob.nextLine(); 
           return n;
         }
        String icseWeak()
        { Scanner ob= new scanner(System.in);
        String n=ob.nextLine();
        return n;
        }
        String cbseFav()
        {
            Scanner ob = new Scanner(System.in);
            String n=ob.nextInt();
            return n;
        }
        String cbseWeak()
        {
            Scanner ob= new Scanner(system.in);
            String n = ob.nextLine();
            return n;
        } 
         int stream()
          {  if(grade==8)
            {  stream = icseStream();
            }
            else if(grade==9);
            {
            stream= icseStream();
            }
            else if(grade==10 && board==1)
            {
                stream= icseStream();
            } 
            else if(grade==10 && board==2) 
            { 
                stream= cbseStream();
            }
         }
         int icseStream()
         {
            Scanner ob = new Scanner(system.in);
            int n = ob.nextInt();
         }
         int cbseStream()
         {
            Scanner ob =new Scanner(System.in);
            int n= ob.nextInt();
         } 
         String optionalSub()
         { Scanner ob = new Scanner(System.in);
         String n=ob.nextLine();
         optional = n;
         }
         String style()
         { 
            Scanner ob = new scanner(system.in);
            String n= ob.nextLine(); 
            style=n;
         }
         String examPrepration()
         { Scanner ob = new Scanner(System.in);
              String n= ob.nextLine(); 
              type=n;
         }
          String time()
          {
            Scanner ob= new Scanner(System.in_);
            String n=ob.nextLine();
            studytime=n;
          }
          String challenge()
          {
            Scanner ob = new Scanner(System.in);
            String n= ob.nextLine();
            challenge=n;
          }
          String sleepyAfternoon()
          { 
            Scanner ob = new Scanner(System.in);
            String n= ob.nextLine();
            afternoon=b;
          } 
          void career()
          { 
            if(stream=="PCM" && optional == "Computer")
             { System.out.println("career from PCMC");
               System.out.println("software engineer" + /n + "data scientist" + /n + "machine learning engineer" + /n + "aeronautical engineer" +/n+ "many more");
              }
               else if(stream =="PCB" && optional == "Computer")
               { System.out.println("career from PCBC");
                 System.out.println("AI specialist" +/n+"biotechnology"+/n+"electrical engineering"+/n+"environment scientist"+/n+"cloud computing"+/n+"many more");
               }
               else if(stream == "Arts" && optional=="Psychology")
               { System.out.println("career from arts and psychology");
                 System.out.println("psychologist"+/n+"forensic psychology"+/n+"educational psychologist"+/n+"advanced diploma in counseling"+/n+"psychology counsellor"+/n+"many more");
               }
               else if (stream == "Arts" && optional=="Fashion Designing")
              { System.out.println("careers from art and fashion designing");
                System.out.println("fashion designer"+/n+"fashion writer"+/n+"fashion consultant"+/n+"textile designer"+/n+"fashion illustrator"+/n+"trend analyst"+/n+"many more");
              }
          }
          void studytips()
          { System.out.println("some study tips");
          System.out.println("try medicating"+/n+"after studing the subject you dont like try studing the subject you like for a few minutes after"+/n+"have constant breaks in your study session"+/n+"if you dont feel like studing don't waste your time instead study the subject which you like"+/n+"higher study shows that taking an afternoon naps helps improve concentration"+/n+"you can listen to music while practicing maths");
          }
          public static void main()
          {
            prog obj=new prog();
            obj.getinfo();
            obj.icseFav();
            obj.icseWeak();
            obj.cbseFav();
            obj.cbseWeak();
            obj.stream();
            obj.optionalSub();
            obj.style();
            obj.examPrepration();
            obj.time();
            obj.challenge();
            obj.sleepyAfternoon();
            obj.career();
            obj.studytips();
          }
    }
}

      
       
           
       