let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    num1 = reverseNum(item[0]);
    num2 = reverseNum(item[1]);

    if (num1 > num2) {
        console.log(num1);
    } else console.log(num2);
}

function reverseNum(num) {
    return num.split('').reverse().join('');
}

solution(input);
