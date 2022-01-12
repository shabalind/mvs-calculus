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
    std::vector<s0> p1;
    s0 p2;
    s1(s0 v0, std::vector<s0> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s1 p0;
    std::vector<s2> p1;
    s7(s1 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s7 &v1, const double &v2) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<double> v4 = v3[0];
    std::vector<std::vector<double>> v8 = v3;
    v8[0] = v4;
    v8 = v3;
    v8[0] = v4;
    const std::vector<double> v18 = v8[0];
    v8 = v3;
    const double v34 = v18[0];
    double v56 = v34;
    double v99 = v56;
    return v99;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 } } });
    s7 v1({ { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } } });
    double v2(30.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
