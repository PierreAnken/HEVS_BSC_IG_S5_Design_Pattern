package Strategy_1.sort;


import Strategy_1.behavior.SortBehavior;

public class Sorter {

    private SortBehavior sortMethod = null;
    
    public void setSortBehavior(SortBehavior sortmethod) {
        this.sortMethod = sortmethod;
    }
    
    public void sort(int[] vector) {
        this.sortMethod.sort(vector);
    }
    
    public void showVectorData(int[] vector) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<vector.length; i++) {
            sb.append(vector[i] + "\t");
        }
        
        System.out.println(sb.toString());
    }
}
