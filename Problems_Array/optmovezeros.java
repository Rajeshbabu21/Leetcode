package Problems_Array;

public class optmovezeros {
 public static void main(String[] args) {
  int[] arr = [1,2,3,30,0,45,0];
  int n = arr.length;
  int j = -1;
  for(int i=0;i<n;i++)
  {
   if(arr[i] == 0)
   {
     j=i;
    break;
   }
  }
  for(int i=j+1;i<n;i++)

  {
   if(arr[i] != 0 )
   {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;


   }
   j++;

  }





 }
 
}
