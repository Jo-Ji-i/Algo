const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = 0;

rl.on('line', (line) => {
    input = line.split(' ').map(Number);
    console.log((input[0] + input[1]) % input[2]);
    console.log(((input[0] % input[2]) + (input[1] % input[2])) % input[2]);
    console.log((input[0] * input[1]) % input[2]);
    console.log(((input[0] % input[2]) * (input[1] % input[2])) % input[2]);
    rl.close();
});

rl.on('close', () => {
    process.exit();
});
