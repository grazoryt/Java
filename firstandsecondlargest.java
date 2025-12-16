import java.util.*;

public class firstandsecondlargest{
public static void main(String[] args){
    
    System.out.println("enter size of array");
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    sc.close();
    int f=0;
    int s=0;
    for(int i=0;i<n;i++){
        if(f<a[i]){
            s=f;
            f=a[i];
            
        }
        else if (a[i]<s && a[i]>f)
        {

            s=a[i];
        }
    }
    System.out.println("first largest: "+f);
    System.out.println("second largest: "+s);
}
}
