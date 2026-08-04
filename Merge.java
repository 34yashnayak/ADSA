public class merge {
    public static void conquere(int a[],int s,int e,int mid ){
        int merged[] = new int[e-s+1];
        int n1 = s;
        int n2= mid+1;
        int x=0;

        while (n1<= mid && n2<= e) {
            if(a[n1]<=a[n2]){
                merged[x++]=a[n1++];
            }else{
                merged[x++]=a[n2++];
            }
        }

        while(n1<= mid){
            merged[x++]=a[n1++];
        }
        
        while(n2<= e){
            merged[x++]=a[n2++];
        }

        for(int i = 0 ;i<merged.length;i++){
            a[s+i]= merged[i];
        }
        
    }
    public static void mergesort(int a[],int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        mergesort(a, s, mid);
        mergesort(a, mid+1, e);
        conquere(a, s, e, mid);
    }
    public static void main(String[] args) {
        int a[]= {8,5,4,3,2,1};
        System.out.println("before sort ....");
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        int n = a.length -1;
        mergesort(a,0,n);

        System.out.println("\nafter sort ....");
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}