let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function solution(item) {
    let result = 1;
    range = 1;

    while (range < item) {
        range = range + 6 * result;
        result++;
    }
    console.log(result);
}

solution(input);
