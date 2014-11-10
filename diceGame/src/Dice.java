public class Dice
{     
		// Number showing on the first die.
		private int die1Rand;
		// Number showing on the second die.
        private int die2Rand;
        private int bothRandom;
        private int total;
        
// -------------------------- Constructor To Roll The Dice -----------------------------------
        // Pass values through the Constructor.
        // Add two integer variables to the round brackets of the constructor; such as
        // 	int die1 and int die2.
        public Dice() // Constructor with variables to pass values
        {
            // Show random values.
        	// Assign default values to the die1Rand and die2Rand fields.
        	//bothRandom = dices; 
        	die1Rand = 0;
        	die2Rand = 0;
        	bothRandom = 0;
        	bothRandom = die1Rand + die2Rand;
               	
        	// Call the throw() method to roll the dice.
            //Throw();  
        } // end Constructor Dice
// -------------------------- Constructor To Roll The Dice -----------------------------------

        
// ----------------------- Throw Method Random Number Generator ------------------------------
        public void Roll() // Throw() method
        {
            // Roll the dice by setting each of the dice to be
            // 	a random number between 1 and 6.
            die1Rand = (int)(Math.random()*6) + 1;
            die2Rand = (int)(Math.random()*6) + 1;
        } // end Throw() method
// ----------------------- Throw Method Random Number Generator ------------------------------
    
                
        public int getDie1Rand()
        {
           // Set a value for the die1Rand field and return this field as a value.
           // When method called, overwrite the default value for die1Rand
           // 	and insert a new value; value in variable die1 will be the new value for die1Rand.

           // Return the number showing on the first die.
           return die1Rand;
        } // end getDie1Rand() method
        
        public int getDie2Rand()
        {
           // Set a value for the die2Rand field and return this field as a value.
           // When method called, overwrite the default value for die2Rand
           // 	and insert a new value; value in variable die2 will be the new value for die2Rand.
        	
           // Return the number showing on the second die.
           return die2Rand;
        } // end getDie2Rand() method
        
        public int getDiceSum()
        {
           // Return the total showing on the two dice.
           return die1Rand + die2Rand;
        } // end getDiceSum() method
        
        public int Throw( int dices ) // Throw() method with variable called dices.
        {
        	// 1 = call random once
        	// 2 = call random twice, return total
        	bothRandom = die1Rand + die2Rand;
        	bothRandom = dices;
        	bothRandom = die1Rand + die2Rand;
        	bothRandom = dices;
        	total = 0;
        	return total;
        } // end Throw() method with variable called dices.
        
// --------------------------- Return Current Dice Value --------------------------------------
        private int dVal;

        public void Value( int cVal )
        {
        	cVal = die1Rand + die1Rand;
        	dVal = cVal;
        } // end Value() method

        public int getValue()
        {
            // Return current dice value
           return dVal;
        } // end getValue() method
// --------------------------- Return Current Dice Value --------------------------------------      
      
        
        public static int OneDice( int rTotal )
        {
        	int rollTotal = rTotal;
        	return rollTotal * 2;
        }
        
}  // end class Dice