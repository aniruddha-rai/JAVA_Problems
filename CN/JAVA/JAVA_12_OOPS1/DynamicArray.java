package JAVA_12_OOPS1;

public class DynamicArray {
    private int[] data;
    private int nextIndex;

    public DynamicArray(){
        data = new int[5];
        nextIndex = 0;
    }

    public int size(){
        return nextIndex;
    }

    public void add(int element){
        if (nextIndex == data.length){      // It means array are filled and no more element can be added
            restructure();                  // It creates a new array double of previous array size
        }
        data[nextIndex] = element;
        nextIndex++;
    }

    public void set(int index, int element) {
        if (index > nextIndex) {
            return;
        } else if (index < nextIndex) {
            data[index] = element;
        } else {
            add(element);
        }
    }

    public int get(int index){
        if (index >= nextIndex){
            // TODO Error out
            return -1;
        }
        return data[index];
    }

    public boolean isEmpty(){
        if (size() == 0){
            return true;
        }else {
            return false;
        }
    }

    public int removeLast(){
        if (size() == 0){
            // TODO Error out
            return -1;
        }
        int value = data[nextIndex - 1];
        data[nextIndex-1] = 0;
        nextIndex--;
        return value;
    }

    private void restructure(){
        int[] temp = data;      // It's referring to the old array which is full ie, all the elements are filled
        data = new int[data.length*2];
        for (int i=0;i<temp.length;i++){
            data[i] = temp[i];  // We are using temp reference to copy old elements into newly created array
        }
    }



}
