import com.me.WordDictionary.Trie;
import com.me.WordDictionary.WordDictionary;
import org.junit.Assert;
import org.junit.Test;

public class WordDictionaryTest {


    WordDictionary wd;
    //Test to check when the File deos not Exist
    @Test(expected = NullPointerException.class)
    public void testReadTxtFile() throws Exception {

        wd = new WordDictionary();
        wd.readTxtFile("word.txt");
    }

    //Test to check when the Trie is not Initialized
    @Test(expected = NullPointerException.class)
    public void testGetTrieNotInitialized(){
        Trie trie = wd.getTrie();
    }

    //Test to check when the Trie is Initialized
    @Test
    public void testGetTrieWhenInitialized() throws Exception{
        wd = new WordDictionary();
        wd.readTxtFile("words.txt");
        Assert.assertNotNull(wd.getTrie());
    }
}
