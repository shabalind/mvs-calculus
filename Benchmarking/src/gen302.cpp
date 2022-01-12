  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    std::vector<std::vector<double>> p2;
    double p3;
    s0(std::vector<std::vector<double>> v0, double v1, std::vector<std::vector<double>> v2, double v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    std::vector<s0> p1;
    s5(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<std::vector<double>> p0;
    s1 p1;
    s0 p2;
    s8(std::vector<std::vector<double>> v0, s1 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s11 {
    std::vector<s8> p0;
    std::vector<s5> p1;
    s11(std::vector<s8> v0, std::vector<s5> v1): p0(v0), p1(v1) { }
  };
  s0 f15(const s0 &v0) {
    const double v3 = v0.p1;
    s0 v8 = v0;
    s0 v6 = v0;
    double v1 = v3;
    v8.p1 = v3;
    const double v9 = v8.p1;
    const std::vector<std::vector<double>> v5 = v8.p2;
    std::vector<std::vector<double>> v2 = v5;
    const std::vector<std::vector<double>> v14 = v8.p0;
    const std::vector<double> v11 = v2[1];
    const std::vector<std::vector<double>> v25 = v6.p2;
    v6.p3 = v9;
    const std::vector<std::vector<double>> v10 = v6.p2;
    v2[0] = v11;
    const std::vector<double> v26 = v25[0];
    const double v18 = v26[0];
    const std::vector<std::vector<double>> v19 = v0.p0;
    const double v22 = v11[0];
    const std::vector<double> v24 = v19[1];
    v2[1] = v24;
    v8.p0 = v14;
    v6.p0 = v2;
    s0 v30 = v0;
    const std::vector<std::vector<double>> v45 = v6.p2;
    const double v49 = v30.p1;
    v8.p0 = v45;
    v6.p0 = v10;
    v30.p2 = v19;
    v30.p1 = v49;
    const std::vector<s0> v73 { v0, v0, v30, v8, v0, v6, v0 };
    const s0 v40 = v73[4];
    v6.p3 = v1;
    const double v78 = v6.p3;
    const std::vector<std::vector<double>> v62 = v40.p0;
    v30.p1 = v22;
    v6.p3 = v18;
    std::vector<s0> v74 = v73;
    v6.p2 = v62;
    const s0 v90 = v74[3];
    v6.p3 = v78;
    v30.p0 = v62;
    return v90;
  }
  __attribute__((noinline))
  double f0(const s11 &v0, const double &v1) {
    const std::vector<s8> v2 = v0.p0;
    const s8 v9 = v2[1];
    double v8 = v1;
    const std::vector<double> v6 { v1, v8, v8, v1, v1, v1 };
    std::vector<double> v10 = v6;
    const s0 v12 = v9.p2;
    double v15 = v1;
    v10[1] = v15;
    v10[1] = v15;
    std::vector<double> v18 = v10;
    double v39 = v15;
    const s0 v73 = f15(v12);
    v10[2] = v39;
    const double v70 = v18[5];
    const double v47 = v73.p1;
    v8 = v1;
    v10[1] = v47;
    return v70;
  }
  int main() {
    s11 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { { { { 3.0 }, { 4.0 } }, 5.0, { { 6.0 }, { 7.0 } }, 8.0 }, { { { 9.0 }, { 10.0 } }, 11.0, { { 12.0 }, { 13.0 } }, 14.0 } }, { { { { 15.0 }, { 16.0 } }, 17.0, { { 18.0 }, { 19.0 } }, 20.0 } } }, { { { 21.0 }, { 22.0 } }, 23.0, { { 24.0 }, { 25.0 } }, 26.0 } }, { { { 27.0 }, { 28.0 }, { 29.0 } }, { { { { { 30.0 }, { 31.0 } }, 32.0, { { 33.0 }, { 34.0 } }, 35.0 }, { { { 36.0 }, { 37.0 } }, 38.0, { { 39.0 }, { 40.0 } }, 41.0 } }, { { { { 42.0 }, { 43.0 } }, 44.0, { { 45.0 }, { 46.0 } }, 47.0 } } }, { { { 48.0 }, { 49.0 } }, 50.0, { { 51.0 }, { 52.0 } }, 53.0 } } }, { { { { { 54.0 }, { 55.0 } }, 56.0, { { 57.0 }, { 58.0 } }, 59.0 }, { { { { 60.0 }, { 61.0 } }, 62.0, { { 63.0 }, { 64.0 } }, 65.0 }, { { { 66.0 }, { 67.0 } }, 68.0, { { 69.0 }, { 70.0 } }, 71.0 }, { { { 72.0 }, { 73.0 } }, 74.0, { { 75.0 }, { 76.0 } }, 77.0 } } }, { { { { 78.0 }, { 79.0 } }, 80.0, { { 81.0 }, { 82.0 } }, 83.0 }, { { { { 84.0 }, { 85.0 } }, 86.0, { { 87.0 }, { 88.0 } }, 89.0 }, { { { 90.0 }, { 91.0 } }, 92.0, { { 93.0 }, { 94.0 } }, 95.0 }, { { { 96.0 }, { 97.0 } }, 98.0, { { 99.0 }, { 100.0 } }, 101.0 } } } } });
    double v1(102.0);
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
