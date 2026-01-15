let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    if (!item.toString()) {
        console.log('0');
        return 0;
    }

    console.log(item.length);
}

solution(input);
