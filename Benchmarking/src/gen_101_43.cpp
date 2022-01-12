  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f101(const s1 &v0) {
    s1 v7 = v0;
    const std::vector<s0> v3 = v7.p0;
    s1 v6 = v0;
    const std::vector<s0> v12 = v0.p1;
    v6.p1 = v12;
    v7 = v6;
    const std::vector<s0> v33 = v0.p0;
    const s1 v63(v33, v3);
    return v63;
  }
  s0 f39(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const s0 v25(v4);
    return v25;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    std::vector<s1> v7 = v0;
    const s1 v5 = v7[2];
    const s1 v3 = f101(v5);
    const s1 v18 = v0[0];
    v7[0] = v3;
    const std::vector<s0> v11 = v3.p1;
    double v14 = v1;
    const double v21 = v14 * v1;
    const s0 v19 = v11[0];
    const s0 v27 = f39(v19, v14);
    const s0 v24 = f39(v27, v21);
    const std::vector<std::vector<double>> v13 = v19.p0;
    const std::vector<double> v37 = v13[0];
    const double v53 = v37[0];
    v7[2] = v3;
    v7[2] = v18;
    double v67 = v53;
    const std::vector<std::vector<double>> v109 = v24.p0;
    const std::vector<double> v183 = v109[0];
    std::vector<double> v131 = v183;
    const double v123 = v131[0];
    v131[0] = v67;
    return v123;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 } } }, { { { 1.0 } } } }, { { { { 2.0 } } }, { { { 3.0 } } } } }, { { { { { 4.0 } } }, { { { 5.0 } } } }, { { { { 6.0 } } }, { { { 7.0 } } } } }, { { { { { 8.0 } } }, { { { 9.0 } } } }, { { { { 10.0 } } }, { { { 11.0 } } } } } });
    double v1(12.0);
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
