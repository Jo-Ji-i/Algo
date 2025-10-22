function solution(n) {
    const result = [n];
    let target = n;
    while (target != 1) {
        if (target % 2 == 0) target = target / 2;
        else target = 3 * target + 1;
        result.push(target);
    }
    return result;
}

