import tester.*; // The tester library
import javalib.worldimages.*; // images, like RectangleImage or OverlayImages
import javalib.funworld.*; // the abstract World class and the big-bang library
import java.awt.Color; // general colors (as triples of red,green,blue values)
import java.util.Random; // and predefined colors (Red, Green, Yellow, Blue, Black, White)

//interface of ILoWord
interface ILoWord {

  //returns an integer based on where the active word is or if there is none the 
  //middle of the screen
  int activeListX() ;

  // returns a scene with all of the words from a list are displayed
  WorldScene draw(WorldScene worldScene);

  // produces an ILoWord where any IWords that are empty are filtered out
  ILoWord filterOutEmpties();

  // takes in a String of length 1 and produces an ILoWord where any active words
  // in this
  // ILoWord are reduced by removing the first letter only if the given
  // string matches the first letter.
  ILoWord checkAndReduce(String letter);

  // Updates the y-coordinates of active words in the list
  //creates a new word after certain time
  //updates level
  ILoWord onTick();

  //makes a new list with the added word at the end
  public ILoWord listMaker(IWord word);

  //returns true if the y value of the first word is the same as the scene height
  boolean gameOverCheck();

  //returns true if any inactive words in the list have the same first letter as input letter
  boolean scoreChecker(String letter);

  //checks if there is an active in the list and returns true
  boolean activeListChecker();

  //makes a new list where the inputted letter is taken off the active word if they match
  ILoWord reduceActive(String letter);

  //returns a list where the inputted letter is taken off the active word if there is an active 
  ILoWord checkActiveAndReduce(String key);

  //returns a boolean if there is an active word that has the same first letter as the inputed word
  boolean activeScoreChecker(String key);

  //creates a new list so the level and press tab message are displayed
  ILoWord levelList(IWord word);

  //returns a boolean based on gameOverCheckHelper2
  boolean gameOverCheckHelper1();

  //returns a boolean based on gameOverCheckHelp if the y is the same as scene height
  boolean gameOverCheckHelper2();

  //returns the rest of the rest of the list
  ILoWord levelListHelp();

  //returns boolean if the second item is a LevelWord
  boolean levelListHelp2();

}

interface IWord {
  // constant for screen height
  int SCENE_HEIGHT = 600;

  // constant for font size
  int FONT_SIZE = 20;

  // takes away the first letter of the string if it matches the inputted letter
  IWord reduce(String letter);

  // checks if a word is empty
  boolean filterOutHelp();

  // returns a scene with all of the words from a list are displayed
  WorldScene draw(WorldScene worldScene);

  // Updates the y-coordinates of active words in the list
  //creates a new word after certain time
  //updates level
  IWord onTick();

  //returns a boolean if the first letter of an inactive word is the same as input letter
  boolean reduceHelper(String letter);

  //returns a boolean if the y value of the word is the same as scene height
  boolean gameOverCheckHelp();

  //checks if a word is actve an
  boolean activeChecker();

  //takes first letter off a word and makes it active
  IWord activeReducer(String letter);

  //checks if an active word has the same first letter as input letter
  boolean activeLetterChecker(String letter);

  //returns the x value of an active word or half scene width
  int activeWordX();

  //checks if the inputted word is a LevelWord
  boolean levelWordChecker();

}

class MtLoWord implements ILoWord {

  /*
   * TEMPLATE
   * METHODS
   * ... this.checkAndReduce(String letter) ... -- ILoWord
   * ... this.filterOutEmpties() ... -- ILoWord
   * ... this.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.onTick()... -- ILoWord
   * ... this.listMaker(IWord word) ... -- ILoWord
   * ... this.gameOverCheck() ... -- boolean
   * ... this.scoreChecker(String Letter) ... -- boolean
   * ... this.activeListChecker() ... -- boolean
   * ... this.reduceActive(String Letter) ... -- ILoWord
   * ... this.checkActiveAndReduce(String key) ... -- ILoWord
   * ... this.activeScoreChecker(String key) ... -- ILoWord
   * ... this.levelList(IWord word) ... -- ILoWord
   * ... this.activeListX() ... -- int
   * ... this.levelListHelp() ... -- ILoWord
   * ... this.levelListHelp2() ... -- boolean
   * ... this.gameOverCheckHelper1() ... -- boolean
   * ... this.gameOverCheckHelper2() ... -- boolean
   * PARAMETERS
   * letter -- String
   * word -- IWord
   * worldScene -- WorldScene
   * key -- String
   */

  // returns a scene with all of the words from a list are displayed
  public WorldScene draw(WorldScene worldScene) {
    return worldScene;
  }

  // produces an ILoWord where any IWords that are empty are filtered out
  public ILoWord filterOutEmpties() {
    return this;
  }

  // takes in a String of length 1 and produces an ILoWord where any active words
  // in this
  // ILoWord are reduced by removing the first letter only if the given string
  // matches the first letter.
  public ILoWord checkAndReduce(String letter) {
    return this;
  }

  // Updates the y-coordinates of active words in the list
  //creates a new word after certain time
  //updates level
  public ILoWord onTick() {
    return this;
  }

  //makes a new list with the added word at the end
  public ILoWord listMaker(IWord word) {
    return new ConsLoWord(word, new MtLoWord());
  }

  //returns true if the y value of the first word is the same as the scene height
  public boolean gameOverCheck() {
    return false;
  }

  //returns true if any inactive words in the list have the same first letter as input letter
  public boolean scoreChecker(String letter) {
    return false;
  }

  //checks if there is an active in the list and returns true
  public boolean activeListChecker() {
    return false;
  }

  //makes a new list where the inputted letter is taken off the active word if they match
  public ILoWord reduceActive(String letter) {
    return new MtLoWord();
  }

  //returns a list where the inputted letter is taken off the active word if there is an active 
  public ILoWord checkActiveAndReduce(String key) {
    return new MtLoWord();
  }

  //returns a boolean if there is an active word that has the same first letter as the inputed word
  public boolean activeScoreChecker(String key) {
    return false;
  }

  //creates a new list so the level and press tab message are displayed
  public ILoWord levelList(IWord word) {
    return new ConsLoWord(word, new MtLoWord());
  }

  //returns an integer based on where the active word is or if 
  //there is none the middle of the screen
  public int activeListX() {
    return 200;
  }

  //returns the rest of the rest of the list
  public ILoWord levelListHelp() {
    return new MtLoWord();
  }

  //returns boolean if the second item is a LevelWord
  public boolean levelListHelp2() {
    return false;
  }

  //returns a boolean based on gameOverCheckHelper2
  public boolean gameOverCheckHelper1() {
    return false;
  }

  //returns a boolean based on gameOverCheckHelp if the y is the same as scene height
  public boolean gameOverCheckHelper2() {
    return false;
  }

}

class ConsLoWord implements ILoWord {
  IWord first;
  ILoWord rest;

  ConsLoWord(IWord first, ILoWord rest) {
    this.first = first;
    this.rest = rest;
  }

