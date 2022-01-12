  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f44(const std::vector<double> &v0) {
    std::vector<double> v5 = v0;
    std::vector<double> v6 = v0;
    const std::vector<std::vector<double>> v2 { v5 };
    const std::vector<double> v1 = v2[0];
    std::vector<double> v3 = v6;
    std::vector<std::vector<double>> v13 = v2;
    v13[0] = v5;
    v13[0] = v1;
    v13[0] = v1;
    v13[0] = v3;
    const std::vector<double> v23 = v2[0];
    std::vector<double> v16 = v3;
    v13[0] = v23;
    const double v21 = v16[0];
    const std::vector<double> v12 = v13[0];
    v6[0] = v21;
    return v12;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const double &v2) {
    const double v6 = v2 / v2;
    const s0 v8 = v1[0];
    const s0 v10 = v1[1];
    const std::vector<std::vector<double>> v44 = v8.p1;
    const std::vector<double> v58 = v44[0];
    double v52 = v6;
    const std::vector<std::vector<double>> v62 = v10.p1;
    const std::vector<double> v66 = v62[0];
    const double v107 = v66[0];
    const std::vector<double> v57 = f44(v58);
    const double v65 = v52 - v107;
    const double v100 = v57[0];
    const double v138 = v100 / v65;
    return v138;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
    std::vector<s0> v1({ { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } });
    double v2(12.0);
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
