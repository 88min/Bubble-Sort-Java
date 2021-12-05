package bubblesort;
/**
 * Bubble sort their ages
 * @author 88min
 */
public class Bubblesort {

   public static void main(String[] args) {
        String [][] alldata  = {{"Jennie","1996"},{"Rose","1997"},{"Lisa","1997"},{"Jisoo","1995"}};   
        process(alldata);
    
        System.out.println("Sort by: High to Low");
        System.out.println("---BUBBLE SORT---");
        for (int a = 0;  a < alldata.length; a++ ) 
        {   
            System.out.println(alldata[a][0] + " age " + alldata[a][1]);
        }
        
        System.out.println("\nSort by: Low to High");
        System.out.println("---BUBBLE SORT---");
        for (int a = 3;  a >= 0; a-- ) 
        { 
            System.out.println(alldata[a][0] + " age " + alldata[a][1]);
        } 
    }
        
        public static void process (String [][] alldata){    
             String sort1, sort2;
            
             for(int b = 0; b < alldata.length; b++)
        {
            for(int c = 0 ; c < alldata.length-1; c++)
            {
                if( Integer.parseInt(alldata[b][1]) >Integer.parseInt( alldata[c][1]) )
                {
                    sort1 = alldata[c][1];
                    alldata[c][1] = alldata[c+1][1];
                    alldata[c+1][1] = sort1;
                    
                    sort2= alldata [c][0];
                    alldata [c][0] = alldata [c+1][0];
                    alldata [c+1][0] = sort2;
                }
            }
        }
    }
}
