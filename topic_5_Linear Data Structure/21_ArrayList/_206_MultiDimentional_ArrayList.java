/*
    Program to print the multidimential ArrayList 

    list1 = [1,2,3,4,5]
    list2 = [2,4,6,8,10]
    list3 = [3,6,9,12,15]

NOTE : CHECK THE LINE NUMBER 39 we assign the value to currList

 */
import java.util.ArrayList;
public class _206_MultiDimentional_ArrayList {
    public static void main(String[] args) {
        
        ArrayList <ArrayList <Integer>> mainList = new ArrayList<>();
        
        //multi list ArrayList
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();

        //data input into list

        for(int i = 1 ; i <= 5 ; i ++){

            list1.add(i*1); //1 2 3 4 5
            list2.add(i*2); //2 4 6 8 10
            list3.add(i*3); //3 6 9 12 15
        }


        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
        list2.remove(2);
        

        for(int i = 0 ; i < mainList.size() ; i++){

            ArrayList<Integer> currList = mainList.get(i);  // assign the value of mainList to currList
            
            for(int j = 0 ; j < currList.size(); j ++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
