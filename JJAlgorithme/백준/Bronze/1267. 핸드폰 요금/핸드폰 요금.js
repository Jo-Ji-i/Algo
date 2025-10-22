const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const arr = input[1].split(' ').map(Number);
let yFee = 0;
let mFee = 0;

for (let item of arr) {
    if (item >= 30) {
        yFee += (parseInt(item / 30) + 1) * 10;
    } else yFee += 10;
    if (item >= 60) {
        mFee += (parseInt(item / 60) + 1) * 15;
    } else mFee += 15;
}

if (yFee === mFee) {
    console.log('Y M ' + yFee);
    return;
}
const result =
    yFee < mFee ? console.log('Y ' + yFee) : console.log('M ' + mFee);
