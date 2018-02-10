package com.labros



class Person (val name:String, val id:Integer){
   def this(name:String){
    this(name,1);
  }
  def greet:String = "Hello "+name
}