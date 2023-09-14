import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your Math grade?: ");
        String math = in.next();
        System.out.print("What is your Science grade?: ");
        String science = in.next();
        System.out.print("What is your English grade?: ");
        String english = in.next();
        System.out.print("What is your History grade?: ");
        String history = in.next();
        System.out.print("What is your 1st elective grade?: ");
        String Elec1 = in.next();
        System.out.print("What is your 2nd elective grade?: ");
        String Elec2 = in.next();
        System.out.print("What is your 3rd elective grade?: ");
        String Elec3 = in.next();
        int mathInt = Integer.parseInt(math);
        int sciInt = Integer.parseInt(science);
        int engInt = Integer.parseInt(english);
        int hisInt = Integer.parseInt(history);
        int E1Int = Integer.parseInt(Elec1);
        int E2Int = Integer.parseInt(Elec2);
        int E3Int = Integer.parseInt(Elec3);

        int math4 = 0;
         int sci4 = 0;
         int eng4 = 0;
        int his4 = 0;
         int math3 = 0;
        int sci3 = 0;
         int eng3 = 0;
        int his3 = 0;
         int math2 = 0;
        int sci2 = 0;
         int eng2 = 0;
        int his2 = 0;
         int E14 = 0; 
        int E24 = 0;
        int E34 = 0;
         int E13 = 0; 
        int E23 = 0;
        int E33 = 0;
         int E12 = 0; 
        int E22 = 0;
        int E32 = 0;

        // Grades

        if (mathInt >= 90 && mathInt <= 100) {
            math4 = 4;
        } else {
            math4 = 0;
        }
        if (sciInt >= 90 && sciInt <= 100) {
            sci4 = 4;
        } else {
            sci4 = 0;
        }
        if (engInt >= 90 && engInt <= 100) {
            eng4 = 4;
        } else {
            eng4 = 0;
        }
        if (hisInt >= 90 && hisInt <= 100) {
            his4 = 4;
        } else {
            his4 = 0;
        }
         if (E1Int >= 90 && E1Int <= 100) {
            E14 = 4;
        } else {
            E14 = 0;
        }
         if (E2Int >= 90 && E2Int <= 100) {
            E24 = 4;
        } else {
            E24 = 0;
        }
        if (E3Int >= 90 && E3Int <= 100) {
            E34 = 4;
        } else {
            E34 = 0;
        }

      // 4 points per grade / grade A

        if (mathInt >= 80 && mathInt <= 89) {
            math3 = 2;
        } else {
            math3 = 0;
        }
        if (sciInt >= 80 && sciInt <= 89) {
            sci3 = 2;
        } else {
            sci3 = 0;
        }
        if (engInt >= 80 && engInt <= 89) {
            eng3 = 2;
        } else {
            eng3 = 0;
        }
        if (hisInt >= 80 && hisInt <= 89) {
            his3 = 2;
        } else {
            his3 = 0;
        }
         if (E1Int >= 80 && E1Int <= 89) {
            E13 = 2;
        } else {
            E13 = 0;
        }
         if (E2Int >= 80 && E2Int <= 89) {
            E23 = 2;
        } else {
            E23 = 0;
        }
        if (E3Int >= 80 && E3Int <= 89) {
            E33 = 2;
        } else {
            E33 = 0;
        }

      // 3 points per grade / grade B

        if (mathInt >= 70 && mathInt <= 79) {
            math2 = 2;
        } else {
            math2 = 0;
        }
        if (sciInt >= 70 && sciInt <= 79) {
            sci2 = 2;
        } else {
            sci2 = 0;
        }
        if (engInt >= 70 && engInt <= 79) {
            eng2 = 2;
        } else {
            eng2 = 0;
        }
        if (hisInt >= 70 && hisInt <= 79) {
            his2 = 2;
        } else {
            his2 = 0;
        }
         if (E1Int >= 70 && E1Int <= 79) {
            E12 = 2;
        } else {
            E12 = 0;
        }
         if (E2Int >= 70 && E2Int <= 79) {
            E22 = 2;
        } else {
            E22 = 0;
        }
        if (E3Int >= 70 && E3Int <= 79) {
            E32 = 2;
        } else {
            E32 = 0;
        }

      // 2 points per grade / grade C

      int mathTotal = (math4 + math3 + math2);
      int sciTotal = (sci4 + sci3 + sci2);
      int engTotal = (eng4 + eng3 + eng2);
      int hisTotal = (his4 + his3 + his2);
      int E1Total = (E14 + E13 + E12);
      int E2Total = (E24 + E23 + E22);
      int E3Total = (E34 + E33 + E32);

      // total points per grade / A + B + C

      int totalPoints = (mathTotal + sciTotal + engTotal + hisTotal + E1Total + E2Total + E3Total);
      double GPA = (totalPoints / 7);
      System.out.print(GPA);

    }
}