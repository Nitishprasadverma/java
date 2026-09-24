What is java collection Framework?

 added in java version 1.2 , it's is group of object

 Package: Java.util

 frameworks provides the methods to manage group of object like add, update, search etc.

 # Why do we need
    - *Because prior to JCF we had array, vector hash tables
      - But problem with them was there were no common interface so it was diffuclt to remember the excat method for all.
## Iterable:  Used to Traverse the collections.
 
  - Iterator() Java 1.5 
     - hasNext()  return true , if there are more element in collection
     - next() - return next element in the iteration
     - remove()  Remove the last element returned by iterator

## Collection

    - It represnts the group of object , its an interface which provides method to work on group of object

## Collection Vs Collections
  
    ### Collection: 
         - it is a part of collection framework. And its an interface, which expose various method which is implemented by various collection classess like ArrayList, stack LinkedList etc.
    ### Collections:
     
        - It is a utility class and provide satic methods which are used to operate on collections like sorting, swapping, searching, reverse, copy etc.
        
      