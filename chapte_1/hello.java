
public class hello{
       
    public static void main(String[] args){

    	System.out.println("hello ");

         
    	 double[] myList = new double[2];
         myList[0] = 5.6;
         myList[1] = 3.4;
          
         double total = 0; 
         
         for(int i=0;i<myList.length;i++){
            total += myList[i];   
         }

         System.out.println("总和为： " + total);
    }   

}