/**
 * Generate random integer
 * @param {Integer} from Minimum number, inclusive
 * @param {Integer} to Maximum number, exclusive
 * @returns {Integer} Random integer
 */
const generateRandomInt = (from, to) => (
    from + Math.floor(Math.random() * (to - from))
);


module.exports = {
    generateRandomInt,
};
