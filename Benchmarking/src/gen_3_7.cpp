  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const s0 v3 = v0[0];
    const std::vector<std::vector<double>> v6 = v3.p0;
    const std::vector<double> v11 = v6[0];
    const double v5 = v2 - v2;
    const double v15 = v11[0];
    const std::vector<double> v8 = v6[0];
    const double v20 = v5 + v2;
    std::vector<double> v28 = v11;
    std::vector<double> v33 = v28;
    const double v30 = v8[0];
    std::vector<double> v49 = v33;
    v33[0] = v15;
    v49[0] = v15;
    v49[0] = v15;
    const double v39 = v5 + v30;
    double v70 = v20;
    const double v66 = v8[0];
    v28[0] = v66;
    v28[0] = v5;
    v28[0] = v70;
    v33[0] = v39;
    const double v106 = v49[0];
    return v106;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } });
    s0 v1({ { { 6.0 } }, { { 7.0 }, { 8.0 } } });
    double v2(9.0);
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
