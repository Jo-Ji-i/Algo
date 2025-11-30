const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();
input = input.split('\n');

const [N, X] = input[0].split(' ').map(Number);
const result = N + X;

console.log(result);
