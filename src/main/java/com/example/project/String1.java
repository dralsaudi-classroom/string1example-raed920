package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
        if (s.size != this.size)
        	return false;
        for (int i = 0 ; i < s.size ; i++) {
        	if (s.str[i]!=this.str[i])
        		return false;
        	
        }
        return true ;
    }
    public void reverse() {
    	int count = this.size;
    	for (int i = 0 ; i <this.size ; i++) {
    		this.str[i]=this.str[count];
    	}
    }
    public static void main (String [] args) {
    	String1 s1 = new String1();
    	s1.append('1');
    	s1.append('2');
    	s1.append('3');
    	s1.append('4');
    	
    	String1 s2 = new String1();
    	s2.append('c');
    	s2.append('2');
    	System.out.println(s1.equal(s2));
    
    	s1.reverse();
    	System.out.println(s1.getChar(0));
    	

    	
    }
}
