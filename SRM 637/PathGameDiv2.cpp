// CUT begin
// {{{ Headers
// vim:filetype=cpp:foldmethod=marker:foldmarker={{{,}}}
// CUT end

#include <cassert>
#include <cctype>
#include <cmath>
#include <climits>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <ctime>

#include <algorithm>
#include <deque>
#include <functional>
#include <iterator>
#include <list>
#include <map>
#include <numeric>
#include <queue>
#include <set>
#include <stack>
#include <string>
#include <utility>
#include <vector>
#include <typeinfo>

#include <fstream>
#include <iostream>
#include <sstream>

#include <ext/numeric>

using namespace std;
using namespace __gnu_cxx;
// CUT begin
// }}}
// CUT end

typedef long long int64;
#define len(a) (int) a.size ()
const int INF = 0x3f3f3f3f;
// CUT begin
// {{{ Unused templates and debug
const double EPS = 1e-9;
const double PI = 3.14159265358979323846264338328;
const long long LINF = (long long) 1e16 + 5;

template <class T> inline int toInt (const T& t) { int n; stringstream ss; ss << t; ss >> n; return n; }
template <class T> inline string toStr (const T& t) { stringstream ss; ss << t; return ss.str(); }
template <class T> inline int64 toInt64 (const T& t) { int64 n; stringstream ss; ss << t; ss >> n; return n; }
template <typename T> int sgn (T val) { return (T(0) < val) - (val < T(0)); }
template <class T> T gcd (T a, T b) { T r; while (b) { r = a % b; a = b; b = r; } return a; }
template <class T> T lcm (T a, T b) { return a / gcd (a, b) * b; }

// Overloading ostream for printing STL containers (pair, vector, set, map)
template <typename T1, typename T2>
inline std::ostream &operator << (std::ostream &os, const std::pair <T1, T2> &p) {
    return os << "(" << p.first << ", " << p.second << ")";
}
template <typename T>
inline std::ostream &operator << (std::ostream &os, const std::vector <T> &v) {
    bool first = true;
    os << "[";
    for (unsigned int i = 0; i < v.size(); i++) {
        if (! first)
            os << ", ";
        os << v[i];
        first = false;
    }
    return os << "]";
}
template <typename T>
inline std::ostream &operator << (std::ostream &os, const std::set <T> &S) {
    bool first = true;
    os << "set([";
    for (typename std::set <T>::const_iterator it = S.begin(); it != S.end(); ++it) {
        if (! first)
            os << ", ";
        os << *it;
        first = false;
    }
    return os << "])";
}
template <typename T1, typename T2>
inline std::ostream &operator << (std::ostream &os, const std::map <T1, T2> &d) {
    bool first = true;
    os << "{";
    for (typename std::map<T1, T2>::const_iterator it = d.begin(); it != d.end(); ++it) {
        if (! first)
            os << ", ";
        os << it->first << ": " << it->second;
        first = false;
    }
    return os << "}";
}

// Color codes for highlighting debugs.
// Does not work within macvim due to dumb terminal.
#ifdef MVIM
    #define COLOR_CLEAR ""
    #define COLOR_RED ""
    #define COLOR_GREEN ""
    #define COLOR_MAGENTA ""
    #define COLOR_CYAN ""
#else
    #define COLOR_CLEAR "\033[0m"
    #define COLOR_RED "\033[31m"
    #define COLOR_GREEN "\033[32m"
    #define COLOR_MAGENTA "\033[35m"
    #define COLOR_CYAN "\033[36m"
#endif

// A macro to print statement and execute it.
#define exec(args...) cerr << COLOR_CYAN << #args << 'n' << COLOR_CLEAR; args

// A macro to print arrays.
#define print(arr, _N) { cerr << COLOR_RED << ">>> " << #arr << " " << #_N << COLOR_CLEAR << " #--> "; for (int _i = 0; _i < _N; _i++) cerr << arr [_i] << " "; putchar ('n'); }

// A macro to print 2d arrays.
#define print2(arr, _R, _C) { cerr << COLOR_RED << ">>> " << #arr << " " << #_R << " " << #_C << COLOR_CLEAR << " #-->n";\
    for (int _i = 0; _i < _R; _i++) { \
        for (int _j = 0; _j < _C; _j++) cerr << arr [_i][_j] << " ";\
        putchar ('n'); } };

// debug () can print vector, set, map, pairs etc now.
#define debug(args...) { cerr << COLOR_RED << ">>> " << #args << COLOR_CLEAR << " #--> "; dbg, args; cerr << endl; }
struct debugger {
    template <typename T> debugger& operator, (const T v) {
        cerr << v << " ";
        return *this; 
    }
} dbg;
// }}}
// CUT end

struct PathGameDiv2 {
    int
    calc(vector<string> board) {
        return 0;
    }
};

