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
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s4(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    s1 p1;
    s5(s4 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f57(const double &v0) {
    const std::vector<double> v6 { v0, v0, v0, v0, v0, v0 };
    std::vector<double> v1 = v6;
    const double v9 = v6[4];
    v1[4] = v9;
    const double v4 = v1[5];
    double v2 = v4;
    v1[3] = v2;
    double v3 = v0;
    v1[4] = v3;
    std::vector<double> v13 = v6;
    v13[2] = v2;
    std::vector<double> v5 = v13;
    v5[5] = v4;
    const double v11 = v6[1];
    const double v7 = v6[3];
    const double v16 = v6[5];
    double v25 = v9;
    std::vector<double> v23 = v6;
    v1[5] = v25;
    v23[5] = v7;
    double v21 = v16;
    std::vector<double> v27 = v1;
    std::vector<double> v17 = v5;
    const double v19 = v13[0];
    v5[1] = v3;
    std::vector<double> v37 = v27;
    const double v22 = v37[4];
    const double v46 = v17[4];
    const double v50 = v6[5];
    double v43 = v50;
    v13[4] = v22;
    double v26 = v21;
    std::vector<double> v24 = v23;
    std::vector<double> v29 = v5;
    const double v52 = v13[2];
    v5[2] = v43;
    const double v70 = v24[3];
    double v41 = v21;
    double v55 = v22;
    v24 = v27;
    double v61 = v55;
    v37[1] = v21;
    const double v33 = v29[1];
    std::vector<double> v59 = v29;
    std::vector<double> v42 = v1;
    v42[3] = v0;
    v37[2] = v4;
    const std::vector<std::vector<double>> v32 { v42, v17, v27 };
    std::vector<std::vector<double>> v77 = v32;
    v5[4] = v21;
    const std::vector<std::vector<std::vector<double>>> v68 { v77, v32, v77, v77, v77, v32 };
    v23[1] = v16;
    const std::vector<double> v80 = v77[1];
    v13[3] = v11;
    std::vector<double> v86 = v42;
    const std::vector<std::vector<double>> v89 = v68[0];
    v77 = v89;
    v29[2] = v3;
    v29[0] = v26;
    v5[0] = v0;
    v24[4] = v61;
    v5[4] = v19;
    v17[5] = v50;
    const double v62 = v80[3];
    std::vector<double> v157 = v86;
    v27[1] = v46;
    v17[5] = v50;
    v23 = v59;
    v42[3] = v70;
    const std::vector<double> v159 { v41, v50 };
    const double v91 = v159[0];
    v157 = v42;
    std::vector<double> v174 = v159;
    const double v127 = v52 * v33;
    v174[0] = v11;
    v23[0] = v91;
    v17[4] = v127;
    v1[3] = v46;
    const double v253 = v174[1];
    v13[1] = v21;
    v13[5] = v253;
    v77[0] = v157;
    return v62;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    const double v8 = f57(v1);
    const double v64 = f57(v1);
    const double v59 = v8 - v64;
    return v59;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } }, { { { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } }, { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } } }, { { { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } }, { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } }, { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } } }, { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } }, { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 }, { 113.0 } } } } } } }, { { { { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } }, { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } } } }, { { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } } } }, { { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 }, { 137.0 } } }, { { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } }, { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } } } } } });
    double v1(150.0);
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
