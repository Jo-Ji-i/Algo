function solution(list) {
  const { even, odd } = list.reduce(
        ({ odd, even }, cur) => {
            if (cur % 2 == 0) {
                even.push(cur);
            } else {
                odd.push(cur);
            }
            return { odd, even };
        },
        { odd: [], even: [] }
    );

    return (Number(even.join('')) + Number(odd.join('')));
}