import com.me.BoardGenerator.BoardGenerator;
import com.me.WordSearch.WordSearch;
import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {


    //Test to check in a predefined 4X4 Matrix the searching Function works
    @Test
    public void testWordSearch(){
        WordSearch ws = new WordSearch();
        char[][] board = new char[][] {
                {'m','b','q','p'},
                {'m','e','o','w'},
                {'t','x','n','o'},
                {'y','x','n','u'}
        };

        BoardGenerator.setBoard(board);
        String fileName = "words.txt";
        Assert.assertTrue(ws.wordSearch(fileName).contains("meow"));
        Assert.assertTrue(ws.wordSearch(fileName).contains("menu"));
        Assert.assertTrue(ws.wordSearch(fileName).contains("ox"));
    }
}
