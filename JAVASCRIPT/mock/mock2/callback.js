function x(a) {
a();

}
function y() {
    console.log("callback");
}
x(y);
