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



bitan - 
krishna - configure and write test case using testing library - test here 
sanjana (writing atomic component - button, form, navbar, footer, alert, card)
sushruth - setup react + redux (writing atomic component)  -
pradhuman + deepanjan + karmanya - create S3 bucket + create a folder public folder - where all the assets will go 
(Developer -> bitbucket) -> prod version -> .js -> have to go to s3 with shell jenkins (aws cli)


sonar(PS) + sonar (EC2)
building with jenkins 
unit test 
dockerization 
profiles 


5 (backend- prateek, kanav, aarsh, akhil, rizwan, akshit)
	application.properties  - to run with test 
	application_dev.properties  - differnt system with test + code coverage
	application_prod.properties - no test 
	DTO 
	
	
5 (frontend - deepanjan, harshit, karmanya, aneesha, siddhart)
	you should not push the code to "release branch" when "eslist" rules violates 

DevOps 

Host - sailaja + hemanth 

NAT, Security, VPC, IG, S3 , ec2 




###  terraform commands 
1019  mkdir terraform-works
 1020  cd terraform-works
 1021  clear
 1022  pwd
 1023  vi first.tf
 1024  terraform init 
 1025  ls
 1026  terraform apply 
 1027  terraform destroy
 1028  clear
 1029  terraform plan 
 1030  clear
 1031  terraform plan -out=first-plan.plan
 1032  ls
 1033  terraform show first-plan.plan
 1034  vi first-plan.plan
 1035  terraform state 
 1036  terraform state list
 1037  terraform apply 
 1038  terraform state list
 1039  terraform state show aws_s3_bucket.sapient-tf-training
 1040  terraform graph



 db.campigns.createIndex({"cardType.type":1});


 db.campigns.createIndex({"cardType.type":-1, "cardType.provider":1});

 db.campigns.createIndex({"cardType.type":1, "cardType.provider":-1});

 
 db.campigns.find({"cardType.type":"debit"}).hint({"cardType.type":1}).explain("executionStats");



 List of port numbers used for MS 
 + DB 
 