// CUT begin
// {{{  Test Code
 // Array to vector converter
template <typename T> vector<T> vector_wrapper(T arr[], int n) { return vector<T>(arr, arr + n); }
#define to_vector(arr) vector_wrapper(arr, sizeof(arr) / sizeof(arr[0]))

template <typename T> string to_str(T t) { stringstream s; typeid(T) == typeid(string) ? s << "\"" << t << "\"" : s << t; return s.str(); }

bool do_test(vector<string> board, int __expected, int caseNo) {
    time_t startClock = clock();
    PathGameDiv2 *instance = new PathGameDiv2();
    int __result = instance->calc(board);
    double elapsed = (double)(clock() - startClock) / CLOCKS_PER_SEC;
    delete instance;

    if (__result == __expected) {
        cout << COLOR_GREEN << "[  PASSED  ]" << COLOR_CLEAR;
        cout << " PathGameDiv2." << COLOR_GREEN << "Test" << caseNo << " " << COLOR_CLEAR;
        cout << "(" << elapsed << " seconds)" << endl;
        return true;
    }
    else {
        cout << COLOR_RED << "[  FAILED  ]" << COLOR_CLEAR;
        cout << " PathGameDiv2." << COLOR_RED << "Test" << caseNo << " " << COLOR_CLEAR;
        cout << "(" << elapsed << " seconds)" << endl;
        cout << "   Expected: " << to_str(__expected) << endl;
        cout << "   Received: " << to_str(__result) << endl;
        return false;
    }
}

int run_testcase(int __no) {
    switch (__no) {
        case 0: {
            string board[] = {
                "#....",
                "...#."
            };
            int __expected = 2;
            #ifdef LOCALHOST
            return do_test(to_vector(board), __expected, __no);
            #endif
            int ret = do_test(to_vector(board), __expected, __no);
            if (! ret) {
                debug (to_vector(board));
                cout << endl;
            }
            return ret;
        }
        case 1: {
            string board[] = {
                "#",
                "."
            };
            int __expected = 0;
            #ifdef LOCALHOST
            return do_test(to_vector(board), __expected, __no);
            #endif
            int ret = do_test(to_vector(board), __expected, __no);
            if (! ret) {
                debug (to_vector(board));
                cout << endl;
            }
            return ret;
        }
        case 2: {
            string board[] = {
                ".",
                "."
            };
            int __expected = 1;
            #ifdef LOCALHOST
            return do_test(to_vector(board), __expected, __no);
            #endif
            int ret = do_test(to_vector(board), __expected, __no);
            if (! ret) {
                debug (to_vector(board));
                cout << endl;
            }
            return ret;
        }
        case 3: {
            string board[] = {
                "....#.##.....#...........",
                "..#......#.......#..#...."
            };
            int __expected = 13;
            #ifdef LOCALHOST
            return do_test(to_vector(board), __expected, __no);
            #endif
            int ret = do_test(to_vector(board), __expected, __no);
            if (! ret) {
                debug (to_vector(board));
                cout << endl;
            }
            return ret;
        }

        // Your custom testcases goes here
        case 4: {
        }

        default: break;
    }
    return -1;  // No more test cases.
}

int main(int argc, char *argv[]) {
    cout.setf(ios::fixed,ios::floatfield);
    cout.precision(2);
    
    bool mainProcess = true;
    set<int> testCases;
    for (int i = 1; i < argc; i++) {
        if ( string(argv[i]) == "-" ) {
            mainProcess = false;
        } else {
            testCases.insert( atoi(argv[i]) );
        }
    }
    if (testCases.size() == 0) {
        for (int i = 0; i < 4 + 5; i++) {
            testCases.insert(i);
        }
    }
    if (mainProcess) {
        cout << "PathGameDiv2 (500 Points)" << endl << endl;
    }

    int nPassed = 0, nTotal = 0;
    
    for (set <int>::iterator it = testCases.begin (); it != testCases.end (); ++it) {
        if ( testCases.empty()  || testCases.count(*it) ) {
            //run
            int __testcaseStatus = run_testcase (*it);
            if (__testcaseStatus == -1) break;
            nPassed += __testcaseStatus;
            nTotal++;
        }
    }
    if (mainProcess) {
        cout << endl << "Passed : " << nPassed << "/" << nTotal << " cases" << endl;
        int T = time(NULL) - 1414526817;
        double PT = T / 60.0, TT = 75.0;
        cout << "Time   : " << T / 60 << " minutes " << T % 60 << " secs" << endl;
        cout << "Score  : " << 500 * (0.3 + (0.7 * TT * TT) / (10.0 * PT * PT + TT * TT)) << " points" << endl;
    }
    return 0;
}
// }}}
// CUT end
