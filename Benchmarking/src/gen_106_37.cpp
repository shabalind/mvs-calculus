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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s1> p0;
    s7(std::vector<s1> v0): p0(v0) { }
  };
  double f5(const double &v0) {
    double v4 = v0;
    double v1 = v4;
    const double v7 = v4 + v0;
    double v3 = v4;
    v4 = v3;
    double v2 = v1;
    double v6 = v3;
    v2 = v0;
    double v11 = v2;
    v3 = v4;
    double v5 = v2;
    double v13 = v11;
    double v17 = v3;
    double v15 = v6;
    double v18 = v11;
    double v30 = v17;
    v17 = v30;
    double v51 = v15;
    double v21 = v13;
    double v33 = v15;
    double v40 = v15;
    double v42 = v15;
    double v59 = v21;
    double v108 = v5;
    const std::vector<double> v39 { v7, v42, v51, v59, v17, v18, v33 };
    v15 = v11;
    std::vector<double> v92 = v39;
    v92[5] = v40;
    v92[3] = v0;
    v92[3] = v108;
    const double v63 = v92[6];
    v92[6] = v108;
    return v63;
  }
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const double &v1) {
    const double v7 = f5(v1);
    const std::vector<double> v8 { v7, v1, v7, v7, v1 };
    const double v24 = f5(v7);
    const double v22 = v8[3];
    const double v30 = f5(v22);
    double v190 = v24;
    double v96 = v190;
    const double v55 = v30 - v96;
    return v55;
  }
  int main() {
    std::vector<s7> v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } } }, { { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } } } }, { { { { { { 16.0 } }, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } } } });
    double v1(24.0);
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
