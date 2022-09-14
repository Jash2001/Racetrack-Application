import grails.util.GrailsUtil
import racetrack.Runner
import racetrack.Race
import racetrack.Registration
import racetrack.User
class BootStrap {

     def init = { servletContext ->
     //      switch(GrailsUtil.environment){
     //           case "development":
     //                def admin = new User(
     //                     login:"admin",
     //                     password:"wordpress",
     //                     role:"admin"
     //                )
     //                admin.save()
     //                if(admin.hasErrors()){
     //                     println admin.errors
     //                }


     //                def jane = new Runner(
     //                     firstName:"Jane",
     //                     lastName:"Doe",
     //                     dateOfBirth:(new Date() - 365*30),
     //                     gender:"F",
     //                     address:"123 Main St",
     //                     city:"Goose",
     //                     state:"NC",
     //                     zipcode:"12345",
     //                     email:"jane@whereever.com"
     //                ) 
     //                jane.save()
     //                if(jane.hasErrors()){
     //                     println jane.errors
     //                }

     //                def F1 = new Race(
     //                     name: "F1 Championship",
     //                     startDate: (new Date() + 90),
     //                     city: "National City",
     //                     state: "NC",
     //                     distance: 10.0,
     //                     cost: 50.0,
     //                     maxRunners: 400
     //                )
     //                F1.save()
     //                if(F1.hasErrors()){
     //                     println F1.errors
     //                }

     //                def reg = new Registration(
     //                     paid: false,
     //                     runner: jane,
     //                     race: F1
     //                )
     //                reg.save()
     //                if(reg.hasErrors()){
     //                     println reg.errors
     //                }

     //                break

     //           case "production" : break
     //      }
     }
     def destroy = { }
} 