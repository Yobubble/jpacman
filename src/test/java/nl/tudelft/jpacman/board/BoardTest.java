package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A very simple test class for the Board class.
 */
class BoardTest {

    /**
     * Test the creation of a 1x1 board.
     */
    @Test
    void testBoardCreation() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isInstanceOf(BasicSquare.class);
    }

    /**
     * Test that creating a board with a null square fails with an AssertionError.
     */
    @Test
    void testBoardWithNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        assertThrows(AssertionError.class, () -> new Board(grid));
    }}
