  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    std::vector<s0> p2;
    std::vector<s0> p3;
    s1(s0 v0, s0 v1, std::vector<s0> v2, std::vector<s0> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s1 p2;
    s0 p3;
    s0 p4;
    s1 p5;
    std::vector<s0> p6;
    s0 p7;
    s2(s0 v0, s1 v1, s1 v2, s0 v3, s0 v4, s1 v5, std::vector<s0> v6, s0 v7): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6), p7(v7) { }
  };
  struct s4 {
    s1 p0;
    s1 p1;
    s4(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s1 v2 = v0.p1;
    const s1 v5 = v0.p1;
    s1 v8 = v5;
    const std::vector<s1> v10 { v2 };
    const std::vector<s1> v3 { v2, v2, v5, v2, v8 };
    const s1 v4 = v3[1];
    s2 v9 = v0;
    std::vector<s1> v13 = v3;
    const s1 v14 = v10[0];
    std::vector<s1> v17 = v13;
    const std::vector<s0> v12 = v4.p3;
    const s0 v15 = v9.p7;
    v8.p0 = v15;
    s1 v11 = v2;
    const s0 v16 = v5.p0;
    v13[3] = v4;
    v11.p0 = v16;
    v17[0] = v8;
    const s0 v23 = v12[0];
    v13[2] = v8;
    const s0 v22 = v0.p0;
    const s1 v26 = v10[0];
    v13[0] = v11;
    const s0 v50 = v8.p0;
    const s1 v28 = v0.p5;
    v9.p1 = v4;
    const s4 v55(v5, v8);
    const s1 v21 = v55.p1;
    v8.p1 = v50;
    v9.p2 = v14;
    s2 v43 = v0;
    v11.p3 = v12;
    v9 = v43;
    s4 v32 = v55;
    v8 = v14;
    v43.p1 = v21;
    s1 v52 = v8;
    v52.p1 = v22;
    v8.p0 = v23;
    v32.p1 = v11;
    v52.p1 = v15;
    const s1 v61 = v32.p1;
    v43.p1 = v52;
    const std::vector<s0> v86 = v28.p2;
    v8 = v5;
    v52.p2 = v86;
    const s0 v44 = v9.p3;
    v32.p1 = v2;
    v9.p1 = v61;
    s0 v80 = v44;
    const std::vector<double> v137 = v80.p0;
    v32.p1 = v26;
    v32.p0 = v52;
    const s1 v119 = v17[3];
    s1 v97 = v119;
    const double v114 = v137[0];
    v32.p0 = v97;
    v17 = v13;
    return v114;
  }
  int main() {
    s2 v0({ { { 0.0 }, { { 1.0 }, { 2.0 } } }, { { { 3.0 }, { { 4.0 }, { 5.0 } } }, { { 6.0 }, { { 7.0 }, { 8.0 } } }, { { { 9.0 }, { { 10.0 }, { 11.0 } } }, { { 12.0 }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 }, { { 16.0 }, { 17.0 } } } } }, { { { 18.0 }, { { 19.0 }, { 20.0 } } }, { { 21.0 }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { { 25.0 }, { 26.0 } } }, { { 27.0 }, { { 28.0 }, { 29.0 } } } }, { { { 30.0 }, { { 31.0 }, { 32.0 } } } } }, { { 33.0 }, { { 34.0 }, { 35.0 } } }, { { 36.0 }, { { 37.0 }, { 38.0 } } }, { { { 39.0 }, { { 40.0 }, { 41.0 } } }, { { 42.0 }, { { 43.0 }, { 44.0 } } }, { { { 45.0 }, { { 46.0 }, { 47.0 } } }, { { 48.0 }, { { 49.0 }, { 50.0 } } } }, { { { 51.0 }, { { 52.0 }, { 53.0 } } } } }, { { { 54.0 }, { { 55.0 }, { 56.0 } } }, { { 57.0 }, { { 58.0 }, { 59.0 } } } }, { { 60.0 }, { { 61.0 }, { 62.0 } } } });
    double v1(63.0);
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
