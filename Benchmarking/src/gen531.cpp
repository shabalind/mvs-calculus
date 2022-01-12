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
    double p1;
    s1(s0 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s2(std::vector<s1> v0): p0(v0) { }
  };
  struct s4 {
    s1 p0;
    s2 p1;
    s4(s1 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s0 p0;
    s4 p1;
    s8(s0 v0, s4 v1): p0(v0), p1(v1) { }
  };
  double f24(const double &v0) {
    const std::vector<double> v1 { v0 };
    double v5 = v0;
    const double v3 = v1[0];
    std::vector<double> v8 = v1;
    std::vector<double> v7 = v8;
    std::vector<double> v2 = v8;
    v2[0] = v0;
    double v9 = v3;
    const double v6 = v1[0];
    v2[0] = v6;
    std::vector<double> v4 = v7;
    const double v13 = v8[0];
    std::vector<double> v34 = v4;
    std::vector<double> v18 = v8;
    const double v12 = v4[0];
    double v17 = v6;
    v8[0] = v12;
    const double v23 = v34[0];
    double v16 = v13;
    const double v31 = v2[0];
    v34[0] = v13;
    v8[0] = v5;
    v18[0] = v31;
    const double v27 = v18[0];
    v8 = v4;
    v18[0] = v27;
    const std::vector<double> v14 { v17, v27 };
    std::vector<double> v28 = v4;
    v4[0] = v16;
    std::vector<double> v40 = v28;
    std::vector<double> v37 = v2;
    v7[0] = v0;
    const double v22 = v18[0];
    std::vector<double> v59 = v40;
    std::vector<double> v79 = v14;
    double v41 = v22;
    const double v38 = v2[0];
    v8[0] = v6;
    const double v35 = v79[0];
    const double v89 = v7[0];
    const std::vector<std::vector<double>> v119 { v59, v37, v40, v34, v7 };
    v7[0] = v27;
    v7[0] = v35;
    v4[0] = v89;
    v2[0] = v41;
    v37[0] = v38;
    v34[0] = v27;
    v34[0] = v23;
    std::vector<double> v51 = v14;
    const std::vector<double> v117 = v119[2];
    v8[0] = v12;
    const double v63 = v51[0];
    v37[0] = v63;
    v2[0] = v9;
    v40[0] = v13;
    v40[0] = v35;
    v51[0] = v38;
    const double v125 = v117[0];
    return v125;
  }
  __attribute__((noinline))
  double f0(const std::vector<s8> &v0, const double &v1) {
    const s8 v8 = v0[1];
    const s0 v2 = v8.p0;
    const std::vector<std::vector<double>> v13 = v2.p0;
    const std::vector<double> v15 = v13[0];
    const double v73 = v15[0];
    const double v45 = f24(v73);
    const double v48 = f24(v45);
    return v48;
  }
  int main() {
    std::vector<s8> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, 10.0 }, { { { { { { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, 16.0 } } } } }, { { { { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } } }, { { { { { 22.0 }, { 23.0 } }, { { 24.0 }, { 25.0 }, { 26.0 } } }, 27.0 }, { { { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 }, { 32.0 } } }, 33.0 } } } } }, { { { { 34.0 }, { 35.0 } }, { { 36.0 }, { 37.0 }, { 38.0 } } }, { { { { { 39.0 }, { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, 44.0 }, { { { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } }, 50.0 } } } } } });
    double v1(51.0);
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
