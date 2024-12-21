public class BinarySearch{
    public static void main(String args[]){
     int arr[] = {10,20,30,40,50,60,70,80,90,100};
     int key = 70;
     int si = 0;
     int ei = arr.length-1;
     boolean isprime = false;
     while(si<=ei){
        int mid = (si+(ei-si/2));
        if(arr[mid]==key){
            isprime = true;
            System.out.print(mid);
            break;
        }
        else if(arr[mid]>key){
            ei--;
        }
        else{
            si++;
        }
     }
     if(isprime==false){
        System.out.print("-1");
     }
    }
}