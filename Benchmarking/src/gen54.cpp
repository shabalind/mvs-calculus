  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    std::vector<s1> p1;
    s4(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s1 f33(const s1 &v0) {
    s1 v4 = v0;
    s1 v8 = v0;
    const std::vector<s0> v6 = v4.p1;
    v8.p1 = v6;
    std::vector<s0> v3 = v6;
    const std::vector<s0> v5 = v8.p1;
    const s0 v1 = v5[0];
    const std::vector<s0> v7 = v0.p1;
    v3 = v7;
    s0 v10 = v1;
    s0 v2 = v1;
    v3[0] = v10;
    v3[0] = v2;
    v4.p1 = v3;
    v8.p1 = v3;
    v8.p1 = v5;
    v4.p1 = v5;
    return v8;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    double v5 = v1;
    const s1 v10 = v0.p0;
    const s1 v3 = f33(v10);
    const std::vector<s0> v8 = v3.p0;
    const s0 v9 = v8[0];
    const std::vector<std::vector<double>> v20 = v9.p1;
    double v16 = v1;
    const std::vector<double> v23 = v20[0];
    const double v25 = v5 - v16;
    std::vector<double> v53 = v23;
    v53[0] = v25;
    double v43 = v16;
    const double v120 = v53[0];
    v53[0] = v1;
    v53[0] = v43;
    return v120;
  }
  int main() {
    s4 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } }, { { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } } });
    double v1(18.0);
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
