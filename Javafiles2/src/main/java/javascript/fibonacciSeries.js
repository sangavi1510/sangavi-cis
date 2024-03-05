function fibonacciSeries(N) {
    let fibSeries = [];
    let num1 = 0, num2 = 1, nextTerm;

    fibSeries.push(num1);  // Add first term to the series
    fibSeries.push(num2);  // Add second term to the series

    for (let i = 2; i < N; i++) {
        nextTerm = num1 + num2;
        fibSeries.push(nextTerm);
        num1 = num2;
        num2 = nextTerm;
    }

    return fibSeries.join(' ');  // Convert array to string and join elements with space
}

// Test the function with input N = 10
console.log(fibonacciSeries(10));  // Output: 0 1 1 2 3 5 8 13 21 34