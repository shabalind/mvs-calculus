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
    std::vector<s1> p0;
    s0 p1;
    std::vector<s0> p2;
    s2(std::vector<s1> v0, s0 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  double f22(const double &v0) {
    double v2 = v0;
    double v7 = v0;
    double v5 = v2;
    double v1 = v7;
    double v4 = v5;
    v2 = v1;
    return v4;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const std::vector<std::vector<s1>> &v2, const std::vector<std::vector<s2>> &v3, const std::vector<s0> &v4, const double &v5) {
    const double v9 = v5 - v5;
    const double v12 = f22(v5);
    const double v22 = v9 - v12;
    const double v180 = v22 + v9;
    return v180;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } });
    std::vector<s0> v1({ { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } });
    std::vector<std::vector<s1>> v2({ { { { { { { { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 } } } } }, { { { 14.0 } }, { { 15.0 } } } } } });
    std::vector<std::vector<s2>> v3({ { { { { { { { { { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 } } } } }, { { { 20.0 } }, { { 21.0 } } } }, { { { { { { 22.0 } }, { { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 } } } } }, { { { 26.0 } }, { { 27.0 } } } } }, { { { 28.0 } }, { { 29.0 } } }, { { { { 30.0 } }, { { 31.0 } } } } } }, { { { { { { { { { 32.0 } }, { { 33.0 } } } }, { { { { 34.0 } }, { { 35.0 } } } } }, { { { 36.0 } }, { { 37.0 } } } }, { { { { { { 38.0 } }, { { 39.0 } } } }, { { { { 40.0 } }, { { 41.0 } } } } }, { { { 42.0 } }, { { 43.0 } } } } }, { { { 44.0 } }, { { 45.0 } } }, { { { { 46.0 } }, { { 47.0 } } } } } } });
    std::vector<s0> v4({ { { { 48.0 } }, { { 49.0 } } } });
    double v5(50.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