  /*
   * TEMPLATE
   * METHODS
   * ... this.checkAndReduce(String letter) ... -- ILoWord
   * ... this.filterOutEmpties() ... -- ILoWord
   * ... this.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.onTick()... -- ILoWord
   * ... this.listMaker(IWord word) ... -- ILoWord
   * ... this.gameOverCheck() ... -- boolean
   * ... this.scoreChecker(String Letter) ... -- boolean
   * ... this.activeListChecker() ... -- boolean
   * ... this.reduceActive(String Letter) ... -- ILoWord
   * ... this.checkActiveAndReduce(String key) ... -- ILoWord
   * ... this.activeScoreChecker(String key) ... -- ILoWord
   * ... this.levelList(IWord word) ... -- ILoWord
   * ... this.activeListX() ... -- int
   * ... this.levelListHelp() ... -- ILoWord
   * ... this.levelListHelp2() ... -- boolean
   * ... this.gameOverCheckHelper1() ... -- boolean
   * ... this.gameOverCheckHelper2() ... -- boolean
   * METHODS OF FIELDS
   * ... this.rest.checkAndReduce(String letter) ... -- ILoWord
   * ... this.rest.filterOutEmpties() ... -- ILoWord
   * ... this.rest.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.rest.onTick()... -- ILoWord
   * ... this.rest.listMaker(IWord word) ... -- ILoWord
   * ... this.rest.gameOverCheck() ... -- boolean
   * ... this.rest.scoreChecker(String Letter) ... -- boolean
   * ... this.rest.activeListChecker() ... -- boolean
   * ... this.rest.reduceActive(String Letter) ... -- ILoWord
   * ... this.rest.checkActiveAndReduce(String key) ... -- ILoWord
   * ... this.rest.activeScoreChecker(String key) ... -- ILoWord
   * ... this.rest.levelList(IWord word) ... -- ILoWord
   * ... this.rest.activeListX() ... -- int
   * ... this.rest.levelListHelp() ... -- ILoWord
   * ... this.rest.levelListHelp2() ... -- boolean
   * ... this.rest.gameOverCheckHelper1() ... -- boolean
   * ... this.rest.gameOverCheckHelper2() ... -- boolean
   * Parameters
   * letter -- String
   * word -- IWord
   * worldScene -- WorldScene
   * key -- String
   */

  // returns a scene with all of the words from a list are displayed
  public WorldScene draw(WorldScene worldScene) {
    return this.rest.draw(this.first.draw(worldScene));
  }

  // produces an ILoWord where any IWords that are empty are filtered out
  public ILoWord filterOutEmpties() {
    if (this.first.filterOutHelp()) {
      return this.rest.filterOutEmpties();
    } else {
      return new ConsLoWord(this.first, this.rest.filterOutEmpties());
    }
  }

  // takes in a String of length 1 and produces an ILoWord where any active words
  // in this
  // ILoWord are reduced by removing the first letter only if the given
  // string matches the first letter.
  public ILoWord checkAndReduce(String letter) {
    if (this.first.reduceHelper(letter)) {
      return new ConsLoWord(this.first.reduce(letter), this.rest); 
    } else {
      return new ConsLoWord(this.first, this.rest.checkAndReduce(letter));
    }
  }

  // Updates the y-coordinates of active words in the list
  //creates a new word after certain time
  //updates level
  public ILoWord onTick() {
    return new ConsLoWord(this.first.onTick(), this.rest.onTick());
  }

  //makes a new list with the added word at the end
  public ILoWord listMaker(IWord word) {
    return new ConsLoWord(this.first, this.rest.listMaker(word));
  }

  //returns true if the y value of the first word is the same as the scene height
  public boolean gameOverCheck() {
    return this.rest.gameOverCheckHelper1();
  }

  //returns a boolean based on gameOverCheckHelper2
  public boolean gameOverCheckHelper1() {
    return this.rest.gameOverCheckHelper2();
  }

  //returns a boolean based on gameOverCheckHelp if the y is the same as scene height
  public boolean gameOverCheckHelper2() {
    return this.first.gameOverCheckHelp();
  }

  //returns a boolean if there is an active word that has the same first letter as the inputed word
  public boolean activeScoreChecker(String letter) {
    if (this.first.activeLetterChecker(letter)) {
      return true;
    } else {
      return this.rest.activeScoreChecker(letter);
    }
  }

  //returns true if any inactive words in the list have the same first letter as input letter
  public boolean scoreChecker(String letter) {
    if (this.first.reduceHelper(letter)) {
      return true;
    } else {
      return this.rest.scoreChecker(letter);
    }
  }

  //returns a list where the inputted letter is taken off the active word if there is an active 
  public ILoWord checkActiveAndReduce(String letter) {
    if (this.activeListChecker()) {
      return reduceActive(letter);
    } else {
      return this.checkAndReduce(letter);
    }
  }

  //checks if there is an active in the list and returns true
  public boolean activeListChecker() {
    return (this.first.activeChecker() || this.rest.activeListChecker());
  }

  //makes a new list where the inputted letter is taken off the active word if they match
  public ILoWord reduceActive(String letter) {
    return new ConsLoWord(this.first.activeReducer(letter), this.rest.reduceActive(letter));
  }

  //creates a new list so the level and press tab message are displayed
  public ILoWord levelList(IWord word) {
    if (this.first.levelWordChecker() && this.rest.levelListHelp2()) {

      IWord pressTab = new LevelWord("Press tab to restart", 300, 520, 0.75);

      return new ConsLoWord(word, new ConsLoWord(pressTab, this.rest.levelListHelp()));
    } if (this.first.levelWordChecker()) {

      IWord pressTab = new LevelWord("Press tab to restart", 300, 520, 0.75);

      return new ConsLoWord(word, new ConsLoWord(pressTab, this.rest));
    } else {

      IWord pressTab = new LevelWord("Press tab to restart", 300, 520, 0.75);

      return new ConsLoWord(word, new ConsLoWord(pressTab, this));
    }
  }

  //returns the rest of the rest of the list
  public ILoWord levelListHelp() {
    return this.rest;
  }

  //returns boolean if the second item is a LevelWord
  public boolean levelListHelp2() {
    return (this.first.levelWordChecker());
  }

  //returns an integer based on where the active word is or if there is 
  //none the middle of the screen
  public int activeListX() {
    if (this.first.activeWordX() >= 0) {
      return this.first.activeWordX();
    } else {
      return this.rest.activeListX();
    }
  }
}


abstract class AWord implements IWord {
  String word;
  int x;
  int y;

  AWord(String word, int x, int y) {
    this.word = word;
    this.x = x;
    this.y = y;
  }

  AWord(String word, int x) {
    this.word = word;
    this.x = x;
    this.y = SCENE_HEIGHT;
  }

