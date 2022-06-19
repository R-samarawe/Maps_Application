package com.example.ps_2017_174_maps.Objects

import com.example.ps_2017_174_maps.Models.Places


class ClassMaker {

    fun listsdata(): List<Places>{



        val obj1=Places(1,"University of Colombo",6.900777,79.860133)
        val obj2=Places(2,"University of Moratuwa", 6.7968827,79.9017781)
        val obj3=Places(3,"University of Kelaniya",6.9754, 79.9156)
        val obj4=Places(4,"University of Peradeniya",7.2549,80.5974)
        val obj5=Places(5,"Rajarata University",8.3608,80.5033)
        val obj6=Places(6,"University of Ruhuna",5.9381,80.5761)
        val obj7=Places(7,"Sabaragamuwa University",6.7146,80.7872)
        val obj8=Places(8,"University of Jaffna", 9.6849 ,80.0220)
        val obj9=Places(9,"Eastern University",7.7944, 81.5790)
        val obj10=Places(10,"University of Sri Jayewardenepura",6.8528,79.9036)
        val obj11=Places(11,"Uva Wellassa University",6.9819,81.0763)
        val obj12=Places(12,"Wayamba University",7.3226,79.9882)
        val obj13=Places(13,"University of Vavuniya",8.7587,80.4107)



        val listofdata =listOf(obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9,obj10,obj11,obj12,obj13)

        return listofdata ;
    }




}