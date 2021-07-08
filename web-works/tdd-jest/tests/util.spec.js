const {generateText, testSample} = require("../script/util")
 

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

        describe('this is for testing sample code', () => {
            test("should return the proper value provided username and city ", () =>{
                let name  ="Praduman"; 
                let city = "Chennai";
                let expectedResult = `${name} is from ${city}`; 
                expect(testSample(name, city)).toBe(expectedResult);
            })
        })
        

})
