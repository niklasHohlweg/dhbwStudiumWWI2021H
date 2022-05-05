package search_exercise;

import java.util.Arrays;

public class ListSearch {
    public int[] listOne;
    public int[] listTwo;
    public ListSearch (int[] listOne, int[] listTwo){
        for (int i=0; i<listOne.length; i++) {
            listOne[i] = (int) Math.round(Math.random()*listOne.length);
        }
        for(int i = 0; i<listTwo.length; i++){
            listTwo[i] = (int) Math.round( Math.random() * listTwo.length);
        }
        this.listOne = listOne;
        this.listTwo = listTwo;
        Arrays.sort(listTwo);
    }

    public int linearSearch(int searchTerm){
        for(int i=0; i<listOne.length;i++){
            if(listOne[i]==searchTerm){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] searchList, int searchTerm, int lowerIndex, int higherIndex){
        if(higherIndex==lowerIndex && listTwo[higherIndex] != searchTerm){return -1;}

        int middle = lowerIndex +((higherIndex -lowerIndex)/2);
        if(searchList[middle]==searchTerm){
            return middle;
        }
        else if(searchList[middle] > searchTerm){
           return binarySearch(searchList,searchTerm,lowerIndex,middle-1);
        }
        else{
            return binarySearch(searchList,searchTerm,middle+1,higherIndex);
        }

    }
}
