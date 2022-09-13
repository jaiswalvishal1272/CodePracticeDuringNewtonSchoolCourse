let arr = [2, 3, 4, 5, 6, 3, 1];
// const maxele = Math.max(arr);
// console.log(maxele);
// let max = arr[0];
// for(let i = 1; i < arr.length; i++) {
//     if(arr[i] > max) {
//         max = arr[i];
//     }
// }
// console.log(max);
let maxValue = Math.max(...arr);
console.log(maxValue);
function removeDuplicates(arr) {
    return arr.filter((item,index) => arr.indexOf(item) === index);
}
console.log(removeDuplicates(arr));