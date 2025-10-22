const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();
input = input.trim().split('\n').map(Number);

let sum = 0;
let arr = [];

for (let i = 0; i < input.length - 1; i++) {
    for (let j = i + 1; j < input.length; j++) {
        arr = input.filter((item) => item != input[i] && item != input[j]);
        sum = arr.reduce((acc, cur) => acc + cur);
        if (sum === 100) {
            console.log(arr.sort((a, b) => a - b).join('\n'));
            return;
        }
    }
}
