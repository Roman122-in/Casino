

This is a simple console-based slot machine simulation. The user inputs an initial balance (between 100 and 1000). The program generates a 3x3 grid of random numbers from 0 to 9. If any two consecutive numbers match either horizontally or vertically, it's a win. Otherwise, 100 is deducted from the balance. The game continues until the balance reaches zero or the user wins.

## Input
- Integer between 100 and 1000 (initial balance)

## Output
- 3x3 grid of random numbers
- "true" if there are two matching consecutive numbers (win)
- "false" otherwise
- Updated balance after a loss

## Structure
- `Main` – controls the game loop
- `ConsRealisationClass` – handles user input and balance
- `GenerateRandomRealisation` – generates random numbers
- `OutputRealisation` – prints the 3x3 grid
- `WinAlgoritmRealisationClass` – checks win conditions
