  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    s0(std::vector<double> v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const s0 &v2, const double &v3) {
    s0 v5 = v2;
    const std::vector<double> v4 = v5.p0;
    const std::vector<double> v9 = v1.p0;
    const double v7 = v4[0];
    const std::vector<double> v13 = v1.p0;
    const double v6 = v3 - v7;
    const double v11 = v13[0];
    std::vector<double> v12 = v4;
    const double v34 = v4[0];
    std::vector<double> v21 = v4;
    double v15 = v6;
    v12[0] = v34;
    v21[0] = v11;
    v5.p0 = v9;
    v21[0] = v11;
    const double v28 = v12[0];
    v21[0] = v28;
    v5.p0 = v12;
    const double v29 = v21[0];
    const double v57 = v15 / v29;
    v12[0] = v11;
    v5.p0 = v12;
    return v57;
  }
  int main() {
    s0 v0({ { 0.0 } });
    s0 v1({ { 1.0 } });
    s0 v2({ { 2.0 } });
    double v3(3.0);
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
