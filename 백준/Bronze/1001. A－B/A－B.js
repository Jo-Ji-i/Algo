const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];
let result = 0;

rl.on('line', (line) => {
    input = line.split(' ').map((el) => Number(el));
    result = input[0] - input[1];
    console.log(result);
    rl.close();
});

rl.on('close', () => {
    process.exit();
});
