def person = new XmlSlurper().parse(new File("test.xml"))
def xml = new File("test.xml")

person.MULTIPLE.SINGLE.each{
    println it.KEY


}
println "*"*100
println "*"*100
println "*"*100
String shortname="179408128"
person.MULTIPLE.SINGLE.each{
    
    println it.KEY[0].text()
    println it.KEY[1].text()
    println it.KEY[2].text()
    println it.KEY[3].text()
    println it.KEY[4].text()
    println it.KEY[29].MULTIPLE.SINGLE.KEY[2].text()
 //   println it.KEY[29].MULTIPLE.SINGLE.KEY[2].text()
     it.KEY[31].MULTIPLE.SINGLE.each{ o ->
         if(o.KEY[2]=="179408128"){
             println o.KEY[2]
         }
         println "33333"
     }
    println "%"*300

}

println "*"*100