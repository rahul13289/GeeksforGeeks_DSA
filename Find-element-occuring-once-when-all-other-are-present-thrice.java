class Solution {
    static int singleElement(int[] arr , int N) {
         int ans=0;
         int mask;
        
         for(int i=0;i<32;i++){
             mask=(1<<i);
             int sum=0;
             for (int num:arr){
                 if((num&mask)!=0){
                     sum++;
                     
                 }
                 
             }
             if (sum%3!=0){
                 ans |=mask;
             }
         }
         return ans;
    }
}
