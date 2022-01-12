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
    std::vector<s0> p1;
    s0 p2;
    s0 p3;
    s0 p4;
    s1(s0 v0, std::vector<s0> v1, s0 v2, s0 v3, s0 v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s0 p1;
    std::vector<s0> p2;
    std::vector<s0> p3;
    s2 p4;
    s3(std::vector<s1> v0, s0 v1, std::vector<s0> v2, std::vector<s0> v3, s2 v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  double f31(const double &v0) {
    const double v4 = v0 + v0;
    const std::vector<double> v2 { v4, v0, v4, v0 };
    std::vector<double> v7 = v2;
    v7 = v2;
    double v5 = v4;
    const double v9 = v7[0];
    std::vector<double> v10 = v7;
    v10 = v7;
    v10[2] = v9;
    std::vector<double> v20 = v7;
    const double v24 = v20[2];
    const double v15 = v10[3];
    const double v17 = v10[3];
    v10[3] = v17;
    v7[1] = v15;
    v7[2] = v15;
    double v57 = v24;
    const double v31 = v17 * v4;
    v7[3] = v5;
    v10[0] = v57;
    return v31;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const double &v1) {
    const std::vector<double> v3 { v1, v1, v1, v1 };
    const double v5 = f31(v1);
    const double v4 = f31(v5);
    const double v10 = v3[0];
    const double v17 = f31(v4);
    const double v15 = v3[0];
    double v47 = v17;
    const double v46 = v10 * v15;
    const double v73 = v46 + v47;
    return v73;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } }, { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } }, { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } }, { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } }, { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } } }, { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } } }, { { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } } } } } });
    double v1(112.0);
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
