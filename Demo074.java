class SortArrays{
    void sortArr(int[] arr){
        for (int i =0; i < arr.length;i++){
            int j;            
            for (j=i+1;j < arr.length;j++){
                int temp;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
for (int i = 0; i < arr.length; i++)
        System.out.println(arr[i]);
    }        
}
public class Demo074 {
    public static void main(String[] args) {
        SortArrays obj = new SortArrays();
        int[] arr = {10,15,1,2,8,9,4,3};     
        obj.sortArr(arr);
    }
}