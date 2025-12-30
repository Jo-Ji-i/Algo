let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let arr = '';

    for (let i = item - 1; i >= 0; i--) {
        for (let j = i; j > 0; j--) {
            arr += ' ';
        }
        for (let k = i; k < item; k++) {
            arr += '*';
        }
        console.log(arr);
        arr = '';
    }
}

solution(input);
