let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

const Alpa = [
    2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9,
    9,
];

function solution(item) {
    let num = changeNum(item);
    let result = num.reduce((prev, cur) => {
        return prev + cur;
    }, 0);

    console.log(result + num.length);
}

function changeNum(str) {
    let test = str.toString().split('');
    let arr = [];
    for (value of test) {
        temp = value.charCodeAt() - 65;
        arr.push(Alpa[temp]);
    }
    return arr;
}

solution(input);
