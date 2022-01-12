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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f11(const double &v0) {
    double v4 = v0;
    double v6 = v4;
    v6 = v0;
    v6 = v4;
    double v3 = v6;
    double v10 = v3;
    double v1 = v4;
    double v5 = v6;
    const double v7 = v1 - v0;
    v6 = v4;
    double v15 = v7;
    double v12 = v5;
    const std::vector<double> v9 { v15, v6, v12, v4 };
    const double v17 = v9[0];
    std::vector<double> v25 = v9;
    v25[3] = v17;
    v25[2] = v10;
    std::vector<double> v31 = v25;
    v25[0] = v15;
    const double v40 = v31[2];
    return v40;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<std::vector<s3>> &v1, const std::vector<std::vector<s1>> &v2, const double &v3) {
    const double v8 = f11(v3);
    double v9 = v8;
    const double v18 = f11(v9);
    const double v26 = f11(v18);
    return v26;
  }
  int main() {
    s2 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } });
    std::vector<std::vector<s3>> v1({ { { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } } }, { { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } } }, { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } });
    std::vector<std::vector<s1>> v2({ { { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } } } });
    double v3(68.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
