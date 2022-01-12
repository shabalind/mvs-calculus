  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f27(const double &v0) {
    double v7 = v0;
    double v3 = v7;
    double v4 = v3;
    const std::vector<double> v6 { v0, v3 };
    const double v2 = v6[1];
    const double v12 = v6[0];
    const double v15 = v6[1];
    v4 = v15;
    const std::vector<std::vector<double>> v8 { v6 };
    v4 = v12;
    const std::vector<double> v11 = v8[0];
    const std::vector<double> v13 = v8[0];
    const double v34 = v13[1];
    const std::vector<double> v48 { v4 };
    std::vector<double> v26 = v48;
    v26[0] = v15;
    const double v35 = v11[0];
    std::vector<double> v30 = v48;
    std::vector<double> v72 = v30;
    v72[0] = v35;
    std::vector<double> v100 = v72;
    v30[0] = v12;
    v100[0] = v34;
    v100[0] = v2;
    const std::vector<std::vector<double>> v64 { v26, v100 };
    const std::vector<double> v62 = v64[1];
    const double v142 = v62[0];
    return v142;
  }
  s0 f7(const s0 &v0, const s0 &v1) {
    const std::vector<s0> v6 { v1, v1, v1 };
    const std::vector<std::vector<double>> v7 = v1.p0;
    const std::vector<std::vector<double>> v2 = v1.p1;
    const s0 v4 = v6[1];
    const std::vector<std::vector<double>> v19 = v4.p1;
    std::vector<std::vector<double>> v21 = v19;
    const std::vector<double> v12 = v2[2];
    v21[1] = v12;
    const s0 v45(v7, v21);
    v21[0] = v12;
    const std::vector<double> v41 = v7[0];
    v21[1] = v41;
    return v45;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const s2 &v1, const double &v2) {
    const s0 v7 = v0.p1;
    double v8 = v2;
    const s0 v5 = f7(v7, v7);
    const double v10 = f27(v2);
    const std::vector<std::vector<double>> v16 = v5.p1;
    const std::vector<double> v12 = v16[2];
    v8 = v10;
    const double v144 = f27(v2);
    const double v43 = f27(v8);
    const double v69 = f27(v144);
    const double v88 = v12[0];
    const double v74 = v43 * v69;
    const double v145 = v88 - v74;
    return v145;
  }
  int main() {
    s2 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    s2 v1({ { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } });
    double v2(24.0);
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
