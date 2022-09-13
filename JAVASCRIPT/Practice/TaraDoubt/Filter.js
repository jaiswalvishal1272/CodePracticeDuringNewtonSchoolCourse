const obj = [{
    name: "lokesh",
    age: 23,
    salary: 98000
},
{
    name: "Rakesh",
    age: 29,
    salary: 33000
}];
console.log(obj);
obj.push({
    name: "nishit",
    age: 24,
    salary: 30000
});
console.log(obj);
const newObj = obj.filter(element => element.age > 25);
console.log(newObj);
