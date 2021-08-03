package edu.cnm.deepdive.general.model.util;

public class MergeSorter {

  private final Class<? extends Comparable<?>> cls;

  public MergeSorter(Class<? extends Comparable<?>> cls) {
    this.cls = cls;
  }

  public <T extends Comparable<? super T>> void sort(T[] data) {
    sort(data, 0, data.length);
  }

  public <T extends Comparable<? super T>> void sort(T[] data, int start, int end) {
    if (end > start + 1) {

      int midpoint = (start + end) / 2;
      sort(data, start, midpoint); // sort left side of array range
      sort(data, midpoint, end); // sort right side of array range
      T[] output = (T[]) new Object[end - start];
      int leftIndex = start;
      int rightIndex = midpoint;
      int outputIndex = 0;
      //merge process
      while (leftIndex < midpoint && rightIndex < end) {
        T leftValue = data[leftIndex];
        T rightValue = data[rightIndex];
        if (leftValue.compareTo(rightValue) <= 0) {
          output[outputIndex++] = leftValue;
          leftIndex++;
        } else {
          output[outputIndex++] = rightValue;
          rightIndex++;
        }
      }
      if(leftIndex < midpoint) {
        System.arraycopy(data, leftIndex, output, outputIndex, midpoint - leftIndex);
      } else {
        System.arraycopy(data, rightIndex, output, outputIndex, end - rightIndex);
      }
      System.arraycopy(output, 0, data,
          start, output.length);
    }

  }

}
