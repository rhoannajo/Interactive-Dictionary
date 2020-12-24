import java.io.*;


import java.util.*;


//Using Eclipse, JDK 10

public enum Dictionary {
	Apple1("Apple", "noun", "A round fruit of a tree that has thin red or green skin"),
	Apple2("Apple", "noun", "A hardware and software company best known for their computers"
				+ "and phones, the Macbook and iPhone."),
	Apple3("Apple", "noun", "Short for Big Apple, the nickname for New York City."),
	Arrow("Arrow", "noun", "Here is one arrow: <IMG> -=>> </IMG>"),
	Bitter1("Bitter", "adjective", "Angry, hurt or resentful due to one's bad experiences or unjust treatment."),
	Bitter2("Bitter", "adjective", "Having a sharp, pungent taste or smell; not sweet."),
	Bitter3("Bitter", "noun", "The taste sensation that is acrid, astringent and disagreeable."),
	Book1("Book", "noun", "A set of pages."),
	Book2("Book", "noun", "A written work published in printed or electronic form."),
	Book3("Book", "verb", "To arrange for someone to have a seat on a plane."),
	Book4("Book", "verb", "To arrange something on a particular date."),
	Computer1("Computer", "noun", "An electronic device that manipulates information."),
	Computer2("Computer", "noun", "A person who computes; computist."),
	Clean1("Clean", "adjective", "Free from dirt, marks, or stains."),
	Clean2("Clean", "adjective", "Morally uncontaminated; pure; innocent."),
	Clean3("Clean", "adverb", "So as to be free from dirt, marks or unwanted matter."),
	Clean4("Clean", "adverb", "Used to emphasize the completeness of an action, condition, or experience."),
	Clean5("Clean", "verb", "Make (something or someone) free of dirt, marks or mess, by washing or wiping."),
	Crane1("Crane", "noun", "A large, tall machine used for moving heavy objects."),
	Crane2("Crane", "noun", "A tall, long-legged, long-necked bird."),
	Crane3("Crane", "verb", "To stretch out one's body or neck in order to see something."),
	Date1("Date", "noun", "A social or romantic appointment or engagement."),
	Date2("Date", "noun", "The day of the month or year as specified by a number."),
	Distinct1("Distinct", "adjective", "Familiar. Worked in Java."),
	Distinct2("Distinct", "adjective", "Unique. No duplicates. Clearly different or of a different kind."),
	Distinct3("Distinct", "adverb", "Uniquely. Written 'distinctly'."),
	Distinct4("Distinct", "noun", "A keyword in this assignment."),
	Distinct5("Distinct", "noun", "A keyword in this assignment."),
	Distinct6("Distinct", "noun", "A keyword in this assignment."),
	Distinct7("Distinct", "noun", "An advanced search option."),
	Distinct8("Distinct", "noun", "Distinct is a parameter in this assignment."),
	Dog1("Dog", "noun", "A domesticated mammal that howls, whines, and barks"),
	Dog2("Dog", "noun", "Used to refer to a person who is unpleasant or miserable"),
	Dog3("Dog", "verb", "to act lazily and fail to try one's hardest"),
	Dog4("Dog", "verb", "to follow someone closely and persistently"),
	Park1("Park", "noun", "A large public green area in a town, used for recreation."),
	Park2("Park", "noun", "An area devoted to a specific purpose."),
	Park3("Park", "verb", "Bring to a halt and leave it temporarily."),
	Peer1("Peer", "noun", "A friend of the same age, status, or ability as another person."),
	Peer2("Peer", "verb", "To look keenly or with difficulty at someone or something."),
	Placeholder1("Placeholder", "adjective", "To be updated..."),
	Placeholder2("Placeholder", "adjective", "To be updated..."),
	Placeholder3("Placeholder", "adverb", "To be updated..."),
	Placeholder4("Placeholder", "conjunction", "To be updated..."),
	Placeholder5("Placeholder", "interjection", "To be updated..."),
	Placeholder6("Placeholder", "noun", "To be updated..."),
	Placeholder7("Placeholder", "noun", "To be updated..."),
	Placeholder8("Placeholder", "noun", "To be updated..."),
	Placeholder9("Placeholder", "preposition", "To be updated..."),
	Placeholder10("Placeholder", "pronoun", "To be updated..."),
	Placeholder11("Placeholder", "verb", "To be updated..."),
	Reverse1("Reverse", "adjective", "On back side."),
	Reverse2("Reverse", "adjective", "Opposite to usual or previous arrangement."),
	Reverse3("Reverse", "noun", "A dictionary program's parameter."),
	Reverse4("Reverse", "noun", "Change to opposite direction."),
	Reverse5("Reverse", "noun", "The opposite."),
	Reverse6("Reverse", "noun", "To be updated..."),
	Reverse7("Reverse", "noun", "To be updated..."),
	Reverse8("Reverse", "noun", "To be updated..."),
	Reverse9("Reverse", "noun", "To be updated..."),
	Reverse10("Reverse", "verb", "Change something to opposite."),
	Reverse11("Reverse", "verb", "Go back."),
	Reverse12("Reverse", "verb", "Revoke ruling."),
	Reverse13("Reverse", "verb", "To be updated..."), 
	Reverse14("Reverse", "verb", "To be updated..."),
	Reverse15("Reverse", "verb", "Turn something inside out."),
	Right1("Right", "adjective", "True or correct as a fact."),
	Right2("Right", "noun", "A moral or legal entitlement to have or obtain something."),
	Right3("Right", "verb", "To restore to a normal or upright position."),
	Rose1("Rose", "noun", "A prickly bush or shrub that bears red, yellow, or white flowers."), 
	Rose2("Rose", "noun", "A stylized representation of the flower in heraldy or decoration."),  
	Rose3("Rose", "verb", "Past tense of rise. To move from a lower position to a higher one."),
	Sink1("Sink", "noun", "A fixed basin with a water supply and a drain."),
	Sink2("Sink", "noun", "A place of vice or corruption."),
	Sink3("Sink", "noun", "Short for sinkhole."),
	Sink4("Sink", "verb", "Go down below the surface of something, especially of a liquid."),
	Sink5("Sink", "verb", "To descend; drop."),
	Train1("Train", "noun", "A series of railroad cars moved as a unit by a locomotive."),
	Train2("Train", "noun", "A succession of vehicles or animals traveling in the same direction."),
	Train3("Train", "verb", "To teach a particular skill or behavior through practice and instruction over a period of time."), 
	Type1("Type", "noun", "A category of things having common characteristics."),
	Type2("Type", "verb", "To write on a typewriter or computer by pressing keys."),
	Watch1("Watch", "noun", "A small timepiece worn on a strap on one's wrist."),
	Watch2("Watch", "verb", "To look at or observe attentively.");
	
