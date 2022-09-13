function reverse(s) {
    return  s.split(' ').map(function(word){
        return word.split('').reverse().join('');

    }).join(' ');
   

}
console.log(reverse("Hello Word"));