function abc(){
    setTimeout(function (){
        console.log(typeof(String))
    },0)
    console.log(i);

    for(var i=1;i<=5;i++)
    {
        function xyz(abc)
        {
            setTimeout(function(){
                console.log(abc)

            },abc*1000)
        }
        xyz(i)
    }
    console.log(i)
}
abc()