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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s0 p2;
    s2(std::vector<s0> v0, s1 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s1 p0;
    s1 p1;
    s3(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<std::vector<s1>> &v1, const s3 &v2, const s0 &v3, const s2 &v4, const std::vector<s3> &v5, const s2 &v6, const double &v7) {
    const std::vector<s1> v20 = v1[0];
    double v25 = v7;
    const s1 v18 = v20[0];
    const s0 v22 = v18.p0;
    const std::vector<std::vector<double>> v30 = v22.p0;
    std::vector<std::vector<double>> v61 = v30;
    double v43 = v7;
    std::vector<std::vector<double>> v28 = v61;
    const double v29 = v25 / v43;
    const double v137 = v29 * v43;
    const std::vector<double> v77 = v28[1];
    const double v128 = v77[0];
    const double v246 = v128 - v29;
    v43 = v246;
    return v137;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
    std::vector<std::vector<s1>> v1({ { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } } } }, { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } } } } } } });
    s3 v2({ { { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } } } } });
    s0 v3({ { { 33.0 }, { 34.0 } }, { { 35.0 } } });
    s2 v4({ { { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { { 42.0 }, { 43.0 } }, { { 44.0 } } }, { { { { { 45.0 }, { 46.0 } }, { { 47.0 } } } } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 } } } });
    std::vector<s3> v5({ { { { { { 51.0 }, { 52.0 } }, { { 53.0 } } }, { { { { { 54.0 }, { 55.0 } }, { { 56.0 } } } } } }, { { { { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { { { 60.0 }, { 61.0 } }, { { 62.0 } } } } } } } });
    s2 v6({ { { { { 63.0 }, { 64.0 } }, { { 65.0 } } }, { { { 66.0 }, { 67.0 } }, { { 68.0 } } } }, { { { { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { { { 72.0 }, { 73.0 } }, { { 74.0 } } } } } }, { { { 75.0 }, { 76.0 } }, { { 77.0 } } } });
    double v7(78.0);
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
