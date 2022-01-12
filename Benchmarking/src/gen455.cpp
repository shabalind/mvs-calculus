  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f85(const double &v0) {
    double v5 = v0;
    const std::vector<double> v1 { v0, v5 };
    const double v6 = v1[0];
    const double v7 = v1[1];
    const double v10 = v1[0];
    const double v14 = v1[1];
    const double v9 = v1[0];
    const std::vector<double> v12 { v6, v5 };
    const double v34 = v12[1];
    const std::vector<double> v18 { v14, v0, v10, v0, v6, v34 };
    std::vector<double> v28 = v18;
    v28[2] = v7;
    const double v19 = v28[4];
    std::vector<double> v38 = v28;
    const double v42 = v38[2];
    v38[1] = v19;
    v5 = v9;
    return v42;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    double v3 = v1;
    v3 = v1;
    const double v2 = f85(v1);
    const double v5 = f85(v1);
    v3 = v5;
    double v14 = v3;
    const double v28 = v2 / v14;
    return v28;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 } }, { { 1.0 } }, { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } }, { { 6.0 } }, { { 7.0 } } } }, { { { { { 8.0 } }, { { 9.0 } }, { { 10.0 } }, { { 11.0 } } } }, { { { 12.0 } }, { { 13.0 } }, { { 14.0 } }, { { 15.0 } } } } });
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
