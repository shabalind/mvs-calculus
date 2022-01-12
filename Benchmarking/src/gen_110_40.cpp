  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const double &v2) {
    double v3 = v2;
    std::vector<s0> v8 = v1;
    const s0 v7 = v0[1];
    v8[1] = v7;
    v8[0] = v7;
    const double v4 = v2 * v3;
    const s0 v9 = v8[1];
    v8[1] = v7;
    v8[2] = v7;
    const s0 v15 = v0[1];
    double v35 = v2;
    const std::vector<std::vector<double>> v21 = v9.p1;
    const std::vector<double> v27 = v21[1];
    const std::vector<std::vector<double>> v33 = v15.p1;
    v3 = v2;
    double v63 = v2;
    std::vector<double> v30 = v27;
    const std::vector<double> v40 = v33[0];
    v30[0] = v2;
    const double v67 = v4 / v63;
    const double v28 = v40[0];
    v30[0] = v67;
    std::vector<double> v73 = v40;
    v73 = v40;
    v73[0] = v3;
    const double v80 = v30[0];
    const double v85 = v27[0];
    double v88 = v80;
    v73[0] = v35;
    const double v86 = v73[0];
    const std::vector<double> v151 { v2, v88, v28, v86, v4 };
    const double v119 = v151[2];
    double v259 = v119;
    v30[0] = v85;
    return v259;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } });
    std::vector<s0> v1({ { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } });
    double v2(20.0);
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
