  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f15(const std::vector<s0> &v0) {
    std::vector<s0> v2 = v0;
    const s0 v5 = v2[0];
    std::vector<s0> v10 = v2;
    const std::vector<std::vector<double>> v6 = v5.p1;
    std::vector<std::vector<double>> v14 = v6;
    const s0 v11 = v10[1];
    const std::vector<double> v20 = v5.p0;
    std::vector<double> v12 = v20;
    s0 v25 = v11;
    v2[1] = v5;
    std::vector<s0> v18 = v10;
    const std::vector<double> v31 = v14[0];
    v14[0] = v12;
    const std::vector<double> v22 = v5.p0;
    const std::vector<std::vector<double>> v13 = v11.p1;
    v18[0] = v25;
    v25.p0 = v31;
    const std::vector<std::vector<double>> v42 = v25.p1;
    v14[0] = v22;
    v25.p1 = v6;
    v25.p1 = v13;
    v25.p0 = v22;
    v25.p1 = v42;
    std::vector<s0> v53 = v18;
    v25.p0 = v22;
    return v53;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const std::vector<s0> &v2, const double &v3) {
    std::vector<s0> v7 = v1;
    const s0 v13 = v0[1];
    v7[0] = v13;
    const std::vector<s0> v8 = f15(v7);
    const s0 v4 = v7[1];
    const std::vector<s0> v21 = f15(v8);
    const s0 v14 = v21[1];
    const std::vector<double> v18 = v14.p0;
    v7 = v1;
    const std::vector<double> v32 = v4.p0;
    const double v55 = v32[0];
    const double v37 = v18[0];
    const double v94 = v37 * v55;
    return v94;
  }
  int main() {
    std::vector<s0> v0({ { { 0.0 }, { { 1.0 } } }, { { 2.0 }, { { 3.0 } } }, { { 4.0 }, { { 5.0 } } } });
    std::vector<s0> v1({ { { 6.0 }, { { 7.0 } } }, { { 8.0 }, { { 9.0 } } } });
    std::vector<s0> v2({ { { 10.0 }, { { 11.0 } } }, { { 12.0 }, { { 13.0 } } }, { { 14.0 }, { { 15.0 } } } });
    double v3(16.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
