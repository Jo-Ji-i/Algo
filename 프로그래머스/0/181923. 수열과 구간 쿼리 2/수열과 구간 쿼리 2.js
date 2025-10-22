function solution(arr, queries) {
    const result = [...arr];
    const resultArr = [];

    queries.forEach(([s, e, k]) => {
        const answer = Math.min.apply(
            null,
            result.slice(s, e + 1).filter((item) => item > k)
        );
        const num = answer != Infinity ? answer : -1;
        resultArr.push(num);
    });
    return(resultArr);
}