  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const s3 &v1, const double &v2) {
    const s1 v5 = v1.p0;
    const std::vector<s0> v8 = v5.p1;
    const s0 v4 = v8[0];
    const std::vector<std::vector<double>> v3 = v4.p4;
    const std::vector<double> v14 = v3[0];
    const std::vector<double> v9 = v3[0];
    const double v36 = v14[0];
    double v17 = v2;
    const double v20 = v9[0];
    const double v44 = v14[0];
    const std::vector<double> v84 { v44, v17, v2, v36, v20, v2, v36 };
    const double v94 = v84[1];
    const double v98 = v94 + v94;
    return v98;
  }
  int main() {
    std::vector<s3> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 } }, { { 23.0 }, { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 } } } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } }, { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } } });
    s3 v1({ { { { { 40.0 }, { 41.0 } }, { { 42.0 } }, { { 43.0 }, { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } }, { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 } } } } }, { { { 70.0 }, { 71.0 } }, { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } }, { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } } });
    double v2(80.0);
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
