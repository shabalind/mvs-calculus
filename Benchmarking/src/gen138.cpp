  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s0 p0;
    s2 p1;
    s6(s0 v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f70(const double &v0) {
    double v2 = v0;
    double v5 = v2;
    double v8 = v2;
    double v1 = v5;
    const std::vector<double> v4 { v1 };
    std::vector<double> v11 = v4;
    v11[0] = v8;
    double v7 = v1;
    v11[0] = v8;
    const double v14 = v4[0];
    const double v29 = v11[0];
    v11[0] = v7;
    double v40 = v29;
    v11[0] = v14;
    return v40;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const double &v1) {
    double v3 = v1;
    double v81 = v3;
    double v82 = v81;
    double v48 = v82;
    v81 = v48;
    const double v141 = f70(v81);
    return v141;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } } } }, { { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } } } } });
    double v1(30.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
