
public class linearsearch {
    public static void main (String args[]){
    
        int a[]={10,20,30,40,50};
        int find=50;
        int i=0;
        while(i<a.length)
            {
            if(find==a[i])
                {
                System.out.println("Given number is available" +" " +i+" "+"Position");
                break; 
            }
            i++;
        }
        if(i==a.length)
            {
            System.out.println("Given number is not available");
        }
    }
}
