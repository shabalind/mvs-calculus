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
    std::vector<s0> p2;
    s1(s0 v0, std::vector<s0> v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s3> p0;
    std::vector<s1> p1;
    s4(std::vector<s3> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    double v5 = v1;
    const double v2 = v1 - v1;
    const std::vector<double> v15 { v1, v2, v1 };
    std::vector<double> v13 = v15;
    v5 = v2;
    double v30 = v5;
    v13[0] = v2;
    v13[1] = v5;
    double v46 = v30;
    v13[2] = v46;
    v13[1] = v30;
    const double v124 = v13[0];
    return v124;
  }
  int main() {
    s4 v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { { 8.0 } }, { { 9.0 } } }, { { { { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 } } } } }, { { { 14.0 } }, { { 15.0 } } } }, { { { { { 16.0 } }, { { 17.0 } } }, { { { { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 } } } } }, { { { 22.0 } }, { { 23.0 } } } } }, { { { { { 24.0 } }, { { 25.0 } } }, { { { { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 } } } } }, { { { { 30.0 } }, { { 31.0 } } }, { { { { 32.0 } }, { { 33.0 } } } }, { { { { 34.0 } }, { { 35.0 } } } } }, { { { { 36.0 } }, { { 37.0 } } }, { { { { 38.0 } }, { { 39.0 } } } }, { { { { 40.0 } }, { { 41.0 } } } } } } });
    double v1(42.0);
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
