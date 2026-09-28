class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        long previous = 1;
        for(int k = 1;k <= rowIndex;k++){
            long next = previous*(rowIndex-k+1)/k;
            row.add((int) next);
            previous = next;
        }
        return row;
    }
}

Time = O(n)
Space = O(n)