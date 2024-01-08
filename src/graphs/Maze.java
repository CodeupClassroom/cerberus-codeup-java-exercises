package graphs;

import java.util.Arrays;
import java.util.Stack;

public class Maze {
    /*
    [
    [1,1,1,1,1],
    [1,2,0,1,1],
    [1,1,0,1,1],
    [1,1,0,0,0],
    [1,1,1,1,3],
    ]
     */
    private int [][] maze = {
            {1,1,1,1,1},
            {1,2,0,1,1},
            {1,1,0,1,1},
            {1,1,0,0,0},
            {1,1,1,1,3},
    };

    public void solve() {
        Stack<Coords> s = new Stack<>();

        Coords start = new Coords(1, 1);
        s.push(start);

        while(!s.isEmpty()) {
            Coords c = s.pop();
            // look right
            if(c.col + 1 < maze[c.row].length && (maze[c.row][c.col + 1] == 0 || maze[c.row][c.col + 1] == 3)) {
                if(maze[c.row][c.col + 1] == 3) {
                    printMaze();
                    return;
                }
                pushNextCell(c.row, c.col + 1, s);

            } else if(c.row + 1 < maze.length && (maze[c.row + 1][c.col] == 0 || maze[c.row + 1][c.col] == 3)) {
                // check down
                if(maze[c.row + 1][c.col] == 3) {
                    printMaze();
                    return;
                }
                pushNextCell(c.row + 1, c.col, s);
            } else if(c.row - 1 >= 0 && (maze[c.row - 1][c.col] == 0 || maze[c.row - 1][c.col] == 3)) {
                // check up
                if(maze[c.row - 1][c.col] == 3) {
                    printMaze();
                    return;
                }
                pushNextCell(c.row - 1, c.col, s);
            } else if(c.col - 1 >= 0 && (maze[c.row][c.col - 1] == 0 || maze[c.row][c.col - 1] == 3)) {
                // check left
                if(maze[c.row][c.col - 1] == 3) {
                    printMaze();
                    return;
                }
                pushNextCell(c.row, c.col - 1, s);
            }
        }
    }

    private void pushNextCell(int row, int col, Stack<Coords> s) {
        Coords next = new Coords(row, col);
        // visit the next cell
        maze[row][col] = 9;
        s.push(next);
    }

    private void printMaze() {
        for (int i = 0; i < maze.length; i++) {
            System.out.println(Arrays.toString(maze[i]));
        }
    }
}

class Coords {
    public int row;
    public int col;

    public Coords(int r, int c) {
        this.row = r;
        this.col = c;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }


}