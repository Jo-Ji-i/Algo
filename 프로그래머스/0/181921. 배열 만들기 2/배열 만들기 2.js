function solution(l, r) {
    const result = [];
    const empty = [-1];

    for (let i = l; i <= r; i++) {
        const numArr = Array.from(String(i));
        let flag = 0;
        numArr.forEach((element) => {
            if (element === '0' || element === '5') {
                flag++;
            }
        });
        if (flag === numArr.length) result.push(i);
    }
    return !result.length ? empty : result; 
}
