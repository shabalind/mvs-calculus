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
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<s1> &v1, const double &v2) {
    const s1 v4 = v1[0];
    const std::vector<s0> v9 = v4.p1;
    const s1 v6 = v1[0];
    const s0 v5 = v6.p0;
    const s0 v12 = v9[2];
    const std::vector<std::vector<double>> v25 = v5.p1;
    s0 v29 = v12;
    double v21 = v2;
    v29.p1 = v25;
    const std::vector<std::vector<double>> v36 = v29.p0;
    const std::vector<double> v140 = v36[0];
    const double v95 = v140[0];
    const double v124 = v95 / v21;
    const std::vector<std::vector<double>> v168 = v29.p0;
    v29.p1 = v168;
    return v124;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 } }, { { 1.0 } } }, { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } } } }, { { { { { 16.0 } }, { { 17.0 } } }, { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } }, { { { { 24.0 } }, { { 25.0 } } }, { { { { 26.0 } }, { { 27.0 } } }, { { { 28.0 } }, { { 29.0 } } }, { { { 30.0 } }, { { 31.0 } } } } } } });
    std::vector<s1> v1({ { { { { 32.0 } }, { { 33.0 } } }, { { { { 34.0 } }, { { 35.0 } } }, { { { 36.0 } }, { { 37.0 } } }, { { { 38.0 } }, { { 39.0 } } } } } });
    double v2(40.0);
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
