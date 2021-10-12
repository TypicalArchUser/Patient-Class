import java.io.*;
public class PatientManager{

int cnt = 0;
Patient[] patient = new Patient[10];

PatientManager()throws Exception
{
      BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));         
      BufferedReader inFile = new BufferedReader (new FileReader (new File ("Patient.txt")));


   while(line != null){
   
   String [] field = line.split("#");
   int age = Integer.parseInt(field[1]);
   int idno = Integer.parseInt(field[2]);
   Patient[cnt]  = new Patient(field[0], age , idno)
   System.out.println("Patient age and id no : "+Patient[cnt])
   
   line = inFile.readLine();
   cnt++;
   
   }
   
   /*
   
   Program is not fully completed , Can we please go over these methods in class ,
   I do not understand some of them, the sort method makes sense because you explained it in class.
   
   */
   

  }
}
