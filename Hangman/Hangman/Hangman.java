import java.util.*;
public class Hangman
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Hangman!\nStart by guessing a letter that\nyou think could be in the word.");
        String [] category = {"movie","fruit","technology","animal","weather","drinks","emotions","vehicles","tools","kitchen","school"};
        String chosenCat = category[(int)(category.length*Math.random())];
        
        String [] movie = {"terminator","titanic", "godzilla", "avengers"};
        String [] fruit = {"banana","apple", "strawberry","pear","kiwi"};
        String [] technology = {"computer","phone","laptop","monitor"};
        String [] animal = {"sheep","cow","pig","dog","tiger","bunny"};
        String [] weather = {"rain","snow","hail","sunny","stormy"};
        String [] drinks = {"water","soda","juice","lemonade","coffee"};
        String [] emotions = {"happy","sad","angry","excited"};
        String [] vehicles = {"plane","car", "truck","motorcycle","surprised"};
        String [] tools = {"hammer","wrench","screwdriver","saw","drill"};
        String [] kitchen = {"knife","spoon","fork","stove","oven"};
        String [] school = {"classroom","teacher","student","pencil","desk"};
        
        int numOfChosenWrd = 0;
        String chosenWord = "";
        switch(chosenCat)
        {
            case "movie":
                numOfChosenWrd = (int)(movie.length*Math.random());
                chosenWord = movie[numOfChosenWrd];
                break;
            case "fruit":
                numOfChosenWrd = (int)(fruit.length*Math.random());
                chosenWord = fruit[numOfChosenWrd];
                break;
            case "technology":
                numOfChosenWrd = (int)(technology.length*Math.random());
                chosenWord = technology[numOfChosenWrd];
                break;
            case "animal":
                numOfChosenWrd = (int)(animal.length*Math.random());
                chosenWord = animal[numOfChosenWrd];
                break;
            case "weather":
                numOfChosenWrd = (int)(weather.length*Math.random());
                chosenWord = weather[numOfChosenWrd];
                break;
            case "drinks":
                numOfChosenWrd = (int)(drinks.length*Math.random());
                chosenWord = drinks[numOfChosenWrd];
                break;
            case "emotions":
                numOfChosenWrd = (int)(emotions.length*Math.random());
                chosenWord = emotions[numOfChosenWrd];
                break;
            case "vehicles":
                numOfChosenWrd = (int)(vehicles.length*Math.random());
                chosenWord = vehicles[numOfChosenWrd];
                break;
            case "tools":
                numOfChosenWrd = (int)(tools.length*Math.random());
                chosenWord = tools[numOfChosenWrd];
                break;
            case "kitchen":
                numOfChosenWrd = (int)(kitchen.length*Math.random());
                chosenWord = kitchen[numOfChosenWrd];
                break;
            case "school":
                numOfChosenWrd = (int)(school.length*Math.random());
                chosenWord = school[numOfChosenWrd];
                break;
        }
        int numOfGuess = 6;
        String[] temp = new String[chosenWord.length()];
        String[] theWord = new String[chosenWord.length()];
        for(int i = 0; i < chosenWord.length(); i++)
        {  
            temp[i] = "_";
            System.out.print(temp[i] + " ");
            theWord[i] = chosenWord.substring(i,i+1);
        }
        System.out.println();
        String guess = "";
        String result = "";
        String guessOut = "";
        int counter = 0;
        String [] guessedLetters = {};
        while(numOfGuess >=0)
        {
            System.out.println("The category is: "+chosenCat);
            System.out.println("Take a guess");
            guess = console.next();
            if(chosenWord.indexOf(guess) != -1)
            {
                for(int i = 0; i < theWord.length; i++)
                {

                    if(guess.equals(theWord[i]))
                    {
                        System.out.print("\f");
                        hangman(numOfGuess);
                        System.out.println("Correct!");
                        counter++;
                        temp[i] = guess;
                        System.out.println(Arrays.toString(temp));
                        System.out.println("You have "+numOfGuess+" incorrect guess[es] left");
                        if(numOfGuess != 6)
                            System.out.println("Letters guessed : "+guessOut);

                    }
                } 
            }

            else
            {
                numOfGuess--;
                System.out.print("\f");
                hangman(numOfGuess);
                guessOut = guessOut+" "+guess;
                System.out.println(Arrays.toString(temp));
                System.out.println("Incorrect\nYou have "+numOfGuess+" incorrect guess[es] left");
                System.out.println("Letters guessed : "+guessOut);
            }
            if(counter == chosenWord.length())
            {
                result = "win";
                break;
            }
            else if(numOfGuess == 0)
            {
                result = "lost";
                break;
            }

        } 
        switch(result)
        {
            case "win":
                System.out.print("\f");
                if(6-numOfGuess == 1)
                {
                    System.out.println("Congratulations!\nYou guessed the word right with 1 incorrect guess!");
                }
                else
                    System.out.println("Congratulations!\nYou guessed the word right with "+(6-numOfGuess)+" incorrect guesses!");
                break;
            case "lost":
                System.out.print("\f");
                hangman(numOfGuess);
                System.out.println("YOU LOST!!!\nYou didn't guess the right word\nThe correct word was: "+chosenWord);
                break;

        }

    }

    public static void hangman(int count) 
    {
        String [] hangManPic = new String [7];
        hangManPic[6] = "   ____________\n   |\n   |\n   |\n   |\n   |\n   |\n   | \n___|___";
        hangManPic[5] = ("   ____________\n   |          _|_\n   |         /   \\\n   |        |     |\n   |         \\_ _/\n   |\n   |\n   | \n___|___");
        hangManPic[4] = ("   ____________\n   |          _|_\n   |         /   \\\n   |        |     |\n   |         \\_ _/\n   |           |\n   |           |\n   |          \n___|___");
        hangManPic[3] = ("   ____________\n   |          _|_\n   |         /   \\\n   |        |     |\n   |         \\_ _/\n   |         __|\n   |           |\n   |          \n___|___");
        hangManPic[2] = ("   ____________\n   |          _|_\n   |         /   \\\n   |        |     |\n   |         \\_ _/\n   |         __|__\n   |           |\n   |          \n___|___");
        hangManPic[1] = ("   ____________\n   |          _|_\n   |         /   \\\n   |        |     |\n   |         \\_ _/\n   |         __|__\n   |           |\n   |          /\n___|___      /");
        hangManPic[0] = ("   ____________\n   |          _|_\n   |         /   \\\n   |        |     |\n   |         \\_ _/\n   |         __|__\n   |           |\n   |          / \\ \n___|___      /   \\ ");
        System.out.println(hangManPic[count]); 
    }
}