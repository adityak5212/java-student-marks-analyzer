public class KL{
    public static void main(String[] args) {
       int[] number = {10,25,7,40,18};
       int TotalMarks = 0;
       int HighestMarks = number[0];
       int lowestMarks = number[0];
       for(int i = 0; i < number.length; i++){
        TotalMarks = TotalMarks + number[i];
        if(number[i] > HighestMarks){
            HighestMarks = number[i];
        }
        if(number[i] < lowestMarks){
            lowestMarks = number[i];
        }
       }
       double averageMarks = (double) TotalMarks/number.length;
       System.out.println("Total marks" + TotalMarks);
       System.out.println("Highest marks" + HighestMarks);
       System.out.println("Lowest marks " + lowestMarks);
       System.out.println("average marks " + averageMarks);
    }
}