  /*
   * TEMPLATE
   * METHODS
   * ... this.filterOutHelp() ... -- boolean
   * ... this.reduce(String letter) ... -- IWord
   * ... this.reduceHelper(String Letter) ... -- boolean
   * ... this.gameOverCheckHelp() ... -- boolean
   * ... this.activeChecker() ... -- boolean
   * ... this.activeReducer(String letter) ... -- IWord
   * ... this.activeLetterChecker(String letter) ... -- boolean
   * ... this.activeWordX() ... -- int
   * ... this.levelWordChecker() ... -- boolean
   * METHODS OF FIELDS
   * ... this.word.filterOutHelp() ... -- boolean
   * ... this.word.reduce(String letter) ... -- IWord
   * ... this.word.reduceHelper(String Letter) ... -- boolean
   * ... this.word.gameOverCheckHelp() ... -- boolean
   * ... this.word.activeChecker() ... -- boolean
   * ... this.word.activeReducer(String letter) ... -- IWord
   * ... this.word.activeLetterChecker(String letter) ... -- boolean
   * ... this.word.activeWordX() ... -- int
   * ... this.word.levelWordChecker() ... -- boolean
   * ... this.x.filterOutHelp() ... -- boolean
   * ... this.x.reduce(String letter) ... -- IWord
   * ... this.x.reduceHelper(String Letter) ... -- boolean
   * ... this.x.gameOverCheckHelp() ... -- boolean
   * ... this.x.activeChecker() ... -- boolean
   * ... this.x.activeReducer(String letter) ... -- IWord
   * ... this.x.activeLetterChecker(String letter) ... -- boolean
   * ... this.x.activeWordX() ... -- int
   * ... this.x.levelWordChecker() ... -- boolean
   * ... this.y.filterOutHelp() ... -- boolean
   * ... this.y.reduce(String letter) ... -- IWord
   * ... this.y.reduceHelper(String Letter) ... -- boolean
   * ... this.y.gameOverCheckHelp() ... -- boolean
   * ... this.y.activeChecker() ... -- boolean
   * ... this.y.activeReducer(String letter) ... -- IWord
   * ... this.y.activeLetterChecker(String letter) ... -- boolean
   * ... this.y.activeWordX() ... -- int
   * ... this.y.levelWordChecker() ... -- boolean
   * Parameters
   * letter -- String
   * w -- WorldScene
   */

  // returns a scene with all of the words from a list are displayed
  public abstract WorldScene draw(WorldScene w);

  // checks if a word is empty
  public boolean filterOutHelp() {
    return this.word.equals("");
  }

  // takes away the first letter of the string if it matches the inputted letter
  public IWord reduce(String letter) {
    if (this.word.startsWith(letter)) {
      return new ActiveWord(this.word.substring(1), this.x, this.y);
    } else {
      return this;
    }
  }

  //returns a boolean if the first letter of an inactive word is the same as input letter
  public boolean reduceHelper(String letter) {
    return (this.word.startsWith(letter));
  }

  //returns a boolean if the y value of the word is the same as scene height
  public boolean gameOverCheckHelp() {
    return this.y == SCENE_HEIGHT;
  }

  //checks if a word is actve an
  public boolean activeChecker() {
    return false;
  }

  //takes first letter off a word and makes it active
  public IWord activeReducer(String letter) {
    return this;
  }

  //checks if an active word has the same first letter as input letter
  public boolean activeLetterChecker(String letter) {
    return false;
  }

  //returns the x value of an active word or half scene width
  public int activeWordX() {
    return -1;
  }

  //checks if the inputted word is a LevelWord
  public boolean levelWordChecker() {
    return false;
  }

}

class LevelWord extends AWord {

  double size;
  
  LevelWord(String word, int x, int y, double size) {

    super(word, x, y);
    this.size = size;
  }

  /*
   * TEMPLATE
   * METHODS
   * ... this.filterOutHelp() ... -- boolean
   * ... this.reduceHelper(String letter) ... -- boolean
   * ... this.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.onTick()... -- IWord
   * METHODS OF FIELDS
   * ... this.word.filterOutHelp() ... -- boolean
   * ... this.word.reduceHelper(String letter) ... -- boolean
   * ... this.word.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.word.onTick()... -- IWord
   * ... this.x.filterOutHelp() ... -- boolean
   * ... this.x.reduceHelper(String letter) ... -- boolean
   * ... this.x.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.x.onTick()... -- IWord
   * ... this.y.filterOutHelp() ... -- boolean
   * ... this.y.reduceHelper(String letter) ... -- boolean
   * ... this.y.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.y.onTick()... -- IWord
   * ... this.size.filterOutHelp() ... -- boolean
   * ... this.size.reduceHelper(String letter) ... -- boolean
   * ... this.size.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.size.onTick()... -- IWord
   * PARAMETERS
   * letter -- String
   * worldScene -- WorldScene
   */

  // checks if a word is empty
  public boolean filterOutHelp() {
    return false;
  }

  // Updates the y-coordinates of active words in the list
  //creates a new word after certain time
  //updates level
  public IWord onTick() {
    return this;
  }

  //returns a boolean if the first letter of an inactive word is the same as input letter
  public boolean reduceHelper(String letter) {
    return false;
  }

  // returns a scene with all of the words from a list are displayed
  public WorldScene draw(WorldScene worldScene) {
    return worldScene.placeImageXY(new TextImage(this.word, FONT_SIZE * size,
        FontStyle.BOLD, Color.gray), this.x, this.y);
  }

  //checks if the inputted word is a LevelWord
  public boolean levelWordChecker() {
    return true;
  }
}

class ActiveWord extends AWord {

  ActiveWord(String word, int x, int y) {
    super(word, x, y);
  }

  /*
   * TEMPLATE
   * METHODS
   * ... this.reduce(String letter) ... -- IWord
   * ... this.activeChcker() ... -- boolean
   * ... this.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.onTick()... -- IWord
   * ... this.activeReducer(String letter) ... -- IWord
   * ... this.activeLetterChecker(String letter) ... -- boolean
   * ... this.activeWordX() ... -- int
   * METHODS OF FIELDS
   * ... this.word.reduce(String letter) ... -- IWord
   * ... this.word.activeChcker() ... -- boolean
   * ... this.word.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.word.onTick()... -- IWord
   * ... this.word.activeReducer(String letter) ... -- IWord
   * ... this.word.activeLetterChecker(String letter) ... -- boolean
   * ... this.word.activeWordX() ... -- int
   * ... this.x.size.onTick()... -- IWord
   * ... this.x.reduce(String letter) ... -- IWord
   * ... this.x.activeChcker() ... -- boolean
   * ... this.x.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.x.onTick()... -- IWord
   * ... this.x.activeReducer(String letter) ... -- IWord
   * ... this.x.activeLetterChecker(String letter) ... -- boolean
   * ... this.x.activeWordX() ... -- int
   * ... this.y.size.onTick()... -- IWord
   * ... this.y.reduce(String letter) ... -- IWord
   * ... this.y.activeChcker() ... -- boolean
   * ... this.y.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.y.onTick()... -- IWord
   * ... this.y.activeReducer(String letter) ... -- IWord
   * ... this.y.activeLetterChecker(String letter) ... -- boolean
   * ... this.y.activeWordX() ... -- int
   * ... this.y.size.onTick()... -- IWord
   * PARAMETERS
   * letter -- String
   * worldScene -- WorldScene
   */

  // takes away the first letter of the string if it matches the inputted letter
  public IWord reduce(String letter) {
    if (this.word.startsWith(letter)) {
      return new ActiveWord(this.word.substring(1), this.x, this.y);
    } else {
      return this;
    }
  }

  // returns a scene with all of the words from a list are displayed
  public WorldScene draw(WorldScene worldScene) {
    return worldScene.placeImageXY(new TextImage(this.word, FONT_SIZE,
        FontStyle.REGULAR, Color.orange), this.x, this.y);
  }

  // Updates the y-coordinates of active words in the list
  //creates a new word after certain time
  //updates level
  public IWord onTick() {
    return new ActiveWord(word, x, y + 1);    
  }

  //checks if a word is active an
  public boolean activeChecker() {
    return true;
  }

