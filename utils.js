const fs = require('fs');

/**
 * Generate random integer
 * @param {Integer} from Minimum number, inclusive
 * @param {Integer} to Maximum number, exclusive
 * @returns {Integer} Random integer
 */
const generateRandomInt = (from, to) => (
    from + Math.floor(Math.random() * (to - from))
);

/**
 * Some tests need to be more controlled, thus it's not possible to use the ps1 script. 
 * This function creates the function in the parse folder.
 * @param {String} testNumber Number of the test. 
 * @param {String} input Content to be written in the file. 
 * @param {String} problemPath Path of the problem. 
 */
const writeInput = (testNumber, problemPath, content, pad) => {   
    let padTestNumber = testNumber.padStart(pad, "0");
    fs.writeFileSync(`${problemPath}/input/input${padTestNumber}.txt`, content); 
} 


const generateRandomWord = (size) => {
    let letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']; 
    let alphaSize = letters.length;
    let str = "";

    for (let i = 0 ; i < size; i++){
        str += letters[generateRandomInt(0, alphaSize-1)]; 
    }

    return str; 
}

module.exports = {
    generateRandomInt,
    writeInput,
};
