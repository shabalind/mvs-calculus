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
  double f38(const double &v0) {
    double v4 = v0;
    double v7 = v4;
    double v8 = v4;
    const double v6 = v0 + v8;
    double v5 = v4;
    double v2 = v5;
    const std::vector<double> v3 { v4, v2, v7, v4 };
    const double v1 = v3[2];
    const double v10 = v3[0];
    const double v9 = v0 / v4;
    const double v46 = v0 - v1;
    v5 = v1;
    std::vector<double> v11 = v3;
    double v18 = v0;
    double v12 = v7;
    const std::vector<std::vector<double>> v14 { v11 };
    const double v21 = v9 - v4;
    const std::vector<double> v17 = v14[0];
    double v29 = v6;
    double v34 = v18;
    v11[3] = v34;
    const double v24 = v17[2];
    const double v35 = v11[3];
    const std::vector<double> v45 { v24, v4, v29, v35, v10, v46, v4 };
    std::vector<double> v31 = v45;
    double v41 = v5;
    const double v57 = v9 / v12;
    v31[6] = v29;
    std::vector<double> v87 = v17;
    v11[3] = v6;
    const double v70 = v87[3];
    v11[3] = v41;
    v11[0] = v57;
    const double v49 = v45[6];
    std::vector<double> v80 = v31;
    v80[4] = v49;
    const double v82 = v80[0];
    v12 = v70;
    v11[1] = v21;
    return v82;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const std::vector<s0> &v2, const std::vector<s1> &v3, const std::vector<std::vector<s0>> &v4, const std::vector<s1> &v5, const std::vector<std::vector<s1>> &v6, const double &v7) {
    const double v8 = f38(v7);
    const double v30 = f38(v7);
    const double v32 = v8 + v7;
    const double v56 = v32 / v30;
    const std::vector<double> v34 { v56, v56 };
    const double v58 = v8 - v30;
    const double v98 = v34[0];
    const double v119 = v98 + v58;
    return v119;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } });
    std::vector<s0> v1({ { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } });
    std::vector<s0> v2({ { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } });
    std::vector<s1> v3({ { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } } } });
    std::vector<std::vector<s0>> v4({ { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } } });
    std::vector<s1> v5({ { { { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } }, { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } }, { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } } } }, { { { { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } }, { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } } } } });
    std::vector<std::vector<s1>> v6({ { { { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } } } }, { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } } } } }, { { { { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } } } }, { { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } }, { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 } } } } } }, { { { { { { { 116.0 }, { 117.0 }, { 118.0 } }, { { 119.0 } } } } }, { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 } } }, { { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 } } }, { { { 128.0 }, { 129.0 }, { 130.0 } }, { { 131.0 } } } } } } });
    double v7(132.0);
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
