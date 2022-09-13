console.log('this is basic fetch')
// function getData() {
//     url = "https://api.github.com/users";
//     fetch(url).then((response)=>{
//         return response.json();
//     }).then((data)=>{
//         console.log(data);
//     })
// }
// getData();

function postData() {
    url = "https://dummy.restapiexample.com/api/v1/create";
    data = '{"name":"test83469","salary":"123","age":"23"}'
    params = {
        method : 'post',
        headers : {
            'Content-Type' : 'application/json'
        },
        body : data
    }
    fetch(url, params).then((response)=>{
        return response.json();

    }).then((data)=>{
        console.log(data);
    })
}
postData()