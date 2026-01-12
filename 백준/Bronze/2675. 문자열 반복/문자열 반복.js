let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let T = item[0];

    for (let i = 1; i < item.length; i += 2) {
        let repeat = item[i];
        let string = item[i + 1];
        let arr = [...string];
        let result = '';

        for (let value of arr) {
            result += value.repeat(repeat);
        }

        console.log(result);
    }
}

solution(input);
