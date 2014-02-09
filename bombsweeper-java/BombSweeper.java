// SRM 156 DIV 2 - 600 points

public class BombSweeper {

	private int bomb;
	private int danger;
	private int total;
	
	public double winPercentage(String[] board) {
		total = board[0].length() * board.length;
		bomb = 0;
		danger = 0;
		
		char[][] charBoard = new char[board.length][board[0].length()];
		int i = 0;
		for(String singleBoard : board) {
			charBoard[i] = singleBoard.toCharArray();
			i++;
		}
		populateDangerColumn(charBoard);
		return calculateReturnPercent ();
	}

	private void populateDangerColumn(char[][] board) {
		for(int row = 0; row < board.length; row++ ) {
			for(int col = 0; col < board[row].length; col++ ) {
				if(board[row][col] == 'B') {

					populateDanger(board, row - 1, col - 1);					
					populateDanger(board, row - 1, col);
					populateDanger(board, row - 1, col + 1);
					
					populateDanger(board, row + 1, col + 1);
					populateDanger(board, row + 1, col);
					populateDanger(board, row + 1, col - 1);
					
					populateDanger(board, row, col - 1);
					populateDanger(board, row, col + 1);
					
					bomb++;
				}
			}
		}
	}
	
	private void populateDanger(char[][] board, int row, int col) {
		if(row < 0 || row >= board.length) {
			return;
		}
		if(col < 0 || col >= board[0].length) {
			return;
		}
		if(board[row][col] == '.'){
			board[row][col] = 'D';
			danger++;
		}
	}
	
	private double calculateReturnPercent () {
		// bomb + danger + good = total
		// bomb + good = total - danger
		// good = total - danger - bomb
		// return (total - danger - bomb) / (total - danger)
		return ((double) (total - danger - bomb) / (double) (total - danger)) * 100;
	}
}
