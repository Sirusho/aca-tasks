package week4.day1;

public class Sort {
    void sort(Student arr[], int age){
        for(int j=1; j<arr.length; j++){
            for(int i=0; i<arr.length-i; i++){
                if(arr[i].age>arr[i+1].age){
                    Student temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

    void sort(Student arr[], double weight) {
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - i; i++) {
                if (arr[i].weight > arr[i + 1].weight) {
                    Student temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    void sort(Student arr[], String name){
        for(int j=1; j<arr.length; j++){
            for(int i=0; i<arr.length-i; i++){
                if(arr[i].name.compareTo(arr[i+1].name)>0){
                    Student temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

    }
}
