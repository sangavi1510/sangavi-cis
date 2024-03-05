function printPattern() {
    for (let i = 4; i >= 0; i--) {
        let pattern = "";
        for (let j = 0; j < 5; j++) {
            if (j < i) {
                pattern += "+";
            } else {
                pattern += "-";
            }
        }
        console.log(pattern);
    }
}

// Test the function
printPattern();