//
//const reset = "\x1b[0m"; // 색상 초기화
//
//for (var i = 2; i < 10; i++)
//     {
//    for (var j = 1; j < 10; j++) 
//        {
//        process.stdout.write(i + "x" + j + "=" + (i*j)+" ");
//    }
//
//   process.stdout.write("\n");
//
//    
//}
//
//
//
//
//var numbers = [1,2,3,4,5,6,7,8,9];
//
//
//numbers.forEach((num, index)=> {
//    console.log(index + "번째 값: " + num);
//})
//numbers.forEach(function(num, index) {
//    console.log(index + "번째 값: " + num);
//});
//
//
//const readline = require('readline');


const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close', function () {
    str = input[0];


    const result = str
        .split('')
        .map(function (char) {
            if (char === char.toUpperCase()) return char.toLowerCase();
            else return char.toUpperCase()

        })
        .join('');


    console.log(result);


});