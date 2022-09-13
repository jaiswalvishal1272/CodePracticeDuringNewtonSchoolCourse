const colours = ['spades' , 'diamonds', 'club', 'heart'];
const card = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A'];

let deck = [];

for(let i = 0; i < colours.length; i++) {
    for(let j = 0; j < card.length; j++) {
        let cards = {
            Value : card[j],
            col : colours[i]
        }
        deck.push(cards);
    }
}
for(let i = deck.length - 1; i > 0; i--) {
    let j = Math.floor(Math.random() * i)
    let temp = deck[i];
    deck[i] = deck[j];
    deck[j] = temp;

}
console.log("after shuffling cards are: ");
for(let i = 0; i <=13; i++) {
    console.log(deck[i].Value + ' of ' + deck[i].col);
}