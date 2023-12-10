# ----------- GAME BOARD ------------

# Game Board
board = ["_", "_", "_",
         "_", "_", "_",
         "_", "_", "_",]

# If game is still going
game_still_going = True
# Who won? or tie?
winner = None

current_player = "X"

# display the board
def display_board():
    print(board[0] + " | " + board[1] + " | " + board[2])
    print(board[3] + " | " + board[4] + " | " + board[5])
    print(board[6] + " | " + board[7] + " | " + board[8])

def play_game():

    # display initial board
    display_board()

# while the game is still going
    while game_still_going:
        # handle a single turn of an arbitrary player
        handle_turn(current_player)

        # check if game has ended
        check_if_game_over()

        # flip to the other player
        flip_player()

# the game ended
    if winner == 'X' or winner == 'O':
        print("Player - " + winner + " won !")
    elif winner == None:
        print("Tie !")


# handle the single turn of the arbitrary player
def handle_turn(player):
    print(player + "'s turn")
    position = input("choose a position by 1 to 9 : ")

    valid = False
    while not valid:
        while position not in ["1", "2", "3", "4", "5", "6", "7", "8", "9"]:
            position = input("Invalid input ! please choose a position by 1 to 9 : ")

        position = int(position) - 1


        if board[position] == "_":
            valid = True
        else:
            print("You can't go there. GO again !")


    board[position] = player
    display_board()

def check_if_game_over():
    check_for_winner()
    check_if_tie()
def check_for_winner():

    # set up the global variables
    global winner

    # check rows
    row_winner = check_rows()

    # check columns
    column_winner = check_colums()

    # check diagonals
    diagonal_winner = check_diagonals()

    if row_winner:
         winner = row_winner
    elif column_winner:
        winner = column_winner
    elif diagonal_winner:
        winner = diagonal_winner
    else:
        winner = None
    return

def check_rows():
    # set up global variable
    global game_still_going
    # check if any of the row is able to acieve win condition
    row_1 = board[0] == board[1] == board[2] != "_"
    row_2 = board[3] == board[4] == board[5] != "_"
    row_3 = board[6] == board[7] == board[8] != "_"
    # If any row does have a match, set false
    if row_1 or row_2 or row_3:
        game_still_going = False
    # return the winner ( X or O )
    if row_1:
        return board[0]
    elif row_2:
        return board[3]
    elif row_3:
        return board[6]
    return

def check_colums():
    # set up global variable
    global game_still_going
    # check if any of the row is able to acieve win condition
    column_1 = board[0] == board[3] == board[6] != "_"
    column_2 = board[1] == board[4] == board[7] != "_"
    column_3 = board[2] == board[5] == board[8] != "_"
    # If any row does have a match, set false
    if column_1 or column_2 or column_3:
        game_still_going = False
        # return the winner ( X or O )
    if column_1:
        return board[0]
    elif column_2:
        return board[1]
    elif column_3:
        return board[2]
    return

def check_diagonals():
    # set up global variable
    global game_still_going
    # check if any of the row is able to achieve win condition
    diagonals_1 = board[0] == board[4] == board[8] != "_"
    diagonals_2 = board[6] == board[4] == board[2] != "_"
    # If any row does have a match, set false
    if diagonals_1 or diagonals_2 :
        game_still_going = False
        # return the winner ( X or O )
    if diagonals_1:
        return board[0]
    elif diagonals_2:
        return board[6]

    return
def check_if_tie():
    global game_still_going;
    if "_"  not in board:
        game_still_going = False
    return

def flip_player():
    global current_player
    if current_player == "X":
        current_player = "0"
    elif current_player == "0":
        current_player = "X"
    return;

play_game()



# board

# display board
# play game
# handle turn
# check if there is a win
    # check rows
    # check colums
    # check diagonals
# check tie
# flip players