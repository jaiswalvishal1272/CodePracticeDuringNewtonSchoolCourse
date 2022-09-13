var arr = [1, 2, 3, 4, 3, 5, 3];
function removeDuplicates(arr) {
    //return arr.filter((item, index) => arr.indexOf(item) === index);
    return [...new Set(arr)];
}
console.log(removeDuplicates(arr));
