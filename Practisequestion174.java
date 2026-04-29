interface sortable1{
    public void sort(int[] array);
}
class quicksort implements sortable1{
    public void sort(int[] arr){
        quicksort(arr,0,arr.length-1);
    }
    int partition(int[] arr,int l,int r){
        int pivot=arr[l];
        int p=l+1;
        int q=r;
        while(p<=q){
            while(arr[p]<pivot && p<=r){
                p++;
            }
            while(arr[q]>pivot && q>=l){
                q--;
            }
            if(p<q){
                int t=arr[p];
                arr[p]=arr[q];
                arr[q]=t;
                p++;
                q--;
            }
        }
        int t=arr[l];
        arr[l]=arr[q];
        arr[q]=t;
        return q;
    }
    public void quicksort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int q=partition(arr,l,r);
        quicksort(arr,l,q-1);
        quicksort(arr,q+1,r);
    }
}
class mergesort implements sortable1{
    public void sort(int[] arr){
        mergesort(arr,0,arr.length-1);
    }
    public void merge(int[] a,int l,int r){
        int t[]=new int[100];
        int mid=(l+r)/2;
        int i=l,j=mid+1,k=l;
        while(i<=mid && j<=r){
            if(a[i]>a[j]){
                t[k]=a[j];
                i++;
                k++;
            }
            else{
                t[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            t[k]=a[i];
            i++;
            k++;
        }
        while(j<=r){
            t[k]=a[j];
            j++;
            k++;
        }
        for(int i1=l;i1<=r;i1++){
            a[i1]=t[i1];
        }
    }
    public void mergesort(int[] a,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergesort(a,l,mid);
        mergesort(a,mid+1,r);
        merge(a,l,r);
    }
}
public class Practisequestion174 {
    static void main() {
        /*Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers in descending order.
        Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the sort() method.*/
        int[] arr={12,34,23,44};
        quicksort q=new quicksort();
        mergesort m=new mergesort();
        q.sort(arr);
        m.sort(arr);
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}