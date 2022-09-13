function a() {
    function b() {
        console.log("closuers");
    }
    return b;
}
let x = a();
x();