  //takes first letter off a word and makes it active
  public IWord activeReducer(String letter) {
    if (this.word.startsWith(letter)) {
      return new ActiveWord(this.word.substring(1), this.x, this.y);
    } else {
      return this;
    }
  }

  //checks if an active word has the same first letter as input letter
  public boolean activeLetterChecker(String letter) {
    return this.word.startsWith(letter);
  }

  //returns the x value of an active word or half scene width
  public int activeWordX() {
    return this.x;
  }

}

class InactiveWord extends AWord {

  InactiveWord(String word, int x, int y) {
    super(word, x, y);
  }

  /*
   * TEMPLATE
   * METHODS
   * ... this.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.onTick()... -- IWord
   * METHODS OF FIELDS
   * ... this.word.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.word.onTick()... -- IWord
   * ... this.x.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.x.onTick()... -- IWord
   * ... this.y.draw(WorldScene worldScene) ... -- WorldScene
   * ... this.y.onTick()... -- IWord
   * PARAMETERS
   * worldScene -- WorldScene
   */






  // returns a scene with all of the words from a list are displayed
  public WorldScene draw(WorldScene worldScene) {
    return worldScene.placeImageXY(new TextImage(this.word, FONT_SIZE, FontStyle.REGULAR,
        Color.gray), this.x, this.y);
  }

  // Updates the y-coordinates of active words in the list
  //creates a new word after certain time
  //updates level
  public IWord onTick() {
    return new InactiveWord(word, x, y + 1);    
  }

}

class ZTypeWorld extends World {
  ILoWord words;
  int ticks;
  int score;
  Random rand;
  Random rand2;


  ZTypeWorld(ILoWord words, int ticks, int score, Random rand, Random rand2) {
    this.words = words;
    this.ticks = ticks;
    this.score = score;
    this.rand = rand;
    this.rand2 = rand2;
  }

  ZTypeWorld(ILoWord words, int ticks, int score) {
    this(words, ticks, score, new Random(), new Random());
  }



  /*
   * TEMPLATE
   * METHODS
   * ... this.makeScene() ... -- WorldScene
   * ... this.onTick() ... -- World
   * ... this.levelFinder() ... -- IWord
   * ... this.levelWorldScene() ... -- WorldScene
   * ... this.levelChecker() ... -- int
   * ... this.onKeyEvent(String key) ... -- World
   * ... this.lastScene(String str) ... -- WorldScene
   * METHODS OF FIELDS
   * ... this.words.makeScene() ... -- WorldScene
   * ... this.words.onTick() ... -- World
   * ... this.words.levelFinder() ... -- IWord
   * ... this.words.levelWorldScene() ... -- WorldScene
   * ... this.words.levelChecker() ... -- int
   * ... this.words.onKeyEvent(String key) ... -- World
   * ... this.words.lastScene(String str) ... -- WorldScene
   * ... this.ticks.makeScene() ... -- WorldScene
   * ... this.ticks.onTick() ... -- World
   * ... this.ticks.levelFinder() ... -- IWord
   * ... this.ticks.levelWorldScene() ... -- WorldScene
   * ... this.ticks.levelChecker() ... -- int
   * ... this.ticks.onKeyEvent(String key) ... -- World
   * ... this.ticks.lastScene(String str) ... -- WorldScene
   * ... this.score.makeScene() ... -- WorldScene
   * ... this.score.onTick() ... -- World
   * ... this.score.levelFinder() ... -- IWord
   * ... this.score.levelWorldScene() ... -- WorldScene
   * ... this.score.levelChecker() ... -- int
   * ... this.score.onKeyEvent(String key) ... -- World
   * ... this.score.lastScene(String str) ... -- WorldScene
   * ... this.rand.makeScene() ... -- WorldScene
   * ... this.rand.onTick() ... -- World
   * ... this.rand.levelFinder() ... -- IWord
   * ... this.rand.levelWorldScene() ... -- WorldScene
   * ... this.rand.levelChecker() ... -- int
   * ... this.rand.onKeyEvent(String key) ... -- World
   * ... this.rand.lastScene(String str) ... -- WorldScene
   * ... this.rand2.makeScene() ... -- WorldScene
   * ... this.rand2.onTick() ... -- World
   * ... this.rand2.levelFinder() ... -- IWord
   * ... this.rand2.levelWorldScene() ... -- WorldScene
   * ... this.rand2.levelChecker() ... -- int
   * ... this.rand2.onKeyEvent(String key) ... -- World
   * ... this.rand2.lastScene(String str) ... -- WorldScene
   * PARAMETERS
   * key -- String
   * str -- String
   */

  // creates the scene for the game
  public WorldScene makeScene() {
    // Create a WorldScene with a different background color (e.g., Color.WHITE)
    WorldScene scene = this.levelWorldScene().placeImageXY(new EquilateralTriangleImage(15,
        OutlineMode.OUTLINE, Color.red), this.words.activeListX(), 590)
        .placeImageXY(new EquilateralTriangleImage(13,
            OutlineMode.SOLID, Color.white), this.words.activeListX(), 590);

    // Draw the words on the scene
    return this.words.draw(scene);
  }




  // Updates the y-coordinates of active words in the list
  //creates a new word after certain time
  //updates level
  public World onTick() {
    if (this.words.gameOverCheck()) {
      return endOfWorld("GAME OVER! "
          + "Your score is: " + String.valueOf(score));
    }

    if (this.ticks % this.levelChecker() == 0) {

      IWord newWord = new InactiveWord(new Utils(rand).callAcc(), 
          (this.rand2.nextInt(300)) + 50, 0);
      ILoWord newWords = this.words.listMaker(newWord);
      ILoWord level = newWords.levelList(this.levelFinder());

      return new ZTypeWorld(level.onTick(), ticks + 1, score);
    } else {
      return new ZTypeWorld(this.words.onTick(), ticks + 1, score);
    }
  }


  //checks if the score is less than a certain number and 
  //then it returns the corresponding level
  public IWord levelFinder() {
    if (this.score < 100) {
      return new LevelWord("LEVEL 1", 300, 500, 1.5) ; } 
    if (this.score < 200) {
      return new LevelWord("LEVEL 2", 300, 500, 1.5) ; } 
    if (this.score < 300) {
      return new LevelWord("LEVEL 3", 300, 500, 1.5) ; } 
    if (this.score < 400) {
      return new LevelWord("LEVEL 4", 300, 500, 1.5) ; } 
    if (this.score < 500) {
      return new LevelWord("LEVEL 5", 300, 500, 1.5) ; } 
    if (this.score < 600) {
      return new LevelWord("LEVEL 6", 300, 500, 1.5) ; } 
    if (this.score < 700) {
      return new LevelWord("LEVEL 7", 300, 500, 1.5) ; } 
    if (this.score < 800) {
      return new LevelWord("LEVEL 8", 300, 500, 1.5) ; } 
    if (this.score < 900) {
      return new LevelWord("LEVEL 9", 300, 500, 1.5) ; } 
    else {
      return new LevelWord("FINAL LEVEL", 300, 500, 1.5) ; } 

  }

