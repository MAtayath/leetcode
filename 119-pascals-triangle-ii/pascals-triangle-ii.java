class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex;
        int r = rowIndex;
         List <Integer> li = new ArrayList<>();
        for(int c=0; c<=rowIndex; c++){
            li.add((int)funNCR(rowIndex,c));
        }
        return li;
    }
    public long funNCR(int n, int r){
        long res=1;
        for(int i =0; i<r; i++){
            res=res*(n-i);
            res/=i+1;
        }
        return  res;
    }
}