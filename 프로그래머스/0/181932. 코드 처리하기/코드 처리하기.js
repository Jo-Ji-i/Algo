function solution(code) {
    var answer = [];
    let mode = 0;

    for (let i = 0; i < code.length; i++) {
        if (code[i] === '1') {
            mode === 0 ? (mode = 1) : (mode = 0);
        }
        if (mode === 0) {
            if (i % 2 === 0 && code[i] != '1') answer.push(code[i]);
        } else {
            if (i % 2 != 0 && code[i] != '1') answer.push(code[i]);
        }
    }
    return answer.length === 0 ? 'EMPTY' : answer.join('');
}


