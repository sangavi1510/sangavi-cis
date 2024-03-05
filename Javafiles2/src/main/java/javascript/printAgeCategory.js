function printAgeCategory(age) {
    if (age < 13) {
        console.log("Kid");
    } else if (age >= 13 && age <= 19) {
        console.log("Teen");
    } else {
        console.log("Adult");
    }
}

// Test the function with different ages
printAgeCategory(8);   // Output: Kid
printAgeCategory(15);  // Output: Teen
printAgeCategory(25);  // Output: Adult