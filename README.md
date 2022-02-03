This was done as part of technical assessment in one of the organizations for which I gave an interview.

# ChessBoard

Chess board applicaton to satisfy criteria as mentioned below:<br/>
<br/>
You are required to create a program, which simulates a chessboard and the
movements of various types of pieces on the chessboard.<br/>
<br/>
Chessboard:<br/>
<br/>
The chessboard is an 8 x 8 grid with 64 cells in it.<br/>
<br/>
With 8 rows (A, B, C…. H) and 8 columns (1, 2, 3…. 8), each cell can be uniquely
identified with its cell number. This can be seen illustrated below.<br/>
<br/>
A8 B8 C8 D8 E8 F8 G8 H8<br/>
A7 B7 C7 D7 E7 F7 G7 H7<br/>
A6 B6 C6 D6 E6 F6 G6 H6<br/>
A5 B5 C5 D5 E5 F5 G5 H5<br/>
A4 B4 C4 D4 E4 F4 G4 H4<br/>
A3 B3 C3 D3 E3 F3 G3 H3<br/>
A2 B2 C2 D2 E2 F2 G2 H2<br/>
A1 B1 C1 D1 E1 F1 G1 H1<br/>
<br/>
Chess pieces and their movements:<br/>
<br/>
The game of chess has 6 unique types of pieces, with their own unique types
of movements. These are:<br/>
1.) King – Can move only 1 step at a time in all 8 directions (horizontal, vertical
and diagonal)<br/>
<br/>
2.) Queen – Can move across the board in all 8 directions
<br/>
3.) Bishop – Can move across the board only diagonally<br/>
<br/>
4.) Horse – Can move across the board only in 2.5 steps (2 vertical steps and 1
horizontal step)<br/>
5.) Rook – Can move across the board only vertically and horizontally
<br/>
6.) Pawn – Can move only 1 step at a time, in the forward direction, vertically.
Can also move 1 step forward diagonally, in order to eliminate an opposing
piece.
<br/>

#Objective of your program:<br/>
Your program should simulate the movement of each unique chess piece on an
empty chessboard.
<br/>
• Input – The input string to your program will be the Type of chess piece and
its Position (cell number) on the chessboard. E.g. “King D5”<br/>
• Output – Once you execute the program, the output will be a string of all
possible cells in which the chess piece can move.<br/>
Sample inputs and outputs:<br/>
Input – “King D5”<br/>
Output – “D6, E6, E5, E4, D4, C4, C5, C6”<br/>
<br/>
A8 B8 C8 D8 E8 F8 G8 H8<br/>
A7 B7 C7 D7 E7 F7 G7 H7<br/>
A6 B6 C6 D6 E6 F6 G6 H6<br/>
A5 B5 C5 D5 E5 F5 G5 H5<br/>
A4 B4 C4 D4 E4 F4 G4 H4<br/>
A3 B3 C3 D3 E3 F3 G3 H3<br/>
A2 B2 C2 D2 E2 F2 G2 H2<br/><br/>
A1 B1 C1 D1 E1 F1 G1 H1<br/>

Input – “Horse E3”<br/>
Output – “F5, G4, G2, F1, D1, C2, C4, D5”<br/>

A8 B8 C8 D8 E8 F8 G8 H8<br/>
A7 B7 C7 D7 E7 F7 G7 H7<br/>
A6 B6 C6 D6 E6 F6 G6 H6<br/>
A5 B5 C5 D5 E5 F5 G5 H5<br/>
A4 B4 C4 D4 E4 F4 G4 H4<br/>
A3 B3 C3 D3 E3 F3 G3 H3<br/>
A2 B2 C2 D2 E2 F2 G2 H2<br/>
A1 B1 C1 D1 E1 F1 G1 H1<br/>
<br/>

#Assumption:<br/>
Assume that the board is empty. This means that the pawn cannot move
diagonally.<br/>
