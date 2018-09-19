#include <bits/stdc++.h>
using namespace std;
inline void fastIO(){ios::sync_with_stdio(false), cin.tie(0), cout.tie(0);}
typedef long long int ll;
void love() {
    int n, dist; cin>>n;
    string s, t;
    
    cin>>s>>t;
    
    int ans = 0;
    
    // Logic start
    for(int i = 0; i<s.length(); i++) {
        if(s[i] != t[i]) {
            if(s[i] < t[i]) {
                dist = t[i]-s[i];
                if(dist >= 13) ans += 1 + dist-13; // 1 is counting the day to increment s[i] by 13
                else ans += dist;
            }
            else {
                dist = 'Z' - s[i] + t[i]-'A' + 1;
                if(dist >=13) ans += 1 + dist-13; // 1 is counting the day to increment s[i] by 13
                else ans += dist;
            }
        }
    }
    
    // Print output
    cout<<ans<<"\n";
}
int main(){
    fastIO();
    int t = 1;
    while(t--) love();
    return 0;
}