  //changes the scene based on the level
  public WorldScene levelWorldScene() {
    if (this.score < 100) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.white), 200, 300); } 
    if (this.score < 200) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.yellow), 200, 300); } 
    if (this.score < 300) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.yellow), 200, 300); } 
    if (this.score < 400) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.cyan), 200, 300); } 
    if (this.score < 500) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.cyan), 200, 300); } 
    if (this.score < 600) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.blue), 200, 300); } 
    if (this.score < 700) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.blue), 200, 300); } 
    if (this.score < 800) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.red), 200, 300); } 
    if (this.score < 900) {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.red), 200, 300); } 
    else {
      return new WorldScene(400, 600).placeImageXY(
          new RectangleImage(400, 600, OutlineMode.SOLID, Color.black), 200, 300); } 

  }


  //checks what level the user is on
  public int levelChecker() {
    if (this.score < 100) { 
      return 100 ; } 
    if (this.score < 200) { 
      return 90 ; } 
    if (this.score < 300) { 
      return 80 ; } 
    if (this.score < 400) { 
      return 70 ; } 
    if (this.score < 500) { 
      return 60 ; } 
    if (this.score < 600) { 
      return 50 ; } 
    if (this.score < 700) { 
      return 45 ; } 
    if (this.score < 800) { 
      return 40 ; } 
    if (this.score < 900) { 
      return 35 ; } 
    else { 
      return 30 ; } 

  }

  //takes in a key event and runs the corresponding if statement
  public World onKeyEvent(String key) {
    if (key.equals("tab")) {
      return new ZTypeWorld(new MtLoWord(), 0, 0);
    }
    if (this.words.activeScoreChecker(key)) {
      return new ZTypeWorld(this.words.checkActiveAndReduce(key).filterOutEmpties(), 
          ticks, score + 10);
    }
    if (this.words.scoreChecker(key) && !this.words.activeListChecker()) {
      return new ZTypeWorld(this.words.checkActiveAndReduce(key).filterOutEmpties(), 
          ticks, score + 10);
    } else {
      return new ZTypeWorld(this.words.checkActiveAndReduce(key).filterOutEmpties(), ticks, score);
    }
  }

  //portrays the game over scene
  public WorldScene lastScene(String str) {
    return new WorldScene(400, 600)
        .placeImageXY(new TextImage(str, 25, FontStyle.REGULAR, Color.black),
            400 / 2, 600 / 2);
  }

}



class Utils {
  Random rand;

  Utils(Random rand) {
    this.rand = rand;
  }

  Utils() {
    this(new Random());
  }

  /*
   * TEMPLATE
   * this.rand ... -- ILoWord
   * Methods:
   * this.numToString(int num) ... -- String
   * this.stringAcc(String str, int num, int topend) ... -- String
   * this.callAcc() ... -- String
   * this.makeInt(int) ... -- int
   * 
   * Methods of Fields:
   * this.rand.numToString ... -- String
   * this.rand.stringAcc ... -- String
   * this.rand.callAcc ... -- String
   * this.rand.makeInt(int) ... -- int
   * 
   * Parameters:
   * num -- int
   * topend -- int
   * str -- String
   */

  // converts the latter to a corresponding number in the alphabet string
  String numToString(int num) {
    return "abcdefghijklmnopqrstuvwxyz".substring(num, num + 1);
  }

  // accumulates the length of the string so that it creates a string if 6 letters
  String stringAcc(String str, int num, int topend) {
    if (num >= 0 && num < topend) {
      return (str + stringAcc(numToString(this.rand.nextInt(26)), num + 1, topend));
    } else {
      return str;
    }
  }

  // calls stringAcc to create a string of 6 letters
  String callAcc() {
    return stringAcc("", 0, (this.rand.nextInt(6) + 4));
  }

  int makeInt() {
    return (this.rand.nextInt(300)) + 50;
  }
}

class AllExamples {

  Random rand;

  AllExamples() {
    this(new Random());
  }

  AllExamples(Random rand) {
    this.rand = rand;
  }

  IWord random = new InactiveWord(new Utils(new Random(75)).callAcc(), 
      (new Utils(new Random(75)).makeInt()), 1);

  IWord endShape = new ActiveWord("circle", 20, 600);

  // an empty list
  ILoWord mtLoWord = new MtLoWord();


  ILoWord endList = new ConsLoWord(this.endShape, 
      new ConsLoWord(this.circleA, this.mtLoWord));
  // a list with 1 word
  IWord circleI = new InactiveWord("circle", 3, 4);
  IWord circleA = new ActiveWord("circle", 2, 2);
  IWord circleACase = new ActiveWord("Circle", 2, 4);
  ILoWord list1 = new ConsLoWord(this.circleA, this.mtLoWord);

  // a list with 2 words
  IWord triangleA = new ActiveWord("triangle", 3, 4);
  ILoWord list2 = new ConsLoWord(this.triangleA,
      new ConsLoWord(this.circleA, this.mtLoWord));

  ILoWord sortedList2 = new ConsLoWord(this.circleA, new ConsLoWord(this.triangleA, this.mtLoWord));
  // a list with 3 words
  IWord rectangleI = new InactiveWord("rectangle", 1, 2);
  ILoWord list3 = new ConsLoWord(this.rectangleI,
      new ConsLoWord(this.triangleA,
          new ConsLoWord(this.circleA, this.mtLoWord)));

  // a list of inactive words
  ILoWord listInactive = new ConsLoWord(this.rectangleI,
      new ConsLoWord(this.square, this.mtLoWord));

  // an inactive word
  IWord square = new InactiveWord("square", 3, 4);

  // a sorted by alphabetical order list with 3 words
  ILoWord sortedList = new ConsLoWord(this.circleA,
      new ConsLoWord(this.rectangleI,
          new ConsLoWord(this.triangleA, this.mtLoWord)));

  // a list with an empty string
  IWord mtWord = new ActiveWord("", 3, 4);
  ILoWord mtList = new ConsLoWord(this.mtWord, this.list3);

  // a list with 2 of the same word
  ILoWord twoSameList = new ConsLoWord(this.triangleA,
      new ConsLoWord(this.triangleA, this.list1));

  // case insensitive list
  IWord caseTriangle = new ActiveWord("Triangle", 5, 6);
  ILoWord caseList = new ConsLoWord(this.caseTriangle, this.list2);

  // a list with only empties
  ILoWord mtOnlyList = new ConsLoWord(this.mtWord,
      new ConsLoWord(this.mtWord, this.mtLoWord));

  // a list with 3 inactive words, 3 active words, 2 empty strings,
  // a duplicate string, and an upper case active word
  ILoWord edgeCaseList = new ConsLoWord(this.circleA, new ConsLoWord(this.circleI,
      new ConsLoWord(this.circleACase, new ConsLoWord(this.triangleA,
          new ConsLoWord(this.rectangleI, new ConsLoWord(this.mtWord,
              new ConsLoWord(this.mtWord, this.mtLoWord)))))));

  ILoWord edgeCaseListSorted = new ConsLoWord(this.mtWord, new ConsLoWord(this.mtWord,
      new ConsLoWord(this.circleA, new ConsLoWord(this.circleI,
          new ConsLoWord(this.circleACase, new ConsLoWord(this.rectangleI,
              new ConsLoWord(this.triangleA, this.mtLoWord)))))));

  IWord a = new ActiveWord("a", 5, 6);
  ILoWord listA = new ConsLoWord(this.a, this.mtLoWord);

  AWord finalMessage = new InactiveWord("Game Over, Your Score is:", 400 / 2, 600 / 2);