	private String name;
	private String POS;
	private String def;
	
	private Dictionary(String name, String POS, String def) {
		this.name = name;
		this.POS = POS;
		this.def = def;
	}
	
	public String getName() {
		return this.name.toLowerCase();
	}
	public String getPOS() {
		return this.POS;
	}
	
	public String getDef() {
		return this.def;
	}
	
	@Override
	public String toString() {
		return this.name + " ["+ this.POS + "]: " + this.def;
	}
	
	//method to make array distinct
	public static ArrayList<Dictionary> distinctDict(ArrayList<Dictionary> dictionary) {
		HashMap<String, Dictionary> hmap = new HashMap<String, Dictionary>();
		
		for (Dictionary entry: dictionary) {
			String def = entry.getDef();
			if(!hmap.containsKey(def)) {
				hmap.put(def, entry);
			} 
		}
		
		ArrayList<Dictionary> sortDict = new ArrayList<>(hmap.values());
		if(!hmap.toString().equalsIgnoreCase("reverse")) {
			Collections.sort(sortDict);
		} 

		
		return sortDict;
	}
	
	//method to create array for same part of speech
    public static ArrayList<Dictionary> samePOS(ArrayList<Dictionary> dictionary, String POS) {
        ArrayList<Dictionary> list = new ArrayList<Dictionary>();
        if (dictionary != null) {
            for(Dictionary entry: dictionary) {
            	String pos = entry.getPOS();
                if (pos.equalsIgnoreCase(POS)) {
                    list.add(entry);
                }
            }
        }
        return list;
    }
    
    //method to reverse list
    public static ArrayList<Dictionary> reverse (ArrayList<Dictionary> dictionary) {
    	for(int i = 0; i <dictionary.size()/2; i++) {
    		Dictionary temp = dictionary.get(i);
    		dictionary.set(i, dictionary.get(dictionary.size()-i-1));
    		dictionary.set(dictionary.size() - i - 1, temp);
    	}
    	return dictionary;
    }
    
