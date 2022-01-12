  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f40(const double &v0) {
    double v2 = v0;
    double v8 = v2;
    double v7 = v2;
    double v3 = v8;
    const std::vector<double> v15 { v0, v3 };
    std::vector<double> v13 = v15;
    v13[1] = v7;
    v13[1] = v2;
    std::vector<double> v14 = v13;
    std::vector<double> v11 = v15;
    std::vector<double> v20 = v14;
    const double v37 = v11[0];
    const double v66 = v20[1];
    v13[1] = v37;
    return v66;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    double v8 = v1;
    const double v6 = v1 + v1;
    double v3 = v6;
    double v21 = v1;
    const double v93 = f40(v21);
    const double v43 = f40(v8);
    double v100 = v93;
    const std::vector<double> v44 { v6, v93, v1, v100, v3, v43 };
    double v276 = v6;
    v8 = v276;
    std::vector<double> v138 = v44;
    v3 = v6;
    const double v118 = v138[4];
    return v118;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
    double v1(3.0);
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
