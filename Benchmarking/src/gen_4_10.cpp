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
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s1 &v1, const double &v2) {
    double v7 = v2;
    const s0 v3 = v0[0];
    const std::vector<std::vector<double>> v8 = v3.p1;
    const std::vector<double> v14 = v8[2];
    v7 = v2;
    const double v15 = v14[0];
    const s0 v25 = v1.p0;
    std::vector<double> v23 = v14;
    std::vector<double> v17 = v23;
    const double v40 = v14[0];
    const std::vector<std::vector<double>> v32 = v25.p0;
    const std::vector<double> v31 = v32[0];
    v23 = v31;
    v17[0] = v2;
    v23[0] = v15;
    v23[0] = v7;
    const double v109 = v17[0];
    v23[0] = v40;
    const double v139 = v7 + v109;
    return v139;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    s1 v1({ { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } });
    double v2(16.0);
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
