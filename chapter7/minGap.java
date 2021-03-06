/* Write a method named minGap that accepts an integer array as a parameter 
 * and returns the minimum 'gap' between adjacent values in the array. The gap 
 * between two adjacent values in a array is defined as the second value minus 
 * the first value. If you are passed an array with fewer than 2 elements, you 
 * should return 0.
 */
public int minGap(int[] a) {
    if(a.length < 2)
        return 0;
        
    int min = a[1] - a[0];
    
    for(int i = 1; i <= a.length - 2; i++) {
        if(a[i+1] - a[i] < min)
            min = a[i+1] - a[i];
    }
    
    return min;
}
