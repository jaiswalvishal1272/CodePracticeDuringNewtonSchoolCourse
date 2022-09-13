function isPrime(x) {
    for(let i = 2; i < x * x; i++) {
        if(x % i == 0) {
            document.getElementById('result').innerHTML = 'the number is prime';
            return false;
        }
    }
    document.getElementById('result').innerHTML = 'the number is not prime';
    return true;
}

let x = document.getElementById('num');
document.getElementById('check').addEventListener('click', isPrime(x));
