const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, M] = input[0]
    .split(' ')
    .map(Number)
    .sort((a, b) => a - b);

let arr = [];
let side = 0;
for (let i = N + 1; i < M; i++) {
    side++;
    arr.push(i);
}

console.log(side);
console.log(String(arr.join(' ')));
    