  AWord word1 = new InactiveWord("adafaf", 100, 1);
  AWord word2 = new InactiveWord("awdwed", 2, 3);
  AWord word3 = new InactiveWord("oiaufj", 5, 5);
  AWord word4 = new InactiveWord("lekdef", 6, 1);

  AWord word5 = new InactiveWord("asdfgh", 2, 9);
  AWord word6 = new InactiveWord("helloo", 3, 8);
  AWord word7 = new InactiveWord("ooppss", 4, 7);
  AWord word8 = new InactiveWord("lollol", 5, 6);

  ILoWord mt = new MtLoWord();

  ILoWord list1a = new ConsLoWord(this.word1, this.mt);

  ILoWord list2a = new ConsLoWord(this.word2, new ConsLoWord(this.word4,
      new ConsLoWord(this.word3, new MtLoWord())));

  ILoWord list3a = new ConsLoWord(this.word5, new ConsLoWord(this.word6, new ConsLoWord(this.word7,
      new ConsLoWord(this.word8, new MtLoWord()))));

  ILoWord list4 = new ConsLoWord(this.word7, new ConsLoWord(this.word8, new MtLoWord()));

  ILoWord list1rand = new ConsLoWord(new ActiveWord("circle", 2, 3), 
      new ConsLoWord(this.random, this.mtLoWord));



  WorldScene ws1 = new WorldScene(400, 600);

  ZTypeWorld mtWorld = new ZTypeWorld(this.mt, 0, 300);

  ZTypeWorld list1World = new ZTypeWorld(this.list1, 0, 0, (new Random(75)), (new Random(75)));

  ZTypeWorld randomWorld = new ZTypeWorld(this.list1rand, 0, 0, (new Random(75)), (new Random(75)));

  ILoWord gameOverList1 = new ConsLoWord(new InactiveWord("circle", 400, 600), new MtLoWord());
  ILoWord gameOverList2 = new ConsLoWord(new ActiveWord("circle", 4, 2), new MtLoWord());
  ILoWord gameOverList3 = new ConsLoWord(new LevelWord("circle", 400, 600, 0.5), new MtLoWord());

  ILoWord levelList = new ConsLoWord(new LevelWord("level 1", 0 , 0, 0.5), 
      new ConsLoWord(circleA, new MtLoWord()));

  ILoWord levelList2 = new ConsLoWord(new LevelWord("level 1", 0 , 0, 0.5), 
      new ConsLoWord(new ActiveWord("circle", 400, 600), new MtLoWord()));

  ILoWord levelList3 = new ConsLoWord(new LevelWord("level 1", 0 , 0, 0.5), 
      new ConsLoWord(new InactiveWord("circle", 400, 600), new MtLoWord()));

  boolean testNumToString(Tester t) {
    return t.checkExpect(new Utils(new Random(0)).numToString(0), "a")
        &&
        t.checkExpect(new Utils(new Random(7)).numToString(7), "h")
        &&
        t.checkExpect(new Utils(new Random(4)).numToString(4), "e");
  }

  boolean testStringAcc(Tester t) {
    return t.checkExpect(new Utils(new Random(0)).stringAcc("", 0, 6), "ssxvnj")

        && t.checkExpect(new Utils(new Random(4)).stringAcc("agdp", 4, 6), "agdpqs")

        && t.checkExpect(new Utils(new Random(2)).stringAcc("xy", 2, 6), "xysgav")

        && t.checkExpect(new Utils(new Random(75)).stringAcc("hola", 4, 6), "holamm")

        && t.checkExpect(new Utils(new Random(1234567890)).stringAcc("", 0, 6), "dsfcpi");
  }

  boolean testCallAcc(Tester t) {
    return t.checkExpect(new Utils(new Random(10)).callAcc(), "glyesfm")

        && t.checkExpect(new Utils(new Random(25)).callAcc(), "yzezkzjqo")

        && t.checkExpect(new Utils(new Random(2)).callAcc(), "gavreizn")

        && t.checkExpect(new Utils(new Random(3)).callAcc(), "mmhquv")

        && t.checkExpect(new Utils(new Random(75)).callAcc(), "mvmv")

        && t.checkExpect(new Utils(new Random(1234567890)).callAcc(), "sfcpipc");  
  }

  boolean testBigBang(Tester t) {

    ZTypeWorld world = new ZTypeWorld(this.mt, 0, 0);
    int worldWidth = 400;
    int worldHeight = 600;
    double tickRate = 0.03;
    return world.bigBang(worldWidth, worldHeight, tickRate);

  }

  boolean testListMaker(Tester t) {
    return
        // adding an active circle to a list with an active circle
        t.checkExpect(this.list1.listMaker(circleA),
            new ConsLoWord(this.circleA, new ConsLoWord(this.circleA,
                this.mtLoWord)))
        &&
        // adding an inactive rectangle to a list with 2 active words
        t.checkExpect(this.list2.listMaker(rectangleI),
            new ConsLoWord(this.triangleA, new ConsLoWord(this.circleA,
                new ConsLoWord(this.rectangleI, this.mtLoWord))))
        &&
        // adding a square to a list with 3 words
        t.checkExpect(this.list3.listMaker(square), 
            new ConsLoWord(this.rectangleI,
                new ConsLoWord(this.triangleA,
                    new ConsLoWord(this.circleA,
                        new ConsLoWord(this.square, this.mtLoWord)))))
        &&
        // adding an inactive circle to a list with only empties
        t.checkExpect(this.mtOnlyList.listMaker(circleI), 
            new ConsLoWord(this.mtWord,
                new ConsLoWord(this.mtWord,
                    new ConsLoWord(this.circleI, this.mtLoWord))));
  }

  boolean testCheckAndReduce(Tester t) {
    return 
        //a list with 3 words that does not contain the given string as the first 
        //letter in any of the words
        t.checkExpect(this.list3.checkAndReduce("a"), this.list3)
        &&
        //a list with 3 words where the given letter matches the first letter of one of the words
        t.checkExpect(this.list3.checkAndReduce("c"), 
            new ConsLoWord(this.rectangleI, new ConsLoWord(this.triangleA, 
                new ConsLoWord(new ActiveWord("ircle", 2, 2), this.mtLoWord))))
        &&
        //a list with 2 words where the given letter matches the first letter of one of the words
        t.checkExpect(this.list2.checkAndReduce("t"), 
            new ConsLoWord(new ActiveWord("riangle", 3, 4), 
                new ConsLoWord(this.circleA, this.mtLoWord)))
        &&
        //a list with 2 of the same words so the given letter matches two words
        t.checkExpect(this.twoSameList.checkAndReduce("t"), 
            new ConsLoWord(new ActiveWord("riangle", 3, 4), 
                new ConsLoWord(new ActiveWord("triangle", 3, 4), this.list1)))
        &&
        //a list that covers all edge cases with a letter that matches two active words, 
        //one being upper case, and one inactive word
        t.checkExpect(this.edgeCaseList.checkAndReduce("c"), 
            new ConsLoWord(new ActiveWord("ircle", 2, 2), new ConsLoWord(this.circleI, 
                new ConsLoWord(this.circleACase, new ConsLoWord(this.triangleA, 
                    new ConsLoWord(this.rectangleI, new ConsLoWord(this.mtWord, 
                        new ConsLoWord(this.mtWord, this.mtLoWord))))))))
        &&
        //a list with a word that is only one letter
        t.checkExpect(this.listA.checkAndReduce("a"), 
            new ConsLoWord(new ActiveWord("", 5, 6), this.mtLoWord))
        &&
        //an empty list
        t.checkExpect(this.mtOnlyList.checkAndReduce("a"), this.mtOnlyList)
        &&
        //
        t.checkExpect(this.edgeCaseList.checkAndReduce("C"), 
            new ConsLoWord(this.circleA, new ConsLoWord(this.circleI, 
                new ConsLoWord(new ActiveWord("ircle", 2, 4), new ConsLoWord(this.triangleA, 
                    new ConsLoWord(this.rectangleI, new ConsLoWord(this.mtWord, 
                        new ConsLoWord(this.mtWord, this.mtLoWord))))))));
  }

