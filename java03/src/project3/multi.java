package project3;

	class multi implements Runnable {

	    public void run() {          
	        System.out.println("Thread is running");
	    }

	    public static void main(String[] args) {

	    	multi d = new multi ();

	        Thread t = new Thread(d); 
	        
	        t.start(); 
	    }
	}

