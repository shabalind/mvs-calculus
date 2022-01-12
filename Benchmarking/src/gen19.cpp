  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v6 = v1.p0;
    const std::vector<std::vector<double>> v3 = v1.p0;
    const std::vector<std::vector<double>> v9 = v0.p1;
    const std::vector<double> v4 = v6[0];
    double v8 = v2;
    const std::vector<double> v18 = v9[1];
    const std::vector<double> v12 = v3[0];
    double v19 = v2;
    const double v17 = v12[0];
    double v28 = v8;
    v8 = v2;
    const double v25 = v19 * v2;
    const double v41 = v25 + v25;
    const double v29 = v18[0];
    const double v38 = v4[0];
    const std::vector<double> v45 { v28, v41, v17, v38, v28, v29, v41 };
    std::vector<double> v51 = v45;
    const std::vector<std::vector<double>> v59 { v51, v51, v45, v45, v45 };
    const std::vector<double> v90 = v59[1];
    const double v116 = v90[4];
    return v116;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } });
    s0 v1({ { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } });
    double v2(8.0);
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
