const {generateText, checkAndGenerateText, createElement} = require("../script/util")

        describe('to do integration testing of generate text', ()=>{
            test("should validate and generate text pass case " , () => {
                const name = "Akhilesh"
                const age = 22 
                let retVal = checkAndGenerateText(name, age);
                let expectedResult = `${name} is ${age} years old`
                expect(retVal).toBe(expectedResult)
            })

            test("should check create element is not null", () => {
                const name = "Akhilesh"
                const age = 22 
                let outputText = `${name} is ${age} years old`
                
                let element  = createElement("li", outputText, "user-item"); 
 
            })
        })