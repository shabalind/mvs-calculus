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
  double f1(const double &v0) {
    double v6 = v0;
    double v3 = v6;
    double v11 = v0;
    const std::vector<double> v4 { v11 };
    const double v15 = v4[0];
    std::vector<double> v2 = v4;
    v11 = v3;
    std::vector<double> v10 = v2;
    v2[0] = v15;
    const double v30 = v2[0];
    std::vector<double> v28 = v10;
    v2[0] = v30;
    const double v13 = v28[0];
    v10 = v4;
    return v13;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s2> &v1, const double &v2) {
    double v5 = v2;
    const std::vector<s0> v8 = v0.p1;
    const double v7 = v5 * v5;
    v5 = v2;
    const s0 v46 = v8[0];
    const std::vector<std::vector<double>> v23 = v46.p0;
    const double v44 = f1(v7);
    const std::vector<double> v33 = v23[0];
    std::vector<double> v38 = v33;
    const double v26 = v38[0];
    v38[0] = v44;
    return v26;
  }
  int main() {
    s2 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } });
    std::vector<s2> v1({ { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } }, { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } } });
    double v2(32.0);
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
