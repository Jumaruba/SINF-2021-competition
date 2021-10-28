const { generateRandomInt, writeInput } = require("../utils.js");

// The total testCases will be numSamples * numTestcases * 2. 
let numTestCases = 100;     // From string size 1 to 100.
let numSamples = 2;

// Variables used to generate tests. 
let line = "";
let size = 0;
let random = 0; 

// STRING IS VALID  
for (let j = 1; j < numTestCases + 1; j++) {
    for (let m = 0; m < numSamples; m++) {
        line = "";
        size = 0;
        while (size < j) {
            random = `${generateRandomInt(1, 26)}`;
            if (j - size == 1) random = `${generateRandomInt(1, 9)}`;
            size += random.length;
            line += random;
        }
        writeInput(((j - 1) * numSamples + m).toString(), "./p4", line, 3);
    }
} 

// STRING IS NOT VALID  
let startNumTest = numTestCases* numSamples + 1;
for (let j = 1; j < numTestCases + 1; j++) {
    for (let m = 0; m < numSamples; m++) { 
        line = "";
        for (let i = 0; i < j; i++) {
            line += `${generateRandomInt(0, 9)}`;
        }
        writeInput(((j -1) * numSamples + m + startNumTest).toString(), "./p4", line, 3);
    }
}
console.info(line);

/**
 * 1 ~ 11 are personalized tests
 * 12 ~ 21 => size [1,4].
 * 22 ~ 31 =>  size [5,10]
 * 32 ~ 41 => size [11,40]
 * 42 ~ 71 => size [42, 100]
 * 72 ~ 81 => size == 100
 */