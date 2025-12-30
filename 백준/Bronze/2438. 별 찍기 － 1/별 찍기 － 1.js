let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let arr = '';

    for (let i = 0; i < item; i++) {
        arr += '*';
        for (let j = 0; j < i; j++) {
            arr += '*';
        }
        console.log(arr);
        arr = '';
    }
}

solution(input);
