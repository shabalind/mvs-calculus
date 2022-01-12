  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    std::vector<s1> p1;
    s4(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s2> p0;
    s0 p1;
    s5(std::vector<s2> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f60(const double &v0) {
    double v6 = v0;
    double v1 = v6;
    double v4 = v6;
    double v3 = v6;
    v3 = v6;
    const double v21 = v4 - v6;
    double v7 = v4;
    const std::vector<double> v5 { v4 };
    std::vector<double> v17 = v5;
    std::vector<double> v16 = v5;
    v17 = v5;
    double v10 = v7;
    const double v19 = v17[0];
    const std::vector<std::vector<double>> v11 { v16, v5, v16, v17 };
    const double v18 = v5[0];
    v17[0] = v3;
    v17[0] = v21;
    std::vector<std::vector<double>> v45 = v11;
    v17[0] = v7;
    v17[0] = v6;
    v7 = v19;
    v16[0] = v19;
    const std::vector<double> v41 = v45[3];
    v45[1] = v17;
    double v24 = v10;
    std::vector<std::vector<double>> v32 = v45;
    std::vector<double> v28 = v5;
    const std::vector<double> v38 = v45[0];
    std::vector<std::vector<double>> v26 = v32;
    const double v39 = v16[0];
    v17[0] = v4;
    std::vector<std::vector<double>> v30 = v26;
    v26[2] = v38;
    v16[0] = v4;
    const double v31 = v18 / v1;
    v17 = v28;
    const double v27 = v31 + v24;
    v17[0] = v18;
    v6 = v24;
    std::vector<double> v40 = v41;
    const std::vector<double> v81 = v30[2];
    v4 = v27;
    v28[0] = v39;
    v32[1] = v40;
    const double v90 = v81[0];
    return v90;
  }
  double f18(const double &v0) {
    const double v5 = f60(v0);
    double v1 = v0;
    double v2 = v5;
    v1 = v5;
    const double v3 = v5 + v5;
    double v4 = v2;
    const double v8 = f60(v4);
    const std::vector<double> v11 { v2, v5, v8, v1, v4, v3 };
    const double v9 = v11[5];
    const double v13 = f60(v9);
    std::vector<double> v32 = v11;
    v32[0] = v13;
    const std::vector<std::vector<double>> v39 { v32, v11, v32, v32, v11, v11 };
    std::vector<std::vector<double>> v33 = v39;
    const std::vector<double> v43 = v39[1];
    std::vector<std::vector<double>> v38 = v33;
    const std::vector<double> v125 = v38[2];
    std::vector<double> v57 = v125;
    const double v124 = v57[1];
    v32 = v43;
    v57 = v11;
    const double v130 = f60(v124);
    return v130;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const std::vector<s5> &v1, const s1 &v2, const s5 &v3, const s4 &v4, const std::vector<s0> &v5, const std::vector<s0> &v6, const double &v7) {
    const s0 v12 = v6[1];
    const std::vector<std::vector<double>> v9 = v12.p1;
    const std::vector<double> v10 = v9[1];
    const double v57 = v10[0];
    const double v134 = f18(v57);
    double v180 = v134;
    return v180;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } });
    std::vector<s5> v1({ { { { { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 } } }, { { { 39.0 } }, { { 40.0 }, { 41.0 } } } } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { { { { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 } } }, { { { 51.0 } }, { { 52.0 }, { 53.0 } } }, { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } } }, { { { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { { { { 60.0 } }, { { 61.0 }, { 62.0 } } }, { { { { 63.0 } }, { { 64.0 }, { 65.0 } } }, { { { 66.0 } }, { { 67.0 }, { 68.0 } } }, { { { 69.0 } }, { { 70.0 }, { 71.0 } } } } } }, { { { 72.0 } }, { { 73.0 }, { 74.0 } } } } });
    s1 v2({ { { { { { 75.0 } }, { { 76.0 }, { 77.0 } } } }, { { { { 78.0 } }, { { 79.0 }, { 80.0 } } } } }, { { { 81.0 } }, { { 82.0 }, { 83.0 } } } });
    s5 v3({ { { { { { 84.0 } }, { { 85.0 }, { 86.0 } } }, { { { { 87.0 } }, { { 88.0 }, { 89.0 } } }, { { { 90.0 } }, { { 91.0 }, { 92.0 } } }, { { { 93.0 } }, { { 94.0 }, { 95.0 } } } } } }, { { { 96.0 } }, { { 97.0 }, { 98.0 } } } });
    s4 v4({ { { { { { { 99.0 } }, { { 100.0 }, { 101.0 } } } }, { { { { 102.0 } }, { { 103.0 }, { 104.0 } } } } }, { { { 105.0 } }, { { 106.0 }, { 107.0 } } } }, { { { { { { { 108.0 } }, { { 109.0 }, { 110.0 } } } }, { { { { 111.0 } }, { { 112.0 }, { 113.0 } } } } }, { { { 114.0 } }, { { 115.0 }, { 116.0 } } } } } });
    std::vector<s0> v5({ { { { 117.0 } }, { { 118.0 }, { 119.0 } } }, { { { 120.0 } }, { { 121.0 }, { 122.0 } } } });
    std::vector<s0> v6({ { { { 123.0 } }, { { 124.0 }, { 125.0 } } }, { { { 126.0 } }, { { 127.0 }, { 128.0 } } } });
    double v7(129.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
