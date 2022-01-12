  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s0 p2;
    s1(std::vector<s0> v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s3(std::vector<s0> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    s3 p1;
    s4(s1 v0, s3 v1): p0(v0), p1(v1) { }
  };
  s4 f49(const s4 &v0) {
    s4 v44 = v0;
    s4 v73 = v44;
    return v73;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    double v7 = v1;
    const s4 v2 = f49(v0);
    const s3 v3 = v2.p1;
    const std::vector<s0> v9 = v3.p0;
    const s0 v6 = v9[1];
    const std::vector<std::vector<double>> v35 = v6.p2;
    const std::vector<double> v26 = v35[0];
    const double v31 = v26[0];
    const double v82 = v31 - v7;
    return v82;
  }
  int main() {
    s4 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 } } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 } }, { { 14.0 } } } }, { { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } }, { { 24.0 } } } }, { { { { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 } }, { { 29.0 } } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 } }, { { 34.0 } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 } }, { { 39.0 } } } } } } } });
    double v1(40.0);
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
