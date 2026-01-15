let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let reverse = item.toString().split('').reverse();
    item.join() === reverse.join('') ? console.log('1') : console.log('0');
}

solution(input);
