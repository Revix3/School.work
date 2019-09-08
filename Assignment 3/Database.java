public class Database
{
  final int[] data;

  public Database(int[] data)
  {
    this.data = data;
  }

  public int[] quickSort()
  {
      return Utility.quickSort(data);
  }

  public int[] bubbleSort()
  {
    // Buddle sort happens
  /*
    4) In the Database class, create a method that performs a bubble sort and returns a sorted array of the data
    (ascending and descending). Call this method from the main class and print the result to the screen.
  */
    {
      int n = data.length;
      for (int i = 0; i < n-1; i++)
      for (int j = 0; j < n-i-1; j++)
      if (data[j] > data[j+1])
      {
        // swap temp and arr[i]
        int temp = data[j];
        data[j] = data[j+1];
        data[j+1] = temp;
      }
    }

    return data;
  }

  /*
    5) In the Database class, create methods that each return the min, average, and max respectively.
    Call each of them from the main class and print the result to
    the screen.
  */

  public int min()
  {
      int min = data[0];
      for (int i = 0; i < data.length; i++)
      {
          if (data[i] < min) min = data[i];
      }
      return min;
  }

  public double average()
  {
      int sum = 0;
      for (int i = 0; i < data.length; i++)
      {
          sum += data[i];
      }
      return ((double) sum) / ((double) data.length);
  }

  public int max() {
      int max = data[0];
      for (int i = 0; i < data.length; i++)
      {
          if (data[i] > max) max = data[i];
      }
      return max;
  }

  /*
    6) In the Database class, create a method that searches for a value in the array using a binary search
    (example in the Assignment 2 folder) and returns the index of that value. Call this method from the
    main class and print the result to the screen.
  */

  public int indexOf(int key)
  {
    //Ensure its sorted
    int mid = 0;
    int low = 0;
    int high = data.length - 1;
    while (high >= low)
    {
        mid = (high + low) / 2;
        if (data[mid] < key)
        {
            low = mid + 1;
        }
        else if (data[mid] > key)
        {
            high = mid - 1;
        }
        else
        {
            return mid;
        }
    }
    return -1;
  }
}