  boolean testGameOverCheckHelp(Tester t) {
    return 
        //checking an active word
        t.checkExpect(this.circleA.gameOverCheckHelp(), false)
        &&
        //checking an active word at the bottom of the scene
        t.checkExpect(this.endShape.gameOverCheckHelp(), true);
  }

  boolean testGameOverCheck(Tester t) {
    return 
        //checking a list with 2 words
        t.checkExpect(this.list2.gameOverCheck(), false)
        &&
        //checking a list with one word
        t.checkExpect(this.endList.gameOverCheck(), false);
  }

  boolean testScoreChecker(Tester t) {
    return 
        //checking a list with 3 words and the incorrect string
        t.checkExpect(this.list3.scoreChecker("a"), false)
        &&
        //checking a list with 3 words and the correct string
        t.checkExpect(this.list3.scoreChecker("c"), true);
  }

  boolean testActiveListChecker(Tester t) {
    return 
        //checking a list with active and inactive words
        t.checkExpect(this.list2.activeListChecker(), true)
        &&
        t.checkExpect(this.mtOnlyList.activeListChecker(), true);
  }

  boolean testReduceActive(Tester t) {
    return 
        //checking a list with only actives and reducing one of them
        t.checkExpect(this.list2.reduceActive("t"), 
            new ConsLoWord(new ActiveWord("riangle", 3, 4),
                new ConsLoWord(this.circleA, this.mtLoWord)))
        &&
        //checking a list with both active and inactive words and 
        //trying to reduce the inactive
        t.checkExpect(this.list3.reduceActive("r"), 
            new ConsLoWord(this.rectangleI,
                new ConsLoWord(this.triangleA,
                    new ConsLoWord(this.circleA, this.mtLoWord))));
  }

  boolean testCheckActiveAndReduce(Tester t) {
    return 
        //testing a list with 2 words with the correct string
        t.checkExpect(this.list2.checkActiveAndReduce("t"), 
            new ConsLoWord(new ActiveWord("riangle", 3, 4),
                new ConsLoWord(this.circleA, this.mtLoWord)))
        &&
        //testing a list with 3 words with the correct string of 
        //an inactive shape
        t.checkExpect(this.list3.checkActiveAndReduce("r"), 
            new ConsLoWord(this.rectangleI,
                new ConsLoWord(this.triangleA,
                    new ConsLoWord(this.circleA, this.mtLoWord))));
  }

  boolean testFilterOutHelp(Tester t) {
    return
        //checking if mtWord is an empty string
        t.checkExpect(this.mtWord.filterOutHelp(), true)
        &&
        //checking is circleA is an empty string
        t.checkExpect(this.circleA.filterOutHelp(), false);
  }

  boolean testFilterOutEmpties(Tester t) {
    return 
        //a list with 3 words and one empty string 
        t.checkExpect(this.mtList.filterOutEmpties(), new ConsLoWord(this.rectangleI, 
            new ConsLoWord(this.triangleA, new ConsLoWord(this.circleA, this.mtLoWord))))
        &&
        //a list with no empties
        t.checkExpect(this.list3.filterOutEmpties(), this.list3)
        &&
        //a list with no empties
        t.checkExpect(this.list2.filterOutEmpties(), this.list2)
        &&
        // a list with no empties
        t.checkExpect(this.sortedList.filterOutEmpties(), this.sortedList)
        &&
        // a list with only empties
        t.checkExpect(this.mtOnlyList.filterOutEmpties(), this.mtLoWord)
        &&
        // the edge case list that contains two empties
        t.checkExpect(this.edgeCaseList.filterOutEmpties(), 
            new ConsLoWord(this.circleA, new ConsLoWord(this.circleI, 
                new ConsLoWord(this.circleACase, new ConsLoWord(this.triangleA, 
                    new ConsLoWord(this.rectangleI, this.mtLoWord))))));
  }

  boolean testActiveScoreChecker(Tester t) {
    return 
        //checking if a list with 2 words has the given string
        t.checkExpect(this.list2.activeScoreChecker("c"), true)
        &&
        //checking if a list with 2 words has the given string
        t.checkExpect(this.list2.activeScoreChecker("g"), false);
  }

  boolean testLevelWordChecker(Tester t) {
    //test for a levelword
    return t.checkExpect(new LevelWord("hola", 0, 0, 0.5).levelWordChecker(), true)
        //test for an InactiveWord
        && t.checkExpect(new InactiveWord("awfjfawjn", 1, 2).levelWordChecker(), false)
        //test for Active Word
        && t.checkExpect(new ActiveWord("awdaf", 7, 3).levelWordChecker(), false);
  }

  boolean testReduceHelper(Tester t) {
    return 
        //testing a word with the correct string
        t.checkExpect(this.circleA.reduceHelper("c"), true)
        &&
        //testing a word with the incorrect string
        t.checkExpect(this.circleA.reduceHelper("t"), false)
        &&
        //testing an empty word with the incorrect string
        t.checkExpect(this.mtWord.reduceHelper("d"), false);
  }

  boolean testActiveChecker(Tester t) {
    return 
        //testing an active word
        t.checkExpect(this.circleA.activeChecker(), true)
        &&
        //testing an inactive word
        t.checkExpect(this.rectangleI.activeChecker(), false);
  }

  boolean testActiveReducer(Tester t) {
    return 
        //checking an active word with the correct string
        t.checkExpect(this.circleA.activeReducer("c"), 
            new ActiveWord("ircle", 2 ,2))
        &&
        //checking an inactive word with the incorrect string
        t.checkExpect(this.rectangleI.activeReducer("c"), this.rectangleI)
        &&
        //checking an inactive word with the correct string
        t.checkExpect(this.rectangleI.activeReducer("r"), this.rectangleI);
  }

  boolean testActiveLetterChecker(Tester t) {
    return 
        //checking an active word with the correct string
        t.checkExpect(this.circleA.activeLetterChecker("c"), true)
        &&
        //checking an active word with the incorrect string
        t.checkExpect(this.circleA.activeLetterChecker("a"), false)
        &&
        //checking an inactive word with the correct string
        t.checkExpect(this.rectangleI.activeLetterChecker("r"), false)
        &&
        //checking an inactive word with the incorrect string
        t.checkExpect(this.rectangleI.activeLetterChecker("t"), false);
  }

  boolean testActiveListX(Tester t) {
    return 
        //checking an active list with 2 words
        t.checkExpect(this.list2.activeListX(), 3)
        &&
        //checking a list with one inactive word and 
        t.checkExpect(this.list3.activeListX(), 3);
  }

