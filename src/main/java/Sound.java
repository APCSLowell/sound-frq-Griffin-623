
import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    int count = 0;
    for(int i =1;i<samples.length;i++){
      if(samples[i]>limit||samples[i]<limit*-1){
        count++;
      }
      if(samples[i]>limit){
          samples[i]=limit;
        }else if(samples[i]<limit*-1){
          samples[i]=limit*-1;
        }
    }
    return count;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    int i =1;
    while(samples[i]==0){
      i++;
    }
    for(int j=1;j<samples.length-i;j++){
      samples[j]=samples[j+1];
    }
  }
}
