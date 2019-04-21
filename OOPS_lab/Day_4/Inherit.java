import java.io.*;
class Employee{
    String Emp_name;
    int Emp_code;
    String address;
    String phone_no;
    float DA;
    float HRA;
    Employee(String a,int b,String c,String d,float e,float f){
        this.Emp_name = a;
        this.Emp_code = b;
        this.address = c;
        this.phone_no = d;
        this.DA = e;
        this.HRA = f;
    }
}

class Teaching extends Employee{
    String Sub_sp;
    String desig;
    Teaching(String a,int b,String c,String d,float e,float f,String g,String h){
        super(a,b,c,d,e,f);
        this.Sub_sp = g;
        this.desig = h;
    }
}
class Office extends Employee{
    String desig;
    Office(String a,int b,String c,String d,float e,float f,String g){
        super(a,b,c,d,e,f);
        this.desig = g;
    }
}

class Faculty extends Teaching{
    float basic_pay;
    Faculty(String a,int b,String c,String d,float e,float f,String g,String h,float i){
        super(a,b,c,d,e,f,g,h);
        this.basic_pay = i;
    }
    
    public float salary(){
        return (this.basic_pay)*(1+this.DA+this.HRA);
    }
}
class Technical extends Teaching{
    float basic_pay;
    Technical(String a,int b,String c,String d,float e,float f,String g,String h,float i){
        super(a,b,c,d,e,f,g,h);
        this.basic_pay = i;
    }
    
    public float salary(){
        return (this.basic_pay)*(1+this.DA+this.HRA);
    }
}

class Admin extends Office{
    float basic_pay;
    Admin(String a,int b,String c,String d,float e,float f,String g,float h){
        super(a,b,c,d,e,f,g);
        this.basic_pay = h;
    }

    public float salary(){
        return (this.basic_pay)*(1+this.DA+this.HRA);
    }
}
class Accounts extends Office{
    float basic_pay;
    Accounts(String a,int b,String c,String d,float e,float f,String g,float h){
        super(a,b,c,d,e,f,g);
        this.basic_pay = h;
    }

    public float salary(){
        return (this.basic_pay)*(1+this.DA+this.HRA);
    }
}

class Inherit1{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1:Faculty\n2:Technicial\n3:Admin\n4:Accounts");
        int choice = Integer.parseInt(br.readLine());

        System.out.println("Enter Name:");
        String a = br.readLine();
        System.out.println("Enter Code:");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Enter Address:");
        String c = br.readLine();
        System.out.println("Enter Phone Number:");
        String d = br.readLine();
        System.out.println("Enter DA:");
        float e = Float.parseFloat(br.readLine());
        System.out.println("Enter HRA:");
        float f = Float.parseFloat(br.readLine());
        System.out.println("Enter Designation:");
        String g = br.readLine();
        switch(choice){
            case 1:
            System.out.println("Enter Subject Speacialisation:");
            String h = br.readLine();

            System.out.println("Enter Basic Pay:");
            float pay = Float.parseFloat(br.readLine());

            Faculty obj = new Faculty(a,b,c,d,e,f,h,g,pay);
            System.out.println(obj.Emp_name);
            System.out.println(obj.Emp_code);
            System.out.println(obj.address);
            System.out.println(obj.phone_no);
            System.out.println(obj.Sub_sp);
            System.out.println(obj.desig);
            System.out.println(obj.salary());

            break;


            case 2:
            System.out.println("Enter Subject Speacialisation:");
            String h1 = br.readLine();

            System.out.println("Enter Basic Pay:");
            float pay1 = Float.parseFloat(br.readLine());

            Technical obj1 = new Technical(a,b,c,d,e,f,h1,g,pay1);
            System.out.println(obj1.Emp_name);
            System.out.println(obj1.Emp_code);
            System.out.println(obj1.address);
            System.out.println(obj1.phone_no);
            System.out.println(obj1.Sub_sp);
            System.out.println(obj1.desig);
            System.out.println(obj1.salary());

            break;


            case 3:
            System.out.println("Enter Basic Pay:");
            float pay2 = Float.parseFloat(br.readLine());
            Admin obj2 = new Admin(a,b,c,d,e,f,g,pay2);
            System.out.println(obj2.Emp_name);
            System.out.println(obj2.Emp_code);
            System.out.println(obj2.address);
            System.out.println(obj2.phone_no);
            
            System.out.println(obj2.desig);
            System.out.println(obj2.salary());

            break;
            case 4:
            System.out.println("Enter Basic Pay:");
            float pay3 = Float.parseFloat(br.readLine());
            Accounts obj3 = new Accounts(a,b,c,d,e,f,g,pay3);
            System.out.println(obj3.Emp_name);
            System.out.println(obj3.Emp_code);
            System.out.println(obj3.address);
            System.out.println(obj3.phone_no);
            
            System.out.println(obj3.desig);
            System.out.println(obj3.salary());

            break;
            default:
            System.out.println("INVALID CHOICE");
        }
    }
}