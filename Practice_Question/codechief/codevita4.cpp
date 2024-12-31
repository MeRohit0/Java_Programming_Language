#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;
/*buzzday problem 
    step 1 : input 
    step 2 : find divisor
    step 3 : getting best solution 
*/
int main() 
{
    int n;
    cin >> n;
    //input 4 value 
    vector<int> ids(n), costs(n);
    int budget;
    for (int i = 0; i < n; i++) cin >> ids[i];
    for (int i = 0; i < n; i++) cin >> costs[i];

    cin >> budget;
    int maxcost = 0, maxforwrork = 0;

    for (int i = 0; i < n; i++) 
    {
        int buyCost = costs[i];
        int maxQty = budget / buyCost;


        if (maxQty > 0) 
        {
            int costforid = 0;
            int x = 0;
     // Iterate over each item to check the free items that can be obtained

        for (int j = 0; j < n; j++) 
        {
            if (i != j && ids[i] % ids[j] == 0) 
            {
                costforid += maxQty;
                x += costs[j] * maxQty;
            }
        }
            //Find all divisors of item ID
        if (costforid > maxcost || (costforid == maxcost && x > maxforwrork))
        {
            maxcost = costforid;
            maxforwrork = x;
        }
        }
    }
    cout << maxcost << " " << maxforwrork << endl;
    return 0;
}