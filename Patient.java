import java.io.*;

public class Patient{

private String name;
private int age; 
private int idno;

Patient()
{
}

Patient(String dataForName , int dataForAge , dataForIDNO){
   name = dataForName;
   age = dataForAge;
   idno = dataForIDNO;
  
}

public void setName(string dataForName)
{
name = dataForName;
}

public String getName()
{
return name;
}

public void setAge(int dataForAge)
{
age = dataForAge;
}


public void setIDNO(int dataForIDNO)
{
idno = dataForIDNO;
}

public int getIDNO()
{
return idno;
}

public String toString(){
String s = ("Name : " + name + "Age : " + age + "Patient ID NO :" + idno +);
return s;
}

}
