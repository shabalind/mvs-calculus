  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f49(const double &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v8 = v1.p3;
    std::vector<std::vector<double>> v4 = v8;
    const std::vector<std::vector<double>> v3 = v1.p2;
    const std::vector<double> v13 = v4[0];
    const std::vector<double> v5 = v3[1];
    const double v7 = v13[0];
    v4[0] = v13;
    const std::vector<std::vector<double>> v6 = v1.p3;
    v4[0] = v5;
    const std::vector<double> v21 = v3[1];
    const std::vector<double> v20 = v3[0];
    v4[0] = v21;
    const std::vector<double> v18 = v6[1];
    v4[1] = v21;
    v4[1] = v20;
    double v48 = v7;
    v4[0] = v18;
    v4[1] = v20;
    return v48;
  }
  s2 f37(const s2 &v0) {
    s2 v2 = v0;
    s2 v6 = v2;
    s2 v3 = v6;
    const std::vector<s1> v4 = v0.p0;
    const s1 v1 = v4[0];
    v6.p0 = v4;
    v6.p0 = v4;
    v3.p0 = v4;
    v3.p1 = v1;
    return v3;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s2> &v1, const double &v2) {
    const std::vector<std::vector<double>> v4 = v0.p2;
    const std::vector<std::vector<double>> v3 = v0.p0;
    std::vector<std::vector<double>> v6 = v4;
    const double v11 = f49(v2, v0, v2);
    const std::vector<double> v8 = v6[1];
    v6 = v4;
    const double v7 = f49(v11, v0, v11);
    s0 v12 = v0;
    v12 = v0;
    v12.p1 = v6;
    const std::vector<std::vector<double>> v14 = v12.p1;
    const std::vector<std::vector<double>> v13 = v0.p3;
    const double v17 = v8[0];
    const s2 v16 = v1[0];
    const double v15 = f49(v7, v12, v17);
    std::vector<double> v19 = v8;
    const s2 v21 = f37(v16);
    const s1 v24 = v21.p1;
    std::vector<std::vector<double>> v30 = v13;
    std::vector<double> v25 = v8;
    std::vector<std::vector<double>> v26 = v30;
    const s0 v22 = v24.p1;
    v6[1] = v19;
    const double v29 = v19[0];
    const std::vector<double> v20 = v3[0];
    v12.p3 = v26;
    v25[0] = v15;
    const double v61 = v8[0];
    v30[0] = v8;
    std::vector<std::vector<double>> v47 = v3;
    const std::vector<std::vector<double>> v117 = v22.p0;
    const s0 v66 = v24.p1;
    const double v65 = f49(v17, v66, v29);
    v25[0] = v11;
    const std::vector<double> v50 = v47[0];
    std::vector<double> v40 = v20;
    const std::vector<double> v35 = v14[1];
    v40[0] = v61;
    v30[1] = v40;
    v26[1] = v19;
    const double v44 = v2 - v29;
    double v81 = v65;
    const double v63 = f49(v2, v22, v7);
    v40[0] = v81;
    v25 = v50;
    v19[0] = v44;
    v25[0] = v2;
    v47 = v117;
    v12.p0 = v47;
    v25[0] = v63;
    v6[1] = v35;
    const double v274 = v25[0];
    return v274;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } } });
    std::vector<s2> v1({ { { { { { { 7.0 } }, { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 } } }, { { { 14.0 } }, { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } } } } }, { { { { 21.0 } }, { { 22.0 }, { 23.0 } }, { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 } }, { { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } }, { { { { { { 35.0 } }, { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 } } } } }, { { { { 49.0 } }, { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 } }, { { 59.0 }, { 60.0 } }, { { 61.0 }, { 62.0 } } } } } });
    double v2(63.0);
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
