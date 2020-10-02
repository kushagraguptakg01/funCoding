void fun(int a)
{
	vector<int> v;
	for(int i=a; i!=0; i=i/10)
	{
		int x=a%10;
		v.push_back(x);
	}
	for(auto &elem : v)
		cout<<elem<<" "<<endl;
}
