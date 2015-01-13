package Objecten;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
	
	public ArrayList<String> StringList;
	
	public MergeSort(Klant klanten) {
		StringList = new ArrayList<String>();
		for(int i=0; i<klanten.size(); i++) {
			StringList.add(klanten.get(i));
		}
		
	}
	
	public void sort() {
		
		StringList=mergeSort(StringList);
		
		
	}
	
	private ArrayList<String> mergeSort(ArrayList<String> stringList2) {
		
		ArrayList<String> left = new ArrayList<String>();
        ArrayList<String> right = new ArrayList<String>();
        int center;
 
        if(stringList2.size()==1)   
            return stringList2;
        else
        {
            center = stringList2.size()/2;
            // copy the left half of whole into the left.
            for(int i=0; i<center; i++)
            {
                    left.add(stringList2.get(i));
            }
 
            //copy the right half of whole into the new arraylist.
            for(int i=center; i<stringList2.size(); i++)
            {
                    right.add(stringList2.get(i));
            }
 
            // Sort the left and right halves of the arraylist.
            left  = mergeSort(left);
            right = mergeSort(right);
 
 
            // Merge the results back together.
            merge(left,right,stringList2);
 
        }
        return stringList2;
    }
	
	private void merge(ArrayList<String> left, ArrayList<String> right,
            ArrayList<String> stringList2) {
 
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;
 
 
        // As long as neither the left nor the right arraylist has
        // been used up, keep taking the smaller of left.get(leftIndex)
        // or right.get(rightIndex) and adding it at both.get(bothIndex).
        while (leftIndex < left.size() && rightIndex < right.size())
        {
            if ((left.get(leftIndex).compareTo(right.get(rightIndex)))<0)
            {
            	stringList2.set(wholeIndex,left.get(leftIndex));
                leftIndex++;
            }
            else
            {
            	stringList2.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }
 
        ArrayList<String>rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            // The left arraylist has been use up...
            rest = right;
            restIndex = rightIndex;
        }
        else {
            // The right arraylist has been used up...
            rest = left;
            restIndex = leftIndex;
        }
 
        // Copy the rest of whichever arraylist (left or right) was
        // not used up.
        for (int i=restIndex; i<rest.size(); i++) {
        	stringList2.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }
 
    public void show()
    {
        System.out.println("Sorted:");
        for(int i=0; i< StringList.size();i++)
        {
            System.out.println(StringList.get(i));
        }
 
    }
 
    public static void main(String[] args) {
    	ArrayList<Klant> klanten = new ArrayList<Klant>();
    	Klant klant = new Klant(0, "Vos", "van der", "Jan", 19, true, "Rotterdam", "jvdv@o.nl");
    	Klant klant1 = new Klant(1, "Janssen", "van", "Henk", 21, true, "Rotterdam", "jvdv@o.nl");
        Scanner sc = new Scanner(System.in);
        
        klanten.add(klant);
        klanten.add(klant1);
 
        System.out.println("Enter your text, type done for exit:");
        String strin = sc.nextLine();
 
        while(!strin.equals("done"))
        {
        
            strin = sc.nextLine();
        }
        System.out.println("*****1******************");
        MergeSort test = new MergeSort(klanten.get(0));
        test.sort();
        test.show();
        MergeSort test1 = new MergeSort(klanten.get(1));
        test1.sort();
        test1.show();
    }

	public void linearSearch() {
	
	}
	

}
