TC: O(n). n is the number of elements in an array
SC:O(n)

class Solution {
    public int trap(int[] height) {
        
        if(height==null || height.length==0) return 0;
        
        int startToEndMaxHeight[]=new int[height.length];
        int endToStartMaxHeight[]=new int[height.length];
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            max = Math.max(max,height[i]);
            startToEndMaxHeight[i]=max;
        }
        
          max=Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--){
            max = Math.max(max,height[i]);
            endToStartMaxHeight[i]=max;
        }
        
        int totalWaterCount=0;
        for(int i=0;i<height.length;i++){
            totalWaterCount+=
                Math.min(startToEndMaxHeight[i],endToStartMaxHeight[i])-height[i];
        }
        System.out.println(totalWaterCount);
        return totalWaterCount;
        
    }
}
