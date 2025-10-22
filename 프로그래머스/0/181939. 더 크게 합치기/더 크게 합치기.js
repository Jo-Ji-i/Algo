function solution(a, b) {
    const resultA = a + b.toString();
    const resultB = b + a.toString();
    return resultA < resultB ? Number(resultB) : Number(resultA);
}