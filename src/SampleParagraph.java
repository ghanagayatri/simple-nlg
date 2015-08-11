import java.util.Arrays;

import simplenlg.framework.*;
import simplenlg.lexicon.*;
import simplenlg.phrasespec.SPhraseSpec;
import simplenlg.realiser.english.*;

public class SampleParagraph {
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
     Create some sentences
     */
   
	SPhraseSpec p1 = nlgFactory.createClause("Mary", "chase", "the monkey");
    SPhraseSpec p2 = nlgFactory.createClause("The monkey", "fight back"); 
    SPhraseSpec p3 = nlgFactory.createClause("Mary", "be", "nervous");
    
    /*
     Define the sentences as DocumentElement instances
     */
    DocumentElement s1 = nlgFactory.createSentence(p1);
    DocumentElement s2 = nlgFactory.createSentence(p2);
    DocumentElement s3 = nlgFactory.createSentence(p3);
    
    /*
     Pass these elements to the createParagraph class
     */
    
    DocumentElement par1 = nlgFactory.createParagraph(Arrays.asList(s1, s2, s3));
    		
    /*
     Realise and output the paragraph
     */
    String output = realiser.realise(par1).getRealisation();
    
    System.out.println(output);
	} 

}
