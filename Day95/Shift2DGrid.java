class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
         int m = grid.length;
         int n = grid[0].length; // grid dimation 
         int size = m*n; // 1d arr 
         int [] temp =new int [size];
         int ind = 0;
         

          // convert 2dgrid  - 1d array
         for(int i=0; i<m;i++){
            for (int j=0;j<n;j++){
            temp[ind++] = grid[i][j]; // convert one d array

            }
         }

       // ind --> ind -k
       List<List<Integer>>ans =new ArrayList<>();
       ind =0; // rest index

       for(int i=0;i<m;i++){
        List<Integer>list=new ArrayList<>();
        for(int j=0;j<n;j++){
            //temp [ind-k]
            //
            int idx =((ind-k)%size +size) %size;
            int val = temp[idx];
            list.add(val);

            ind++; // move to nest position 
        }
        ans.add(list);
       }
      return ans;
    }
}