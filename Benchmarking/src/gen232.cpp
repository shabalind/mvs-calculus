  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f2(const double &v0) {
    double v3 = v0;
    double v6 = v0;
    v6 = v0;
    v3 = v6;
    const double v2 = v0 + v6;
    double v5 = v3;
    const double v8 = v3 / v2;
    double v9 = v3;
    const double v23 = v5 + v8;
    double v18 = v5;
    double v31 = v23;
    double v15 = v31;
    double v57 = v3;
    double v19 = v15;
    v31 = v57;
    const std::vector<double> v27 { v23 };
    v15 = v6;
    v57 = v5;
    double v43 = v18;
    const std::vector<double> v60 { v15, v0, v23, v8 };
    const double v52 = v60[0];
    std::vector<double> v42 = v27;
    v42[0] = v57;
    const std::vector<std::vector<double>> v70 { v42, v42, v27, v27, v42 };
    v42[0] = v19;
    v42[0] = v52;
    v42[0] = v43;
    const std::vector<double> v162 = v70[0];
    std::vector<double> v164 = v162;
    v164[0] = v9;
    const double v92 = v164[0];
    return v92;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s2 &v1, const double &v2) {
    const double v4 = f2(v2);
    const double v3 = f2(v2);
    double v6 = v4;
    const double v10 = f2(v3);
    const double v86 = f2(v10);
    const double v92 = v86 + v6;
    return v92;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
    s2 v1({ { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } });
    double v2(24.0);
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
