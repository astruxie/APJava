static int recursiveSum(int n){
	//base case
	if (n == 1)
		return 1;

	//reduction step
	else
		return n + recursiveSum(n - 1);
}