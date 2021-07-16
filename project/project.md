# TODO's

- Data Model - 1 person from each POD 
- Multi Module project - in progress 
- Branching Stratergy - create a diagram (aarsh + aneesha)
- UML Diagram (Sequence / Class / Context Diagram) - 1 person from each POD 
- Mongo Replication + docker - sprint 1 - akshit + krishna 
- Creating pipeline jenkins - kanav 
  - bitbucket -> should build dockerized images -> start docker images -> port number
- dockerizing app - priyadarshan + harashit
- Integration with Sonar (local + with sapient public site) - akhil 
- AWS Setup for EC2 Instance (1-3) - priyadarshan 
- Loggers -> file and DBMS - deepanjan 



- data model 
- user 

```
    {
        userid:number, 
        username:string, 
        social-links:['linkedin.com/naveeen', 'facebook.com/naveen'], 
        contact: [
            {
                phone:['9900524255'], 
                email:['naveen@probits.in', 'naveen.srinivas@u-next.com']
            }
        ], 
    }
```

- product 
- campaign 




> React Redux + Hook(useState + useEffect) Project 
> Folder structures 
> Writing test cases - hello world (Testing Library - React FB, dom, screen, render etc ) - Jest (FB) 
> Atomic design pattern 
> style guide - fonts, color, size, pattern, looks, RWD, asthetics 
> formik 

screen.contains("h1").getText().toBe("App"); 

const Btn = (handler, caption) => {
    return(
        <button onclick={handler}>{caption}</button>
    )
}

const App =() => {

    return(
        <div>
            <h1>App</h1>
            <Hello/>
           <Btn caption="App" onclick="this.function1">
        </div>
    )

}

const Hello =() => {

    return(
        <div>
            <h1>Hello</h1>
            <Btn caption="App2" onclick="this.function2">
        </div>
    )

}



