import java.util.*;
class digitDP{
    private static List<Integer> dig = new ArrayList<>();
    public static int dfs(int x,int pre,int ye,int limit)
    {
    	if(x<0) return ye;
    	int ans = d[x][pre][ye];
    	if(ans!=-1) return ans;
    	LL res = 0;
    	int last = limit?dig.get(x):9;
    	for(int i=0;i<=last;++i)
    		res += dfs(x-1,i,ye || (当前数满足条件),limit && i==last)
    	if(!limit) d[x][pre][ye] =res;
    	return res;
    }
    public static int solve(int n)
    {
    	int len = 0;
    	while(n)
    	{
    		dig.add(n%10);
    		n /= 10;
            len++;
    	}
    	return dfs(len-1,0,1);
    }
    public static void main(String[] args) {
        int a=2;
        int res = solve(a);
    }
}
