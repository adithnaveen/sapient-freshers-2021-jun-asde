const {generateText, checkAndGenerateText, createElement} = require("../script/util")
 

describe('unit testing for the functions written to put data', () => {
        test('should be able to pass the test when valid name and age is given', () => {
            const name = "Akhilesh"
            const age = 22 

            let returnText = generateText(name, age)
            let expectedResult = `${name} is ${age} years old`
            expect(returnText).toBe(expectedResult)
        })
        test("should fail the test case when the values are not given", () => {
            const name = ""
            const age = 0
            
            let returnText = generateText(name, age)
            let expectedResult = ` is 0 years old`
            expect(returnText).toBe(expectedResult)
            
        })


})
