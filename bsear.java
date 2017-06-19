import java.util.Scanner;
class bsearch

{
public static void main(String as[])
{
int beg,end,mid,item;
int a[]={10,20,30,40,50,60,70,80,90,100};
Scanner sc = new Scanner(System.in);
System.out.println(" enter the item to be searched ");
item = sc.nextInt();
beg = 0;
end = a.length-1;
mid=(beg+end)/2;
while(mid!=end){
mid=(beg+end)/2;
if(a[mid]>item)
{
end = mid -1;

}
else
{
if(a[mid]==item)
break;
else
beg=mid+1;
}
}
if(a[mid]!=item)
System.out.println(" item not found!! ");
else
System.out.println(" item found!! index =  " +mid);


}





}