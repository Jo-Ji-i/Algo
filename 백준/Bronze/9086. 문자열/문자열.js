let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let T = item[0];
    let arr = item.slice(1, item.length);

    arr.forEach((element) => {
        let first = element.charAt(0);
        let last = element.charAt(element.length - 1);
        console.log(first + last);
    });
}

solution(input);
