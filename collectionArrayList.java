import java.util.*;

public class collectionArrayList{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    // HashSet<String> list = new HashSet<String>();
    // list.add("kitkat");
    // list.add("fivestar");
    // list.add("kitkat");
    // list.add("kitkat");
    // Iterator itr = list.iterator();
    // System.out.println(list.size());
    // while(itr.hasNext()){
    //   System.out.println(itr.next());
    // }
    String[] v={ "victor", "veronica", "ryan", "dave", "maria", "farah", "farah", "ryan", "veronica" };
Arrays.sort(v);
  HashMap<String,Integer> hm=new HashMap<String,Integer>();
for(String v1:v)
{
if(hm.containsKey(v1))
{
hm.put(v1,hm.get(v1)+1);
}
else
hm.put(v1,1);
}

Integer max=0;
  for(Map.Entry<String,Integer> m:hm.entrySet()){
int k=m.getValue();
if(k>max)
{
	max=k;
}

}
String s="";

for(Map.Entry<String,Integer> m :hm.entrySet()){
	if(max.equals(m.getValue())){
	 s = m.getKey();
		break;
	}

}
	System.out.println(s);


  }
}
