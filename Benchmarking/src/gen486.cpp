  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f42(const double &v0) {
    double v4 = v0;
    const double v1 = v4 - v4;
    double v6 = v4;
    double v3 = v4;
    double v9 = v4;
    double v7 = v6;
    double v5 = v3;
    double v10 = v9;
    double v11 = v0;
    double v16 = v3;
    double v8 = v10;
    double v13 = v3;
    double v21 = v11;
    double v41 = v4;
    const double v19 = v16 - v7;
    double v25 = v5;
    double v70 = v41;
    double v35 = v25;
    double v23 = v1;
    double v31 = v8;
    double v53 = v31;
    v4 = v53;
    double v38 = v21;
    const std::vector<double> v51 { v19 };
    const std::vector<std::vector<double>> v40 { v51 };
    const std::vector<double> v66 = v40[0];
    std::vector<double> v43 = v66;
    const double v45 = v43[0];
    double v60 = v38;
    std::vector<double> v88 = v43;
    v88[0] = v9;
    v88[0] = v23;
    v43 = v88;
    v88[0] = v13;
    const double v36 = v35 * v45;
    v7 = v70;
    v88[0] = v60;
    v43[0] = v41;
    double v71 = v36;
    v43[0] = v38;
    return v71;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const double v7 = v1 * v1;
    double v3 = v7;
    const double v5 = f42(v3);
    double v57 = v5;
    return v57;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    double v1(8.0);
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
