package tech.medivh.demo.kotlin

import org.junit.jupiter.api.Test


class DemoClassTest{
    
    
    @Test
    fun testDemo(){
        val demoClass = DemoClass()
        repeat(10){
            demoClass.helloWorld()
        }
    }
}
