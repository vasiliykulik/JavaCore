package src.m7_set_list_queue_comarable_comparator.selfedu;
import java.util.*;
/**
 * Created by Стрела on 29.09.2016.
 * The following is a program that uses the dealHand method in combination with
 * Collections.shuffle to generate hands from a normal 52-card deck.
 * The program takes two command-line arguments: (1) the number
 * of hands to deal and (2) the number of cards in each hand.
 */
public class B2_Lists_hands_from_a_normal_52card_deck {
        public static void main(String[] args) {
            if (args.length < 2) {
                System.out.println("Usage: Deal hands cards");
                return;
            }
            int numHands = Integer.parseInt(args[0]);
            int cardsPerHand = Integer.parseInt(args[1]);

            // Make a normal 52-card deck.
            String[] suit = new String[] {
                    "spades", "hearts",
                    "diamonds", "clubs"
            };
            String[] rank = new String[] {
                    "ace", "2", "3", "4",
                    "5", "6", "7", "8", "9", "10",
                    "jack", "queen", "king"
            };

            List<String> deck = new ArrayList<String>();
            for (int i = 0; i < suit.length; i++)
                for (int j = 0; j < rank.length; j++)
                    deck.add(rank[j] + " of " + suit[i]);

            // Shuffle the deck.
            Collections.shuffle(deck);

            if (numHands * cardsPerHand > deck.size()) {
                System.out.println("Not enough cards.");
                return;
            }

            for (int i = 0; i < numHands; i++)
                System.out.println(dealHand(deck, cardsPerHand));
        }

        public static <E> List<E> dealHand(List<E> deck, int n) {
            int deckSize = deck.size();
            List<E> handView = deck.subList(deckSize - n, deckSize);
            List<E> hand = new ArrayList<E>(handView);
            handView.clear();
            return hand;
        }
}
