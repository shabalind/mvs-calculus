  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s1 p0;
    std::vector<s0> p1;
    s7(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f28(const double &v0) {
    const double v2 = v0 / v0;
    double v3 = v0;
    double v7 = v0;
    double v8 = v3;
    double v6 = v0;
    double v13 = v2;
    double v5 = v8;
    double v1 = v13;
    const double v11 = v6 - v7;
    double v19 = v1;
    double v10 = v5;
    double v4 = v3;
    double v9 = v4;
    double v17 = v19;
    double v21 = v9;
    double v14 = v4;
    double v29 = v0;
    double v18 = v10;
    double v30 = v13;
    v14 = v10;
    double v41 = v29;
    const double v23 = v1 - v21;
    double v27 = v14;
    const std::vector<double> v48 { v14, v18, v30, v10, v6, v11 };
    double v56 = v23;
    const std::vector<double> v46 { v41, v3 };
    const double v40 = v48[2];
    std::vector<double> v57 = v48;
    v57[2] = v17;
    std::vector<double> v55 = v57;
    v55[3] = v19;
    const double v72 = v40 - v7;
    v55 = v48;
    const double v32 = v46[0];
    const double v26 = v55[3];
    v55[2] = v27;
    const double v122 = v56 + v6;
    v57[5] = v32;
    const double v141 = v72 / v26;
    v14 = v122;
    v8 = v3;
    return v141;
  }
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const double &v1) {
    const double v4 = f28(v1);
    const double v3 = f28(v1);
    const double v11 = v4 + v3;
    const double v30 = v11 + v4;
    return v30;
  }
  int main() {
    std::vector<s7> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } } });
    double v1(20.0);
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
