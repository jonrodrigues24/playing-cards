package edu.cnm.deepdive.playingcards.model;

import edu.cnm.deepdive.general.model.Hand;
import java.util.Comparator;
import java.util.Iterator;

public class BlackjackComparator implements Comparator<Hand<Card>> {




  @Override
  public int compare(Hand<Card> hand1, Hand<Card> hand2) {

    value(hand1);


   /* *//*String one = hand1.toString();
    String two = hand2.toString();
    Integer oneI = Integer.valueOf(one);
    Integer twoI = Integer.valueOf(two);*//*

    return oneI.compareTo(twoI);*/

  }

  private int value (Hand<Card> hand1) {

    Integer[] one = new Integer[hand1.size()];
    int count = 0;

    for (Card card : hand1) {
    //  one[count] = Integer.valueOf(card.getRank());


    }

  }
}
















    // TODO Implement (consider a helper method that computes a numeric value for a single
    //      hand, then compare the 2 numeric values).
    // Rules:
    // No dealer (e.g. blackjack vs blackjack is a push)
    // zero cards beats a bust.
    // 2 card 21 beats a 3+ card 21.
    // ace can be soft 11 or hard 1, in any hand only a single ace at most can be soft.
