  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s2 f32(const s2 &v0) {
    const std::vector<s0> v4 = v0.p1;
    s2 v2 = v0;
    const s0 v6 = v2.p0;
    const s2 v1(v6, v4);
    v2.p0 = v6;
    v2.p1 = v4;
    v2 = v0;
    s2 v55 = v1;
    return v55;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s2 v3 = f32(v0);
    const s0 v5 = v3.p0;
    const std::vector<std::vector<double>> v6 = v5.p0;
    const std::vector<double> v13 = v6[1];
    std::vector<std::vector<double>> v12 = v6;
    v12[0] = v13;
    const std::vector<double> v22 = v12[0];
    const double v29 = v22[0];
    const double v47 = v29 * v1;
    return v47;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } });
    double v1(6.0);
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
