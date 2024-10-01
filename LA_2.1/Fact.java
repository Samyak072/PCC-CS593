long fact(int n) {
     if (n<0) {     
           System.out.println("ERROR");
         System.exit(0);
         return -1;    // No factorial for negative number
     }
     else if (n==0)        // For 0 value
         return 1;
     else                       // Otherwise
         return(n*fact(n-1));
}
