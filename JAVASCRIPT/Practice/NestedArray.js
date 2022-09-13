var array = [1, 2, [3, 4, [5, 6]]];
const flatten = (arr) => {
    someNewArray = arr.reduce((acc, item) => {
        if(Array.isArray(item)) {
            acc = acc.concat(flatten(item));
        }
        else {
            acc = [...acc,item];
        }
        return acc;
    },[])
    return someNewArray;
}
console.log(flatten(array));