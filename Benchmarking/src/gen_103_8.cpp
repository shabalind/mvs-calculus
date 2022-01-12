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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s1>> p1;
    s2(s0 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    std::vector<s1> p1;
    s4(s3 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s1 p0;
    std::vector<std::vector<s2>> p1;
    s6(s1 v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  double f92(const double &v0) {
    double v11 = v0;
    double v15 = v11;
    const double v18 = v15 / v11;
    return v18;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const std::vector<std::vector<s4>> &v1, const double &v2) {
    const double v5 = f92(v2);
    const double v9 = f92(v5);
    const double v36 = v9 * v2;
    return v36;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { 0.0, 1.0, 2.0 }, { { 3.0 } } }, { { { { 4.0, 5.0, 6.0 }, { { 7.0 } } } }, { { { 8.0, 9.0, 10.0 }, { { 11.0 } } } } } }, { { { { { 12.0, 13.0, 14.0 }, { { 15.0 } } }, { { { { { 16.0, 17.0, 18.0 }, { { 19.0 } } }, { { { { 20.0, 21.0, 22.0 }, { { 23.0 } } } }, { { { 24.0, 25.0, 26.0 }, { { 27.0 } } } } } } }, { { { { 28.0, 29.0, 30.0 }, { { 31.0 } } }, { { { { 32.0, 33.0, 34.0 }, { { 35.0 } } } }, { { { 36.0, 37.0, 38.0 }, { { 39.0 } } } } } } } } } } } } } });
    std::vector<std::vector<s4>> v1({ { { { { { { 40.0, 41.0, 42.0 }, { { 43.0 } } }, { { { { 44.0, 45.0, 46.0 }, { { 47.0 } } } }, { { { 48.0, 49.0, 50.0 }, { { 51.0 } } } } } }, { { 52.0, 53.0, 54.0 }, { { 55.0 } } } }, { { { { 56.0, 57.0, 58.0 }, { { 59.0 } } }, { { { { 60.0, 61.0, 62.0 }, { { 63.0 } } } }, { { { 64.0, 65.0, 66.0 }, { { 67.0 } } } } } } } } } });
    double v2(68.0);
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
