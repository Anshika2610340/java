interface sortable{
    public void sort(int[] arr);
}
class bubblesort implements sortable{
    public void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
class selectionsort implements sortable{
    public void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int midindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[midindex]){
                    midindex=j;
                }
                int temp=arr[i];
                arr[i]=arr[midindex];
                arr[midindex]=temp;
            }
        }
    }
}
public class Practisequestion170 {
    static void main() {
        /* Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order.
        Create two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own implementations of the sort() method.*/
        int[] arr={12,34,67,56,45,33};
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        bubblesort b=new bubblesort();
        b.sort(arr);
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        selectionsort s=new selectionsort();
        s.sort(arr);
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
