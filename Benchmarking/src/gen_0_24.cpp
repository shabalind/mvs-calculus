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
  s1 f44(const s1 &v0) {
    const std::vector<s0> v2 = v0.p0;
    const s1 v13(v2, v2);
    const std::vector<s0> v22 = v0.p0;
    const std::vector<s0> v86 = v13.p1;
    const s1 v64(v86, v22);
    s1 v203 = v64;
    return v203;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v2 = f44(v0);
    double v3 = v1;
    const std::vector<s0> v9 = v2.p1;
    const s0 v4 = v9[1];
    const std::vector<std::vector<double>> v29 = v4.p1;
    std::vector<std::vector<double>> v22 = v29;
    const std::vector<double> v28 = v22[0];
    const std::vector<double> v27 = v22[0];
    const double v26 = v27[0];
    const std::vector<double> v40 = v22[0];
    v22[0] = v40;
    const double v58 = v28[0];
    const double v48 = v58 * v3;
    const double v81 = v1 * v48;
    const double v89 = v26 / v81;
    return v89;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } });
    double v1(16.0);
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
