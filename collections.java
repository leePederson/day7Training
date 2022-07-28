//1) Write a programs for each of below for adding, remove and iteration using Iterator
//
//        ArrayList
//        LInkedList
//        Vector
//        Stack
//
//        HashSet
//        LinkedHashSet
//        TreeSet
//
//        HashMap
//        LinkedHashMap
//        TreeMap
//
//2) Write an example for Comparable and Comparator.
//

package Day7;

import java.util.HashMap;
import java.util.*;
import java.util.ArrayList;

public class collections {
	public static void main(String[] args) {		
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<Integer>();
		Vector<Integer> vector = new Vector<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		HashSet<Integer> hSet = new HashSet<Integer>();
		LinkedHashSet<Integer> lHashSet = new LinkedHashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		HashMap<Integer, Integer> hMap = new HashMap<Integer,Integer>();
		LinkedHashMap<Integer, Integer> lHashMap = new LinkedHashMap<Integer, Integer>();
		TreeMap<Integer, Integer> tMap = new TreeMap<Integer, Integer>();
		
		aList.add(1);
		lList.add(1);
		vector.add(1);
		stack.add(1);
		hSet.add(1);
		lHashSet.add(1);
		treeSet.add(1);
		hMap.put(1, 1);
		hMap.put(2,2);
		lHashMap.put(1,1);
		tMap.put(1, 1);
		
		Iterator aListIter = aList.iterator();
		Iterator lListIter = lList.iterator();
		Iterator vectorIter = vector.iterator();
		Iterator stackIter = stack.iterator();
		Iterator hSetIter = hSet.iterator();
		Iterator lHashSetIter = lHashSet.iterator();
		Iterator treeSetIterator = treeSet.iterator();
		Iterator hMapIter = hMap.entrySet().iterator();
		Iterator lHashMapIter = lHashMap.entrySet().iterator();
		Iterator tMapIter = tMap.entrySet().iterator();
		
		while(aListIter.hasNext()) {
			System.out.println(aListIter.next());
			aListIter.remove();
		}
		while(lListIter.hasNext()) {
			System.out.println(lListIter.next());
			lListIter.remove();
		}
		while(vectorIter.hasNext()) {
			System.out.println(vectorIter.next());
			vectorIter.remove();
		}
		while(stackIter.hasNext()) {
			System.out.println(stackIter.next());
			stackIter.remove();
		}
		while(hSetIter.hasNext()) {
			System.out.println(hSetIter.next());
			hSetIter.remove();
		}
		while(lHashSetIter.hasNext()) {
			System.out.println(lHashSetIter.next());
			lHashSetIter.remove();
		}
		while(treeSetIterator.hasNext()) {
			System.out.println(treeSetIterator.next());
			treeSetIterator.remove();
		}
		while(lHashMapIter.hasNext()) {
			System.out.println(lHashMapIter.next());
			lHashMapIter.remove();
		}
		while(tMapIter.hasNext()) {
			System.out.println(tMapIter.next());
			tMapIter.remove();
		}
		
		while(hMapIter.hasNext()) {
			System.out.println(hMapIter.next());
			hMapIter.remove();
		}
	}

}
