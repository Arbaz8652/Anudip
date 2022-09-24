import java.util.*;
class pattern{
    public static void main(String[] args){
        System.out.println("Hello..!");
        try (Scanner ab = new Scanner(System.in)) {
            while(true){
            System.out.print("what pattern do you want to generate\nenter 1 for tiangle pattern  :-\nenter 2 for pyramid pattern  :-\nenter 3 for diamond pattern  :-\nenter 4 for sandclock pattern:-\nenetr 5 for indside diamon   :-\nenter 6 for diamond series   :-\nenter 7 for star pattee :-\n");
            int c = ab.nextInt();
            if(c==1){
                System.out.println("Enter how many row you want in your shape:- ");
                int a = ab.nextInt();
                System.out.println("this is how Trangle pattern looks like");
                trianglepattern(a);
            }else if(c==2){
                System.out.println("Enter how many row you want in your shape:- ");
                int a = ab.nextInt();
                System.out.println("this is how pyramid patter looks like");
                pyramidpattern(a);
            }else if(c==3){
                System.out.println("Enter how many row you want in your shape:- ");
                int a = ab.nextInt();
                System.out.println("this is how diamon pattern looks like");
                diamondpattern(a);
            }else if(c==4){
                System.out.println("Enter how many row you want in your shape:- ");
                int a = ab.nextInt();
                System.out.println("this is how sandclock pattern looks like");
                sandglasspattern(a);
            }else if(c==5){
                System.out.println("Enter how many row you want in your shape:- ");
                int a = ab.nextInt();
                System.out.println("this is how insidediamond pattern looks like");
                insidediamond(a);
            }else if(c==6){
                System.out.println("Enter how many row you want in your shape     :- ");
                int a = ab.nextInt();
                System.out.println("Enter number of diamon you want in your series:- ");
                int b = ab.nextInt();
                System.out.println("this is how series diamond pattern looks like");
                sereisdiamon(a, b);
            }else if (c==7){
                System.out.println("enter size of the star below 10");
                int a=ab.nextInt();
                System.out.println("this is how star pattern looks like");
                starpatter(a);
            }else{
                System.out.println("envalid argument");
                break;
                
            }
            
             }
        }
    }
    static void trianglepattern(int a){
        for (int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    static void pyramidpattern(int a){
        for (int i=1;i<=a;i++){
            for(int k=a;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    static void diamondpattern(int a){
        for(int i=1;i<=a;i++){
            for(int k=a;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        for(int s=1;s<=a;s++){
            System.out.print(" ");
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for (int d=a-1;d>=s;d--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        }
    static void sandglasspattern(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=0; k<=a-i;k++){
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i=a-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=a-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void insidediamond(int a){
        for(int i=1;i<=a;i++){
            for(int j=i;j<=a;j++){
                System.out.print("O");
            }
            for(int k=1;k<=i;k++){
                    System.out.print("  ");
            }
            for(int l=a;l>=i;l--){
                    System.out.print("O");
            }
                System.out.println();
        }
        for(int i=1;i<=a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("O");
            }
            for(int k=a;k>=i;k--){
                    System.out.print("  ");
            }
            for(int l=0;l<=i-2;l++){
                    System.out.print("O");
            }
                System.out.println();
        }
        
    } 
    static void sereisdiamon(int a,int b){
        for(int i=1;i<=a;i++){
            for(int s=1;s<=b;s++){
            for(int j=i;j<=a;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=2;k<=i;k++){
                System.out.print("  ");
            }
            System.out.print("*");
            for (int m=i;m<=a-1;m++){
                System.out.print(" ");
            }
            }
            System.out.println();
        }
        for (int i=1;i<=a;i++){
            for(int d=1;d<=b;d++){
            for(int l=1;l<=i;l++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=i;j<=a-1;j++){
                System.out.print("  ");
            }
            System.out.print("*");
            for(int n=2;n<=i;n++){
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
    static void starpatter(int a){
        for(int i=1;i<=a;i++){
            for(int k=i;k<=a;k++){
                System.out.print(" ");
            }
            //first pyramid
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            //second # inverted pyramid
            for(int b=i;b<a;b++){
                System.out.print("  ");}
                System.out.print("*");
            //3rd pyramid  
            for(int c=2;c<=i;c++){
                System.out.print("  ");}
                System.out.print("*");
            // for last bottom star line for 1st block
            System.out.println(); 
        }
        //for line break
        for(int ll=1;ll<=a;ll++){
            System.out.print(" *");
        }
        for(int oo=1;oo<=a;oo++){
            System.out.print("  ");
        }
        for(int pp=1;pp<=a;pp++){
            System.out.print(" *");
        }
        System.out.println();

        //second bolck
        for (int d=2; d<=a;d++){
            for(int e=1;e<=d;e++){
                System.out.print(" "); }   
                System.out.print("*");
            //first inverted pyramid of 2nd block
            for(int f=d;f<=a*3-2;f++){
                System.out.print("  ");
            }
            System.out.println(" *");
        }

        //third block
        for(int g=1;g<=a;g++){
            for(int h=g;h<=a;h++){
                System.out.print(" ");}
                System.out.print("*");
    
                // spaces
            for(int m=4;m<=4*a;m++){
                System.out.print(" ");
            }
        
            //3rd block last pyramid
            for(int n=1;n<=g;n++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
        // for line
        for(int o=1;o<=a;o++){
            System.out.print("* ");
        }
        for(int p=1;p<=a;p++){
            System.out.print("  ");
        }
        for(int q=0;q<=a;q++){
            System.out.print("* ");
        }
        System.out.println();
        //4the blockl
        for(int r=1;r<=a;r++){
            for(int s=2;s<=2*a;s++){
                System.out.print(" ");
            }
            for(int t=1;t<=r;t++){
                System.out.print(" ");
            }
            System.out.print("*"); 
            for(int u=r+1;u<=a;u++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
