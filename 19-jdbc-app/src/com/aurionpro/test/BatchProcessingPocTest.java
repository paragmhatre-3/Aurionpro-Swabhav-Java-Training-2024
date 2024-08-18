package com.aurionpro.test;

import com.aurionpro.model.BatchProcessingPoc;

public class BatchProcessingPocTest { public static void main(String[] args) { 
  BatchProcessingPoc batch = new BatchProcessingPoc();  
  batch.connectToDb(); 
   
  batch.batchAddSuppliers();//  batch.batchAddProducts(); 
  batch.readSuppliers(); 
   } 
}
