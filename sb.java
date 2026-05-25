public class sb{
public static void main(String[] args){
StringBuilder sb = new StringBuilder("SHAMBHAVI !");
System.out.println(sb);
//charAt(index)
System.out.println(sb.charAt(3));
//setcharat(index and char)
sb.setCharAt(10, 'J');
System.out.println(sb);
//inserting character
sb.insert(11, '7');
System.out.println(sb);
//deleting char (deleted 7)
sb.delete(11,12);
System.out.println(sb);
//appending i.e adding char
StringBuilder sbb = new StringBuilder("H");
sbb.append("E");
sbb.append("L");
sbb.append("L");
sbb.append("0");
System.out.println(sbb);
System.out.println(sbb.length());
}}

//C:\Users\Sai\Desktop\cityconnect>java sb.java
//SHAMBHAVI !
//M
//SHAMBHAVI J
//SHAMBHAVI J7
//SHAMBHAVI J
//HELL0
//5