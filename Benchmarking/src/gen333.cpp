  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s2> p1;
    s3(s1 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const s3 &v1, const double &v2) {
    const s1 v6 = v0.p0;
    double v5 = v2;
    const std::vector<s0> v10 = v6.p1;
    double v16 = v5;
    double v26 = v5;
    double v28 = v26;
    const s0 v40 = v10[0];
    const std::vector<double> v35 = v40.p1;
    const double v82 = v35[0];
    double v59 = v16;
    v59 = v82;
    const double v180 = v28 - v59;
    return v180;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0 } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { 7.0 } } } }, { { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { 11.0 } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { 15.0 } } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { 19.0 } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { 23.0 } } } } } } });
    s3 v1({ { { { { 24.0 }, { 25.0 }, { 26.0 } }, { 27.0 } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { 31.0 } } } }, { { { { { { 32.0 }, { 33.0 }, { 34.0 } }, { 35.0 } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { 43.0 } }, { { { { 44.0 }, { 45.0 }, { 46.0 } }, { 47.0 } } } } } } });
    double v2(48.0);
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
