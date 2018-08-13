package distinctPairs.utils;

import java.util.HashSet;

public class Distinct_Pairs {

	
	
	public static void getDistinctPairs(int[] numbers, int sum) {

	    Distinct_Pairs e = new Distinct_Pairs();
	    int[] input = numbers;

	    HashSet<Pair> result = e.findAllPairs(input, sum);
	    for (Pair p : result) {
	      System.out.println("(" + p.getElement1() + "," + p.getElement2() + ")");
	    }

	  
	}
	
	

  public HashSet<Pair> findAllPairs(int[] inputList, int sum) {
    HashSet<Integer> allElements = new HashSet<Integer>();
    HashSet<Integer> substracted = new HashSet<Integer>();
    HashSet<Pair> result = new HashSet<Pair>();

    for (int i : inputList) {
      allElements.add(i);
      substracted.add(i - sum);
    }

    for (int i : substracted) {
      if (allElements.contains(-1 * i)) {
        addToSet(result, new Pair(-i, i + sum));
      }
    }

    return result;

  }

  public void addToSet(HashSet<Pair> original, Pair toAdd) {
    if (!original.contains(toAdd) && !original.contains(reversePair(toAdd))) {
      original.add(toAdd);
    }
  }

  public Pair reversePair(Pair original) {
    return new Pair(original.getElement2(), original.getElement1());
  }

}

class Pair {
  private int element1;

  private int element2;

  public Pair(int e1, int e2) {
    element1 = e1;
    element2 = e2;
  }

  public int getElement1() {
    return element1;
  }

  public int getElement2() {
    return element2;
  }

  public int hashCode() {
    return (element1 + element2) * element2 + element1;
  }

  public boolean equals(Object other) {
    if (other instanceof Pair) {
      Pair otherPair = (Pair) other;
      return ((this.element1 == otherPair.element1) && (this.element2 == otherPair.element2));
    }
    return false;
  }

}