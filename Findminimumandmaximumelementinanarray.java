class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
        pair p= new pair(min,max);
       
        return p;
    }
}
