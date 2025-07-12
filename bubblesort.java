import java.util.Scanner;
public class bubblesort {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++){
                System.out.print("enter element : ");
                a[i]=sc.nextInt();
        }
        int n=5,t;
        for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(a[j]>a[j+1]){
                        t=a[j+1];
                        a[j+1]=a[j];
                        a[j]=t;
                }    
                }
        }

        System.out.println("sorted array : ");
        for(int i=0;i<5;i++){
                System.out.print(a[i]);
        }
}
}