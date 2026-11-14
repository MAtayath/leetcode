class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex;
        List <Integer> row = new ArrayList<>();
        long ans =1; 
        row.add(1);
        for(int i=1; i<=rowIndex; i++){
            ans =(ans *(n-i+1))/i;
            row.add((int)ans);
        }
        return row;
    }
}