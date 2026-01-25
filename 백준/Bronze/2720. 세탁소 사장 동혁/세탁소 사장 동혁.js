let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const change = [25, 10, 5, 1];

function solution(item) {
    const testCase = parseInt(item[0]);
    const input = item.slice(1, testCase + 1).map(Number);

    for (value of input) {
        exchange(value);
    }
}

function exchange(num) {
    let result = '';
    for (value of change) {
        if (num >= value) {
            const temp = parseInt(num / value);
            num = num - temp * value;
            result += temp + ' ';
        } else {
            result += '0 ';
        }
    }

    console.log(result);
}

solution(input);
