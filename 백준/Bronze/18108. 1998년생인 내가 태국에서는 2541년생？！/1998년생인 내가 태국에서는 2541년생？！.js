const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = 0;
let result = '';

rl.on('line', (line) => {
    input = Number(line);
    result = input - 543;
    console.log(result);
    rl.close();
});

rl.on('close', () => {
    process.exit();
});
