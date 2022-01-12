  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s2 p1;
    s0 p2;
    s4(s0 v0, s2 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f86(const s0 &v0, const s0 &v1) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<double> v4 = v3[0];
    const std::vector<std::vector<double>> v7 = v5.p0;
    const std::vector<std::vector<double>> v2 = v5.p1;
    v5.p1 = v7;
    const std::vector<std::vector<double>> v13 = v1.p1;
    const std::vector<double> v10 = v3[0];
    const std::vector<double> v19 = v3[0];
    const std::vector<double> v12 = v2[0];
    v5.p0 = v3;
    std::vector<std::vector<double>> v18 = v13;
    const std::vector<std::vector<double>> v11 = v0.p0;
    s0 v30 = v5;
    v18[0] = v19;
    const std::vector<double> v21 = v11[0];
    v18[0] = v19;
    const std::vector<double> v23 = v3[0];
    v18[0] = v21;
    const std::vector<std::vector<double>> v24 { v10, v21, v4, v23, v12, v23, v4 };
    s0 v35 = v30;
    v30.p0 = v18;
    const std::vector<double> v71 = v24[1];
    v18[0] = v71;
    v35.p1 = v2;
    return v35;
  }
  s0 f62(const s0 &v0) {
    const s0 v5 = f86(v0, v0);
    const s0 v10 = f86(v5, v5);
    return v10;
  }
  double f17(const s2 &v0, const double &v1) {
    double v2 = v1;
    const s0 v5 = v0.p0;
    const s0 v7 = f62(v5);
    const s0 v9 = f86(v5, v7);
    const std::vector<std::vector<double>> v6 = v9.p0;
    const std::vector<double> v12 = v6[0];
    std::vector<double> v24 = v12;
    v24[0] = v2;
    const double v25 = v24[0];
    v24[0] = v25;
    double v55 = v25;
    const double v49 = v12[0];
    v24[0] = v49;
    return v55;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<s4> &v1, const double &v2) {
    double v55 = v2;
    const s2 v15 = v0[0];
    const double v23 = v55 + v2;
    const std::vector<double> v14 { v23, v23, v23 };
    std::vector<double> v47 = v14;
    const double v16 = f17(v15, v23);
    const double v42 = v47[0];
    v47[2] = v42;
    v55 = v23;
    v47[2] = v16;
    v55 = v42;
    const double v121 = v23 / v42;
    v47[2] = v23;
    return v121;
  }
  int main() {
    std::vector<s2> v0({ { { { { 0.0 } }, { { 1.0 } } }, { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { { 16.0 } }, { { 17.0 } } }, { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } } });
    std::vector<s4> v1({ { { { { 24.0 } }, { { 25.0 } } }, { { { { 26.0 } }, { { 27.0 } } }, { { { { 28.0 } }, { { 29.0 } } }, { { { 30.0 } }, { { 31.0 } } }, { { { 32.0 } }, { { 33.0 } } } } }, { { { 34.0 } }, { { 35.0 } } } } });
    double v2(36.0);
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
