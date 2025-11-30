let fs = require('fs');
const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
     if (item > 89) {
        console.log('A');
    } else if (item > 79) {
        console.log('B');
    } else if (item > 69) {
        console.log('C');
    } else if (item > 59) {
        console.log('D');
    } else {
        console.log('F');
    }
}

solution(input);
