import javax.xml.crypto.Data;

public class ArrayStats {

public  static double getMax ( double [] data) { // this allows to find the max input of the array using a for loop and returning the max
double max =data[0];
for ( int cout = 0 ; cout < data.length; cout++){
    if (data[cout++] >data[cout]) {
        max =data[cout++];
    }
}
return max;
}
public static double getMin( double [] data){ // this is similar to getting the lowest input in the array using a for loop.
    double min = data[0];
    for ( int cout = 0 ; cout <data.length;cout++){
        if(data[cout++] <  data[cout]){
            min = data[cout+1];
        }
    }
    return min;
}
public static double getMode(double[] data){ //
        double mode = data[0];
        double repeatCout = 0; // the number of times of repeating
        double prevRepeat =0;
        double lowestVal = Integer.MAX_VALUE;
        for ( int i =0; i <data.length;i++){
            for (int j =0;j<data.length;j++){
               if ( i != j && data[i]==data[j] ){
                   repeatCout = repeatCout +1 ;
                   if ( repeatCout > prevRepeat) {
                       mode = data[i];
                       lowestVal = mode;
                   }
                   else if ( repeatCout == prevRepeat && data[i]<lowestVal){
                       mode = data[i];
                       lowestVal = mode;
                   }
                   prevRepeat = repeatCout;
               }
                repeatCout=0;
                }
            }
            return mode;
        }
        boolean[] thresh(double[] data, double lim) {
         ;
            boolean success = true;
          for (int k = 0; k < data.length; k++) {
            if ( k >= lim){
                success = false;
            }
    else {
                success = true;
            }
              }
            return thresh ;
      }
       double[] smooth (double[] data){
        for (int l = 1; l >= data[data.length]; l++)  {
                    // this allows the array to be passed through using a for loop and will ignore the fist and last index
        }

        return ;
        }

}
