import simplenlg.framework.*;
import simplenlg.lexicon.*;
import simplenlg.phrasespec.SPhraseSpec;
import simplenlg.realiser.english.*;


public class SampleSentence {
	public static void main(String[] args) {
		/*
		 Create the objects for Lexicon,NLGFactory and Realiser
		 */
		
		/* This gets the Lexicon which is a dictionary for all the common words so NLG can understand what the words are */
		Lexicon lexicon = Lexicon.getDefaultLexicon();
		/* NLGFactory has all the methods to create sentences,paragraphs etc */
	    NLGFactory nlgFactory = new NLGFactory(lexicon);
	    /* Realiser is used to output a sentence,paragraph etc */
	    Realiser realiser = new Realiser(lexicon);
	    
	    /*
	     Create and output the sentence
	     */
	    
	    SPhraseSpec s1 = nlgFactory.createClause();
	    s1.setSubject("The Monkey");
	    s1.setVerb("chase");
	    s1.setObject("Mary");
	    
	    String output = realiser.realiseSentence(s1);
	    System.out.println(output);
	    
		}
}

