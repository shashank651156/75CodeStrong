class Solution{
    public boolean backspaceCompare(String s, String t) {
        int p1=0, p2 = 0;
        boolean ans;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){if (p1 > 0)a.deleteCharAt(--p1);}
            else {a.append(s.charAt(i));++p1;}
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#'){if (p2 > 0)b.deleteCharAt(--p2);}
            else {b.append(t.charAt(i));++p2;}
        }
        return a.toString().equals(b.toString());
    }
}