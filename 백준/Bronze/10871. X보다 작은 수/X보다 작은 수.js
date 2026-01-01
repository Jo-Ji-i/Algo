const fs = require('fs');
// ("/dev/stdin").
let input = fs.readFileSync('/dev/stdin').toString();
input = input.split('\n');

const [N, X] = input[0].split(' ').map(Number);
const testCase = input[1].split(' ').map(Number);

const result = [];

for (item of testCase) {
    if (item < X) {
        result.push(item);
    }
}

console.log(result.join(' '));
