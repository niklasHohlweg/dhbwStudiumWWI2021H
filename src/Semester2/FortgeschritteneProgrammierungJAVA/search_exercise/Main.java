package search_exercise;

public class Main {
    public static void main(String[] args) {
        ListSearch listSearch = new ListSearch(new int[10], new int[25]);
        System.out.println(listSearch.linearSearch(3));
        System.out.println(listSearch.binarySearch(listSearch.listTwo,3,0,24));
    }
}
