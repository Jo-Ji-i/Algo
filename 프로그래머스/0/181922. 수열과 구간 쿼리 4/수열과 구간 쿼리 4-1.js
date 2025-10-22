function solution(arr, queries) {
    let result = queries.reduce(
        (answer, [s, e, k]) => {
            for (let i = s; i <= e; i++) {
                if (i % k === 0) answer[i] += 1;
            }
            return answer;
        },
        [...arr]
    );

    console.log(result);
}

solution(
    [0, 1, 2, 4, 3],
    [
        [0, 4, 1],
        [0, 3, 2],
        [0, 3, 3],
    ]
);

// reduce 함수 이용 버전
