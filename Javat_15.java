public class Javat_15{
    public static void main(String [] args){
        int [][] myNumber = {{1,2,3,4,5},
        {5,6,7,8}
        };
        for (int[] row : myNumber){
            for(int i : row){
                System.out.println(i);
            }
            
        }
    }
}