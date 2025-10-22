function solution(n, control) {
    let result = n;
    for (item of control) {
        switch (item) {
            case 'w':
                result += 1;
                break;
            case 's':
                result -= 1;
                break;
            case 'd':
                result += 10;
                break;
            case 'a':
                result -= 10;
                break;
            default:
                break;
        }
    }

    return(result);
}

