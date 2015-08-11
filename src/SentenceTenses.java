import simplenlg.features.Feature;
import simplenlg.features.Tense;
import simplenlg.framework.*;
import simplenlg.lexicon.*;
import simplenlg.phrasespec.SPhraseSpec;
import simplenlg.realiser.english.*;

public class SentenceTenses {
	public static void main(String args[]){
		/*
		 Create the objects for Lexicon,NLGFactory and Realiser
		 */
		
		/* This gets the Lexicon which is a dictionary for all the common words so NLG can understand what the words are */
		Lexicon lexicon = Lexicon.getDefaultLexicon();
		/* NLGFactory has all the methods to create sentences,paragraphs etc */
	    NLGFactory nlgFactory = new NLGFactory(lexicon);
	    /* Realiser is used to output a sentence,paragraph etc */
	    Realiser realiser = new Realiser(lexicon);
		
		
		SPhraseSpec p = nlgFactory.createClause("I", "be", "happy");
        SPhraseSpec q = nlgFactory.createClause("I", "eat", "cake");
        
        q.setFeature(Feature.COMPLEMENTISER, "while");
        q.setFeature(Feature.TENSE, Tense.PRESENT);
        p.addComplement(q);
                
        String output4 = realiser.realiseSentence(p);  //Realiser created earlier
        System.out.println(output4);
	}
}