  boolean testActiveWordX(Tester t) {
    return 
        //testing an active word
        t.checkExpect(this.circleA.activeWordX(), 2)
        &&
        //testing an inactive rectangle
        t.checkExpect(this.rectangleI.activeWordX(), -1);
  }

  boolean testLevelList(Tester t) {
    return 
        //checking a list with 2 words with an active word
        t.checkExpect(this.list2.levelList(this.circleA), 
            new ConsLoWord(this.circleA, new ConsLoWord(
                new LevelWord("Press tab to restart", 300, 520, .75), 
                new ConsLoWord(this.triangleA,
                    new ConsLoWord(this.circleA, this.mtLoWord)))))
        &&
        //checking a list with 1 word with an active word
        t.checkExpect(this.list1.levelList(this.triangleA), 
            new ConsLoWord(this.triangleA, new ConsLoWord(
                new LevelWord("Press tab to restart", 300, 520, .75), 
                new ConsLoWord(this.circleA, this.mtLoWord))));
  }

  boolean testLevelFinder(Tester t) {
    return 
        //testing an empty world
        t.checkExpect(this.mtWorld.levelFinder(), 
            new LevelWord("LEVEL 4", 300, 500, 1.5))
        &&
        //testing a world with 1 word in it 
        t.checkExpect(this.list1World.levelFinder(), 
            new LevelWord("LEVEL 1", 300, 500, 1.5));
  }

  boolean testLevelWorldScene(Tester t) {
    return 
        //testing a world where the score is 300
        t.checkExpect(this.mtWorld.levelFinder(),  
            new LevelWord("LEVEL 4", 300, 500, 1.5))
        &&
        //testing a world where the score is 0
        t.checkExpect(this.list1World.levelFinder(), 
            new LevelWord("LEVEL 1", 300, 500, 1.5));
  }

  boolean testLevelChecker(Tester t) {
    return 
        //testing a world where the score is 300
        t.checkExpect(this.mtWorld.levelChecker(), 70)
        &&
        //testing a world where the score is 0
        t.checkExpect(this.list1World.levelChecker(), 100);
  }

  boolean testOnKeyEvent(Tester t) {
    return
        //testing a world with no words
        t.checkExpect(this.mtWorld.onKeyEvent("a"), 
            new ZTypeWorld(this.mtLoWord, 0, 300))
        &&
        //testing a world with one word and the correct string
        t.checkExpect(this.list1World.onKeyEvent("c"), 
            new ZTypeWorld(new ConsLoWord(
                new ActiveWord("ircle", 2, 2), this.mtLoWord), 0, 10));
  }

  boolean testLastScene(Tester t) {
    return 
        //testing a world with 1 word and a given string
        t.checkExpect(this.list1World.lastScene("ads"), 
            new WorldScene(400, 600).placeImageXY(
                new TextImage("ads", 25, FontStyle.REGULAR, Color.black),
                400 / 2, 600 / 2))
        &&
        //testing an empty world and a given string
        t.checkExpect(this.mtWorld.lastScene("asdv"), 
            new WorldScene(400, 600).placeImageXY(
                new TextImage("asdv", 25, FontStyle.REGULAR, Color.black),
                400 / 2, 600 / 2));
  }

  boolean testOnTick(Tester t) {
    return
        t.checkExpect(this.list1World.onTick(), 
            new ZTypeWorld(new ConsLoWord(new LevelWord("LEVEL 1", 300, 500, 1.5), 
                new ConsLoWord(new LevelWord("Press tab to restart", 300, 520, .75),
                    this.list1rand)), 1, 0));
  }

  boolean testMakeScene(Tester t) {
    return 
        t.checkExpect(this.mtWorld.makeScene(), new WorldScene(400, 600)
            .placeImageXY(new RectangleImage(400, 600, OutlineMode.SOLID, Color.cyan), 200, 300)
            .placeImageXY(new EquilateralTriangleImage(15,
                OutlineMode.OUTLINE, Color.red), 200, 590).placeImageXY(
                    new EquilateralTriangleImage(13,
                        OutlineMode.SOLID, Color.white), 200, 590));
  }

  boolean testGameOverCheckHelper1(Tester t) {
    //test for value below scene height
    return t.checkExpect(levelList.gameOverCheckHelper1(), false)
        //test for value below scene height and active word
        && t.checkExpect(levelList2.gameOverCheckHelper1(), true)
        //test for value below scene height and inactive word
        && t.checkExpect(levelList3.gameOverCheckHelper1(), true);
  }

  boolean testGameOverCheckHelper2(Tester t) {
    //test for value above scene height and active
    return t.checkExpect(gameOverList1.gameOverCheckHelper2(), true)
        //test for value below scene height 
        && t.checkExpect(gameOverList2.gameOverCheckHelper2(), false)
        //test for value above scene height and level
        && t.checkExpect(gameOverList3.gameOverCheckHelper2(), true);
  }

  boolean testLevelListHelp(Tester t) {
    //test for list with 4 items
    return t.checkExpect(list3.levelListHelp(),new ConsLoWord(this.triangleA,
        new ConsLoWord(this.circleA, this.mtLoWord)))
        //test for list of 3 items
        && t.checkExpect(list2.levelListHelp(), new ConsLoWord(this.circleA, this.mtLoWord))
        //test for mt list
        && t.checkExpect(mtLoWord.levelListHelp(), new MtLoWord());
  }

  boolean testLevelListHelp2(Tester t) {
    //test for list without level word
    return t.checkExpect(list3.levelListHelp2(), false)
        //test for list with level word first
        && t.checkExpect(new ConsLoWord(new LevelWord("awfjfawjn", 1, 2, 0.5), 
            new MtLoWord()).levelListHelp2(), true)
        //test for mt list
        && t.checkExpect(mtLoWord.levelListHelp2(), false);
  }

  boolean testReduce(Tester t) {
    return 
        //test for levelword
        t.checkExpect(new LevelWord("hola", 0, 0, 0.5).reduce("h"), 
            (new ActiveWord("ola", 0, 0)))
        //test for inactive with wrong letter
        && t.checkExpect(new InactiveWord("awfjfawjn", 1, 2).reduce("h"), 
            (new InactiveWord("awfjfawjn", 1, 2)))
        //test for inactive with right letter
        && t.checkExpect(new InactiveWord("awfjfawjn", 1, 2).reduce("a"), 
            (new ActiveWord("wfjfawjn", 1, 2)))
        //test for active with wrong letter
        && t.checkExpect(new ActiveWord("awdaf", 7, 3).reduce("h"), (new ActiveWord("awdaf", 7, 3)))
        //test for active with right letter
        && t.checkExpect(new ActiveWord("awdaf", 7, 3).reduce("a"), (new ActiveWord("wdaf", 7, 3)))
        //test for mt
        && t.checkExpect(this.mtWord, new ActiveWord("", 3, 4));
  }

  boolean testDraw(Tester t) {
    return 
        //drawing a list with 3 words
        t.checkExpect(this.list3.draw(ws1), new WorldScene(400, 600)
            .placeImageXY(new TextImage("rectangle", 20, FontStyle.REGULAR, Color.gray), 1, 2)
            .placeImageXY(new TextImage("triangle", 20, FontStyle.REGULAR, Color.orange), 3, 4)
            .placeImageXY(new TextImage("circle", 20, FontStyle.REGULAR, Color.orange), 2, 2));
  }
}