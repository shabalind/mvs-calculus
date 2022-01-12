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
  struct s4 {
    double p0;
    s1 p1;
    s4(double v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f55(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v6 = v4.p0;
    s0 v1 = v4;
    v1.p0 = v6;
    const std::vector<std::vector<double>> v10 = v1.p0;
    v1 = v4;
    const std::vector<std::vector<double>> v5 = v4.p1;
    const std::vector<std::vector<double>> v15 = v1.p0;
    v1.p1 = v5;
    const std::vector<s0> v24 { v0, v0, v1, v1, v1, v1, v1 };
    const s0 v23 = v24[6];
    const std::vector<std::vector<s0>> v25 { v24 };
    const std::vector<std::vector<double>> v22 = v0.p0;
    v1.p0 = v22;
    v4.p1 = v6;
    const std::vector<s0> v47 = v25[0];
    v4.p0 = v6;
    const std::vector<std::vector<double>> v34 = v1.p1;
    const std::vector<std::vector<std::vector<s0>>> v68 { v25, v25, v25 };
    std::vector<s0> v45 = v47;
    std::vector<s0> v48 = v45;
    const std::vector<std::vector<s0>> v33 = v68[0];
    std::vector<std::vector<s0>> v43 = v33;
    v4.p1 = v10;
    v1.p0 = v15;
    s0 v82 = v23;
    v45[4] = v82;
    const std::vector<std::vector<double>> v60 = v82.p0;
    v43[0] = v48;
    std::vector<std::vector<s0>> v93 = v43;
    v82.p0 = v60;
    const std::vector<s0> v66 = v93[0];
    v1.p0 = v34;
    const s0 v89 = v66[1];
    v4.p0 = v34;
    return v89;
  }
  s0 f17(const s0 &v0) {
    const s0 v8 = f55(v0);
    const s0 v12 = f55(v8);
    const std::vector<s0> v13 { v12, v12, v0, v0, v12, v8, v12 };
    const s0 v22 = v13[1];
    const s0 v18 = v13[1];
    const s0 v50 = v13[4];
    const std::vector<s0> v21 { v12, v0, v50, v22, v18 };
    const s0 v83 = v21[1];
    return v83;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const s4 &v2, const s4 &v3, const double &v4) {
    const s0 v5 = f17(v0);
    const double v8 = v2.p0;
    const double v9 = v4 - v8;
    const std::vector<std::vector<double>> v16 = v5.p1;
    const std::vector<double> v14 = v16[2];
    std::vector<double> v69 = v14;
    const double v52 = v69[0];
    const double v137 = v52 + v9;
    return v137;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } });
    s0 v1({ { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } });
    s4 v2({ 12.0, { { { { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 }, { 18.0 } } }, { { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 }, { 30.0 } } } }, { { { 31.0 }, { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 }, { 36.0 } } } } });
    s4 v3({ 37.0, { { { { { 38.0 }, { 39.0 }, { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 }, { 60.0 }, { 61.0 } } } } });
    double v4(62.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
