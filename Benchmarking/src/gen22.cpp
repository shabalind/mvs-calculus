  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f23(const double &v0) {
    double v7 = v0;
    double v5 = v0;
    double v2 = v5;
    double v1 = v2;
    double v6 = v7;
    const double v4 = v6 / v7;
    double v8 = v4;
    double v19 = v4;
    v6 = v1;
    const double v15 = v8 / v19;
    const std::vector<double> v9 { v1, v6, v15, v19, v8, v1, v0 };
    std::vector<double> v35 = v9;
    const double v13 = v35[1];
    const std::vector<double> v25 { v1 };
    const double v31 = v25[0];
    const std::vector<std::vector<double>> v24 { v35, v35 };
    v35[6] = v13;
    const std::vector<double> v49 = v24[1];
    std::vector<double> v12 = v25;
    v35[5] = v4;
    const double v75 = v12[0];
    const double v43 = v49[1];
    v7 = v31;
    v35[3] = v75;
    return v43;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s0 &v1, const double &v2) {
    double v36 = v2;
    double v22 = v36;
    const double v15 = f23(v2);
    const double v40 = f23(v15);
    const double v25 = f23(v40);
    const double v28 = v2 / v22;
    const double v42 = v28 + v25;
    v36 = v28;
    return v42;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 } }, { { 1.0 } } } }, { { { 2.0 } }, { { 3.0 } } } } });
    s0 v1({ { { 4.0 } }, { { 5.0 } } });
    double v2(6.0);
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
