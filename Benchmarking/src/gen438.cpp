  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    std::vector<std::vector<double>> p6;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5, std::vector<std::vector<double>> v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f18(const double &v0) {
    double v1 = v0;
    double v6 = v0;
    double v5 = v6;
    double v2 = v6;
    double v7 = v0;
    v5 = v2;
    double v4 = v1;
    const std::vector<double> v13 { v1, v6, v0 };
    const double v14 = v13[1];
    const double v8 = v13[1];
    const double v17 = v13[1];
    std::vector<double> v10 = v13;
    v10[1] = v0;
    v10[1] = v4;
    const double v32 = v13[1];
    std::vector<double> v19 = v13;
    v10[0] = v0;
    double v45 = v14;
    std::vector<double> v15 = v10;
    const double v46 = v10[1];
    double v22 = v32;
    v10[0] = v17;
    const double v29 = v15[2];
    v19[1] = v46;
    const double v30 = v13[1];
    v10[1] = v8;
    const std::vector<double> v41 { v29, v30, v45, v22, v7, v5 };
    std::vector<double> v43 = v41;
    const double v25 = v43[5];
    const double v31 = v41[3];
    const double v33 = v19[2];
    v43[2] = v25;
    v43[2] = v33;
    const double v39 = v43[3];
    double v27 = v5;
    v43[5] = v27;
    const double v56 = v25 + v39;
    v15[2] = v31;
    v19[1] = v2;
    v2 = v6;
    return v56;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const double v4 = f18(v1);
    const double v6 = f18(v4);
    const double v30 = v6 * v6;
    double v66 = v6;
    double v19 = v66;
    v19 = v30;
    return v19;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } }, { { 10.0 } }, { { 11.0 } }, { { 12.0 }, { 13.0 } } }, { { { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } }, { { 24.0 } }, { { 25.0 } }, { { 26.0 }, { 27.0 } } } } });
    double v1(28.0);
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
