

function Book(name, author) {
    this.name = name;
    this.author = author;
}
function Display(){}

Display.prototype.add = function(book){
    tableBody = document.getElementById("tableBody");
    let uiString = `<tr>
                        <td>${book.name}</td>
                        <td>${book.author}</td>
                    </tr>`;
    tableBody.innerHTML += uiString;
}
Display.prototype.clear = function () {
    let libraryForm = document.getElementById('libraryForm');
    libraryForm.reset();
}


let libraryForm = document.getElementById("libraryForm");
libraryForm.addEventListener('submit', libraryFormSubmit);

function libraryFormSubmit(e) {
    let name = document.getElementById("name").value;
    let author = document.getElementById("author").value;

    let book = new Book(name, author);
    let display = new Display();
    display.add(book);
    display.clear();

    e.preventDefault();
}