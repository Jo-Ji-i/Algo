let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

const WORD = 'long ';

function solution(item) {
    let byte = item;
    let reps = byte / 4;

    repeatByte(reps);
}

function repeatByte(reps) {
    let result = '';
    result = WORD.repeat(reps);
    result += 'int';

    console.log(result);
}

solution(input);