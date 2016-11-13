# project2_android_java

TOP SCOTS - ANDROID APP

Goal: Create a card game in Android.
The game does not need to have much or any interaction. 
The aim is to display the results of the Java logic already written. 
For example, if you had two players being dealt two cards each your screen might look something like:

Player 1: Ace of Hearts, 9 of Diamonds
Player 2: 3 of Clubs, 2 of Hearts
Player 1 Wins!

All the cards are dealt among the players. There must be at least two players, and at least one card for each player. 
The starting player selects a category from his or her topmost card and reads out its value. 
Each other player then reads out the value of the same category from their cards. 
The best (usually the largest) value wins the "trick", and the winner takes all the cards of the trick and places them at the bottom of his or her pile. 
The winner then looks at their new topmost card, and chooses the category for the next round.

In the event of a draw the cards are placed in the center and a new category is chosen from the next card by the same person as in the previous round. 
The winner of that round obtains all of the cards in the center as well as the top card from each player.

Players are eliminated when they lose their last card, and the winner is the player who obtains the whole pack. 

I'm turning Top Trumps into Top Scots which will be modelled on the power play card game.

The game play will be refactored to display results like this:

Player 1: Edinburgh Castle, Heritage Value: 9 
Player 2: CodeClan, Heritage Value: 6
Player 1 Wins!

This will be based upon differing values that favour different strengths. CodeClan will have more power in other categories such
as maintanence as older structures require more upkeep and therefore has a higher rating.

Hoping to implement a similar structure to rank and suit using a category (Building) and it's value (Power). 
