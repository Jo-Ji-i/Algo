const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();
input = input.trim().split('\n').map(Number);

const members = input.filter((item) => item % 2 != 0);
console.log(
    members.length != 0
        ? members.reduce((acc, cur) => acc + cur) + '\n' + Math.min(...members)
        : -1
);
