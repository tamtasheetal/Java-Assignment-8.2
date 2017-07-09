package threads;    
//This java file is inside package named threads;   inside src folder.
	
	class PrimeByClass extends Thread
	//This class is checking that the number is prime or not.
	{
		int inputNumber;   
	
		public PrimeByClass(int inputNumber) 
		{
			
			this.inputNumber = inputNumber;
			//Initializing instance variable by parameter passed in the constructor.
		}
		
		public void run()
		{
			int flag=0;
			try
			{
				for(int i = 2 ; i <= inputNumber/2 ; i++)
				{
					if(inputNumber % i ==0 )
					{
						flag=1;   
						break;     
					}
				}
				
				
				if(flag == 0)
			   //if value of flag is not changed then it is prime.
				{
					System.out.println(inputNumber+" is prime number -> Checking by Extending Thread Class");   
				}
				else
				{
					System.out.println(inputNumber+" is not prime number -> Checking by Extending Thread Class");   
				}
				
				Thread.sleep(1000);   
			  //Calling Sleep to Thread.
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");  
			}
		}
		
	}
	
	class PrimeByInterface implements Runnable
	//This class is checking that the number is prime or not.
	{
		int inputNumber;   
	
		public PrimeByInterface(int inputNumber) 
		{
			this.inputNumber = inputNumber;
		}

		public void run() 
		{
			int flag=0;
			try
			{
				for(int i = 2 ; i <= inputNumber/2 ; i++)
				{
					if(inputNumber % i ==0 )
					{
						flag=1;    
						break;    
					}
				}
				
				if(flag == 0)
			  //if value of flag is not changed then it is prime.
				{
					System.out.println(inputNumber+" is prime number -> Checking by implementing Runnable interface.");   
				}
				else
				{
					System.out.println(inputNumber+" is not prime number -> Checking by implementing Runnable interface.");  
				}
				
				Thread.sleep(1000); 
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");   
			}
		}
		
	}

	public class PrimeClass  
	{
		                                        
		public static void main(String[] args) 
		{
			PrimeByClass firstObject = new PrimeByClass(24);
			//Creating an object of class PrimeByClass.
			
			PrimeByInterface tempObject = new PrimeByInterface(23);
			//Creating an object of class PrimeByInterface.
			
			Thread secondObject = new Thread(tempObject);
			
			firstObject.start();    
			secondObject.start();  			
		}  
	
	}    
