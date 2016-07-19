function g(k) 
{
	if(k <= 1) 
	{
		return 1;
	}
	return (g(k-1)) + (g(k - 2))
}

function f(n)
{
	if(!n)
	{
		return 1;
	}
	return f(n-1)*g(n)
}

var i = 2 * '10';

alert('i: ' + i)
alert('g(i): ' + g(i));
alert('f(i): ' + f(i));