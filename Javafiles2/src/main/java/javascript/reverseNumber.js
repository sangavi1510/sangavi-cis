function reverseNumber(num) {
    // Convert the number to a string
    let numStr = num.toString();
    // Split the string into an array of characters, reverse it, and join it back into a string
    let reversedStr = numStr.split('').reverse().join('');
    // Parse the reversed string back into an integer
    let reversedNum = parseInt(reversedStr);
    return reversedNum;
}

// Test the function with an example input
let inputNumber = 12345;
let reversedNumber = reverseNumber(inputNumber);
console.log("Input Number:", inputNumber);
console.log("Reversed Number:", reversedNumber);