	public static void main (String[] args) {

		String[] names = {"Apple", "Arrow", "Bitter", "Book", "Computer", "Clean", "Crane", "Date", "Distinct", "Dog", "Park", "Peer", "Placeholder", "Reverse", "Right", "Rose", "Sink", "Train", "Type", "Watch"};
		System.out.println("! Loading data...");

		HashMap<String, ArrayList<Dictionary>> map = new HashMap<String, ArrayList<Dictionary>>();

		//loads enum data into a hashmap
		for (Dictionary entry: Dictionary.values()) {
			String name = entry.getName();
			
			ArrayList<Dictionary> posandDef; 
			
			if (map.containsKey(name)) {
				posandDef = map.get(name);
			} else {
				posandDef = new ArrayList<Dictionary>();
			}
			posandDef.add(entry);
			map.put(name, posandDef);
			
		};
		
		System.out.println("! Loading complete...");
		System.out.println("\n===== DICTIONARY 340 JAVA =====");

		System.out.println("----- Keywords: " + names.length);
		System.out.println("----- Definitions: " + Dictionary.values().length + "\n");
		
		boolean run = true;
		int counter = 0;
		
		
		while (run) {
			counter++;
			Boolean distinct = false;
			Boolean reverse = false;
			System.out.print("Search [" + counter + "]: ");
			Scanner input = new Scanner(System.in);
			String userSearch = input.nextLine();
			String POS = null;
			String dictName = null;
			
			String[] parameter = userSearch.split(" ");
			String[] totalPOS = {"noun", "verb", "adjective", "adverb", "pronoun", "preposition", "conjunction", "interjection"};

			if (parameter.length > 0) {
				dictName = parameter[0];
			 }
			
			if (parameter.length > 1 && parameter[1] != null) {
				if (Arrays.asList(totalPOS).contains(parameter[1].toLowerCase())) {
					POS = parameter[1];
				} else if (parameter[1].toLowerCase().equalsIgnoreCase("distinct")) {
					distinct = true;
				} else if (parameter[1].toLowerCase().equalsIgnoreCase("reverse")) {
					reverse = true;
				}  else {
					System.out.println("     |");
					System.out.println("     <The entered 2nd parameter '" + parameter[1] + "' is NOT a part of speech.>" );
					System.out.println("     <The entered 2nd parameter '" + parameter[1] + "' is NOT 'distinct'.>");
					System.out.println("     <The entered 2nd parameter '" + parameter[1] + "' is NOT 'reverse'.>");
					System.out.println("     <The entered 2nd parameter '" + parameter[1]+ "' was disregarded.>");
					System.out.println("     <The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
					System.out.println("     |");
				}
			}	
			if(parameter.length > 2 && parameter[2]!=null) {
				if ((Arrays.asList(totalPOS).contains(parameter[2].toLowerCase()))) {
					POS = parameter[2];
				} else if (parameter[2].toLowerCase().equalsIgnoreCase("distinct")) {
					distinct = true;
				} else if (parameter[2].toLowerCase().equalsIgnoreCase("reverse")) {
					reverse = true;
				}  else {
					System.out.println("     |");
					System.out.println("     <The entered 3rd parameter '" + parameter[2] + "' is NOT a part of speech.>" );
					System.out.println("     <The entered 3rd parameter '" + parameter[2] + "' is NOT 'distinct'.>");
					System.out.println("     <The entered 3rd parameter '" + parameter[2] + "' is NOT 'reverse'.>");
					System.out.println("     <The entered 3rd parameter '" + parameter[2] + "' was disregarded.>");
					System.out.println("     <The 3rd parameter should be a part of speech or 'distinct' or 'reverse'.>");
					System.out.println("     |");
				}
			}
			if(parameter.length > 3 && parameter[3]!=null) {
				if (parameter[3].toLowerCase().equalsIgnoreCase("reverse")) {
					reverse = true;
				}  else {
					System.out.println("     |");
					System.out.println("     <The entered 4th parameter '" + parameter[3] + "' is NOT a part of speech.>" );
					System.out.println("     <The entered 4th parameter '" + parameter[3] + "' is NOT 'reverse'.>");
					System.out.println("     <The entered 4th parameter '" + parameter[3] + "' was disregarded.>");
					System.out.println("     <The 4th parameter should be a part of speech or 'distinct' or 'reverse'.>");
					System.out.println("     |");
				}
			}

			
		    if (!userSearch.equalsIgnoreCase("!q")) {
		       	System.out.println("     |");
		       	
		       	ArrayList<Dictionary> printWord = map.get(dictName.toLowerCase());
		        ArrayList<Dictionary> printDistinct = (distinct) ? distinctDict(printWord) : printWord;
		        ArrayList<Dictionary> printPOS = (POS != null) ? samePOS(printDistinct, POS) : printDistinct;
		        ArrayList<Dictionary> reverseWord = (reverse) ?  reverse(printWord): printWord;
		        ArrayList<Dictionary> reverseDistinct = (reverse) ? reverse(printDistinct): printDistinct;
		        ArrayList<Dictionary> reversePOS = (reverse) ? reverse(printPOS): printPOS;
		        
		      
		        
		        if (printPOS != null && printPOS.size() > 0) {
		        	for(Dictionary entry: printPOS) {
		        		System.out.print("      " + entry + "\n");
		        	}
		        } else {
		        	System.out.println("     <NOT FOUND> To be considered for the next release. Thank you.");
		        	System.out.println("     |");
					System.out.println("      PARAMETER HOW-TO, please enter:");
					System.out.println("      1. A search key - then 2. An optional part of speech -then");
					System.out.println("      3. An optional 'distinct' - then 4. An optional 'reverse'");
					System.out.println("     |");
		        }
		       
		        System.out.println("     |");
		    } else {
		    	System.out.println(" -----THANK YOU-----");
		    	break;
		    }
		}

	}
}
