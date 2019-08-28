import com.me.BoardGenerator.BoardGenerator;
import org.junit.Assert;
import org.junit.Test;

public class BoardGeneratorTest {



    //Test to check the board is a Square Matrix
    @Test(expected = IllegalArgumentException.class)
    public void testBoardSquare(){
        BoardGenerator bg = new BoardGenerator(4,5);
    }

    //Test to check that every element in the matrix is populated
    @Test
    public void testGenerateBoard(){
        BoardGenerator bg = new BoardGenerator(10,10);
        bg.generateBoard();
        char[][] board = bg.getBoard();

        for(int i = 0 ;i<board.length;i++)
            for(int j =0 ;j<board[i].length;j++){
                Assert.assertNotNull(board[i][j]);
            }

    }
}
