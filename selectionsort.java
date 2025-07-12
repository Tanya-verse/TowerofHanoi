import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        //input
        for(int i=0;i<5;i++){
                System.out.print("enter element : ");
                a[i]=sc.nextInt();
        }

        //sorting
        int smallest=a[0];
        int j;
        for(int i=0;i<a.length;i++){
            for( j=0;j<a.length;j++){
                if(a[j]<smallest){
                    smallest=a[j];
                }
            }
            int t=a[0];
            a[0]=smallest;
            a[j]=t;
        }
        
        System.out.println("sorted array : ");
        for(int i=0;i<5;i++){
                System.out.print(a[i]);
        }
}
}  
    