package array;

import java.util.Arrays;

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;
        int childPointer = 0;
        int cookiePointer = 0;

        while(childPointer < g.length && cookiePointer < s.length){
            if(s[cookiePointer] >= g[childPointer]){
                contentChildren++;
                childPointer++;
            }
            cookiePointer++;
        }
        return contentChildren;
    }

    public static void main(String[] args){
    	AssignCookies cookies = new AssignCookies();
        int[] g = {1,2,3};
        int[] s = {1,1};

        int maxContentChildren = cookies.findContentChildren(g,s);
        System.out.println(maxContentChildren);
    }
}
