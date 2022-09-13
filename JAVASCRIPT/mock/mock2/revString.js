var x = "abc";
function stringReversed(x) {
    for(let i = 0; i < x.length; i++) {
        let temp = x[i];
        x[i] = x[x.length - 1 -i];
        x[x.length - 1 -i] = temp;

    }
    console.log(x);
}
//stringReversed(x);
console.log(x.reverse());